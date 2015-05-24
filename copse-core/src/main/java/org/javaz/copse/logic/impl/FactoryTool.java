package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;

/**
 */
public class FactoryTool {

    <T> T createInstance(String factoryClass, Comparable id, DataProviderI data) throws Exception {
        GenericFactoryInstanceI<T> factory
                = ((Class<GenericFactoryInstanceI>) Class.forName(factoryClass)).newInstance();
        return factory.createInstance(id, data);
    }
}
