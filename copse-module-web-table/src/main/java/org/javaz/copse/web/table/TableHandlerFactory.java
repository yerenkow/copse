package org.javaz.copse.web.table;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;

/**
 */
public class TableHandlerFactory implements GenericFactoryInstanceI<TableHandler> {

    public TableHandler createInstance(Comparable id, DataProviderI data) {
        TableHandler handler = new TableHandler();
        handler.setData(data);
        return handler;
    }
}
