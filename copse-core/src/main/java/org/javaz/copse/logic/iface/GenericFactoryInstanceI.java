package org.javaz.copse.logic.iface;

/**
 * Created by Alex on 20.05.2015.
 */
public interface GenericFactoryInstanceI<T> {
    T createInstance(Comparable id, DataProviderI data);
}
