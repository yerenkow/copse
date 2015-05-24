package org.javaz.copse.logic.factories;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;
import org.javaz.copse.model.iface.DataBaseI;

/**
 */
public class DataBaseFactory implements GenericFactoryInstanceI<DataBaseI> {

    public DataBaseI createInstance(Comparable id, DataProviderI data) {
        DataBaseI dataBase = data.getDataBase(id);
        // here can happen any type of init / config
        return dataBase;
    }
}
