package org.javaz.copse.web.lang;

import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.impl.AbstractDescriptorImpl;
import org.javaz.copse.model.iface.EntityDescriptorI;

/**
 */
public class LangDescriptor extends AbstractDescriptorImpl {

    public LangDescriptor() {
    }

    @Override
    public AbstractDescriptorImpl createNewInstance() {
        return new LangDescriptor();
    }

    public LangDescriptor(EntityDescriptorI other) {
        setId(other.getId());
    }

    @Override
    public String getPermissionFlagFromAction(ParameterProviderI provider) {
        return "r";
    }
}
