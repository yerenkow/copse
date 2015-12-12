package org.javaz.copse.web.lang;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;

/**
 */
public class LangHandlerFactory implements GenericFactoryInstanceI<LangHandler> {

    public LangHandler createInstance(Comparable id, DataProviderI data) {
        LangHandler handler = new LangHandler();
        handler.setData(data);
        return handler;
    }
}
