package org.javaz.copse.oauth;

import com.google.api.client.auth.oauth2.*;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.MemoryDataStoreFactory;
import org.javaz.copse.logic.iface.*;
import org.javaz.copse.logic.impl.AbstractHandler;
import org.javaz.copse.logic.impl.AnswerData;
import org.javaz.copse.model.iface.MenuItemI;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 */
public class OauthHandler extends AbstractHandler {
    @Override
    public AbstractHandler createNewInstance() {
        return new OauthHandler();
    }

    private static final Lock lock = new ReentrantLock();
    private static AuthorizationCodeFlow flow;
    private boolean replaceHttpWithHttps = false;

    @Override
    public void init(String config) {
        JacksonFactory instance = JacksonFactory.getDefaultInstance();
        try {
            JsonParser parser = instance.createJsonParser(config);
            Map configData = parser.parse(HashMap.class);
            OAUTH_CLIENT_ID = (String) configData.get("OAUTH_CLIENT_ID");
            OAUTH_SECRET = (String) configData.get("OAUTH_SECRET");
            if (configData.containsKey("successRedirect")) {
                successRedirect = (String) configData.get("successRedirect");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String OAUTH_CLIENT_ID = "";
    private String OAUTH_SECRET = "";
    private String phase1Marker = "os";
    private String phase2Marker = "oc";
    private String successRedirect = "/copse/";

    protected AuthorizationCodeFlow initializeFlow() throws IOException {
        return new GoogleAuthorizationCodeFlow.Builder(
                new NetHttpTransport(), JacksonFactory.getDefaultInstance(),
                OAUTH_CLIENT_ID, OAUTH_SECRET,
                Collections.singleton("email")).setDataStoreFactory(
                new MemoryDataStoreFactory()).setAccessType("offline").build();
    }

    protected String getRedirectUri(ParameterProviderI req, Integer menuId) throws IOException {
        String requestUrl = req.getRequestURL();
        if (replaceHttpWithHttps) {
            requestUrl = requestUrl.replace("http://", "https://");
        }
        GenericUrl url = new GenericUrl(requestUrl + "?m=" + menuId + "&a=" + phase2Marker);
        return url.build();
    }

    @Override
    public AnswerDataI handleRequest(String action, MenuItemI menuItem, UserProfileI profile, DescriptorImplI descriptor, ParameterProviderI provider) {
        AnswerData answerData = new AnswerData();
        if (profile == null) {
            lock.lock();
            try {
                if(flow == null) {
                    flow = this.initializeFlow();
                }

                String sessionKey = provider.getSessionKey();
                Credential credential = flow.loadCredential(sessionKey);
                if(credential != null && credential.getAccessToken() != null) {
                    // todo investigate here, why we didn't have UserProfile in session here.
                    onSuccess(provider, getData(), credential);
                    return null;
                }
                // check if we at init page or at call-back
                // url is
                if (action.equalsIgnoreCase(phase1Marker)) {
                    // phase 1, generate links
                    try {
                        AuthorizationCodeRequestUrl authorizationUrl = flow.newAuthorizationUrl();
                        authorizationUrl.setRedirectUri(getRedirectUri(provider, menuItem.getId()));
                        provider.sendRedirect(authorizationUrl.build());
                    } catch (IOException e) {
                        e.printStackTrace();
                        //todo check what could be wrong here
                    }
                    return null;
                }

                if (action.equalsIgnoreCase(phase2Marker)) {
                    // phase 2, get things from parameters, authenticate user.
                    String code = provider.getParameter("code");
                    if (code != null)
                    {
                        String redirectUri = getRedirectUri(provider, menuItem.getId());
                        TokenResponse response = flow.newTokenRequest(code).setRedirectUri(redirectUri).execute();
                        //todo check what could be wrong here
                        credential = flow.createAndStoreCredential(response, provider.getSessionKey());
                        onSuccess(provider, getData(), credential);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        return answerData;
    }

    protected void onSuccess(ParameterProviderI providerI, DataProviderI dataProviderI, Credential credential)
            throws IOException {

        InputStream in = null;
        try {
            URL url = new URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token=" + credential.getAccessToken());
            JacksonFactory instance = JacksonFactory.getDefaultInstance();
            in = url.openStream();
            JsonParser parser = instance.createJsonParser(in);
            Map userInfo = parser.parse(HashMap.class);
            if (userInfo != null && userInfo.get("email") != null) {
                String email = (String) userInfo.get("email");
                UserProfileI profileI = dataProviderI.authorizeProfile(email, providerI);
                if (profileI != null) {
                    providerI.sendRedirect(successRedirect);
                }
                //todo unknown user handling
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
