package org.javaz.copse.oauth;

import org.javaz.copse.logic.iface.DataProviderI;
import org.javaz.copse.logic.iface.GenericFactoryInstanceI;

/**
 */
public class OauthDescriptorFactory implements GenericFactoryInstanceI<OauthDescriptor> {

    public OauthDescriptor createInstance(Comparable id, DataProviderI data) {
        return new OauthDescriptor(data.getEntityDescriptor(id));
    }
}