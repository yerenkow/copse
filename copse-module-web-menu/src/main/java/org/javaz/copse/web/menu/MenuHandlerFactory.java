package org.javaz.copse.web.menu;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;

/**
 */
public class MenuHandlerFactory implements GenericFactoryInstanceI<MenuHandler> {

    public MenuHandler createInstance(Comparable id, DataProviderI data) {
        MenuHandler handler = new MenuHandler();
        handler.setData(data);
        return handler;
    }
}
