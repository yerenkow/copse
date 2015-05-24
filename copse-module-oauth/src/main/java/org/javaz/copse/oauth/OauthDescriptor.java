package org.javaz.copse.oauth;

import org.javaz.copse.logic.iface.HandlerI;
import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.logic.impl.AbstractDescriptorImpl;
import org.javaz.copse.model.iface.ActionHandlerDescriptorI;
import org.javaz.copse.model.iface.EntityDescriptorI;

import java.util.List;

/**
 */
public class OauthDescriptor extends AbstractDescriptorImpl {

    public OauthDescriptor() {
    }

    public OauthDescriptor(EntityDescriptorI other) {
        setId(other.getId());
    }

    @Override
    public AbstractDescriptorImpl createNewInstance() {
        return new OauthDescriptor();
    }

    @Override
    public String getPermissionFlagFromAction(ParameterProviderI provider) {
        return "r";
    }
}
