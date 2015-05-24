package org.javaz.copse.web;

import org.javaz.copse.logic.impl.AbstractParameterProvider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

/**
 */
public class HttpRequestParameterProvider extends AbstractParameterProvider {
    private HashMap<String, String> parameters = new HashMap<String, String>();
    private HashMap<String, String[]> parameterArrays = new HashMap<String, String[]>();
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    private static Pattern notEmptyBrackets = Pattern.compile("\\[.+\\]$");


    public HttpRequestParameterProvider() {
        super();
    }

    public HttpRequestParameterProvider(HttpServletRequest req, HttpServletResponse resp) {
        super();
        this.request = req;
        this.response = resp;
        Enumeration parameterNames = req.getParameterNames();
        HashMap<String, ArrayList<String>> arraysWithIndexes = new HashMap<String, ArrayList<String>>();

        while (parameterNames.hasMoreElements()) {
            String name = (String) parameterNames.nextElement();
            String[] value = req.getParameterValues(name);
            if (value != null) {
                if (name.endsWith("[]")) {
                    name = name.substring(0, name.lastIndexOf("["));
                }

                if (value.length == 1) {
                    if (notEmptyBrackets.matcher(name).find()) {
                        name = name.substring(0, name.lastIndexOf("["));
                        if (!arraysWithIndexes.containsKey(name)) {
                            arraysWithIndexes.put(name, new ArrayList<String>());
                        }
                        arraysWithIndexes.get(name).add(value[0]);
                    } else {
                        parameters.put(name, value[0]);
                    }
                } else {
                    parameterArrays.put(name, value);
                }
            }
        }

        Set enumeration = arraysWithIndexes.keySet();
        for (Iterator iteratorSetX = enumeration.iterator(); iteratorSetX.hasNext(); ) {
            String subName = (String) iteratorSetX.next();
            ArrayList<String> list = arraysWithIndexes.get(subName);
            String[] arr = new String[list.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
            }
            parameterArrays.put(subName, arr);
        }
    }

    @Override
    public AbstractParameterProvider createNewInstance() {
        return new HttpRequestParameterProvider();
    }

    @Override
    public Boolean isContainsParameter(String name, String value) {
        return parameters.containsKey(name) && parameters.get(name).equals(value);
    }

    @Override
    public String getParameter(String name) {
        return parameters.get(name);
    }

    @Override
    public String[] getParameterArrays(String name) {
        return parameterArrays.get(name);
    }

    @Override
    public void setAttributeInSession(String key, Object value) {
        if (value != null) {
            request.getSession().setAttribute(key, value);
        } else {
            request.getSession().removeAttribute(key);
        }
    }

    @Override
    public Object getAttributeFromSession(String key) {
        return request.getSession().getAttribute(key);
    }

    @Override
    public void invalidateSession() {
        request.getSession().invalidate();
    }

    @Override
    public void sendRedirect(String url) throws IOException {
        response.sendRedirect(url);
    }

    @Override
    public String getRequestURL() {
        return request.getRequestURL().toString();
    }

    @Override
    public String getQueryString() {
        return request.getQueryString();
    }

    @Override
    public String getRemoteIp() {
        String s = request.getHeader("X-Forwarded-For");
        if (s == null) {
            s = request.getHeader("X-Real-IP");
        }
        if (s == null) {
            return request.getRemoteAddr();
        }
        if (s.contains(" ")) {
            s = s.substring(s.lastIndexOf(" ")).trim();
        }
        return s;
    }

    @Override
    public String getSessionKey() {
        return request.getSession().getId();
    }
}
