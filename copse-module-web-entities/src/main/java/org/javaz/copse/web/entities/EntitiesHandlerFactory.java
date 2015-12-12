package org.javaz.copse.web.entities;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;

/**
 */
public class EntitiesHandlerFactory implements GenericFactoryInstanceI<EntitiesHandler> {

    public EntitiesHandler createInstance(Comparable id, DataProviderI data) {
        EntitiesHandler handler = new EntitiesHandler();
        handler.setData(data);
        return handler;
    }
}
