package org.javaz.copse.oauth;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;

/**
 */
public class OauthHandlerFactory implements GenericFactoryInstanceI<OauthHandler> {

    public OauthHandler createInstance(Comparable id, DataProviderI data) {
        OauthHandler oauthHandler = new OauthHandler();
        oauthHandler.setData(data);
        return oauthHandler;
    }
}