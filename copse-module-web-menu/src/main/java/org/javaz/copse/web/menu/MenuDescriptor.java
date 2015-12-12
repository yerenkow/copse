package org.javaz.copse.web.menu;

import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.impl.AbstractDescriptorImpl;
import org.javaz.copse.model.iface.EntityDescriptorI;

/**
 */
public class MenuDescriptor extends AbstractDescriptorImpl {

    public MenuDescriptor() {
    }

    @Override
    public AbstractDescriptorImpl createNewInstance() {
        return new MenuDescriptor();
    }

    public MenuDescriptor(EntityDescriptorI other) {
        setId(other.getId());
    }

    @Override
    public String getPermissionFlagFromAction(ParameterProviderI provider) {
        return "r";
    }
}
