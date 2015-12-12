package org.javaz.copse.web.entities;

import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.impl.AbstractDescriptorImpl;
import org.javaz.copse.model.iface.EntityDescriptorI;

/**
 */
public class EntitiesDescriptor extends AbstractDescriptorImpl {

    public EntitiesDescriptor() {
    }

    @Override
    public AbstractDescriptorImpl createNewInstance() {
        return new EntitiesDescriptor();
    }

    public EntitiesDescriptor(EntityDescriptorI other) {
        setId(other.getId());
    }

    @Override
    public String getPermissionFlagFromAction(ParameterProviderI provider) {
        return "r";
    }
}
