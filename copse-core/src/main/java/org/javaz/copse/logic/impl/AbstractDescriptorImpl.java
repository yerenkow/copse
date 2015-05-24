
package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.iface.*;

import java.util.*;

public abstract class AbstractDescriptorImpl implements DescriptorImplI {
    private java.lang.Integer id;

    public AbstractDescriptorImpl () {
    }

    public abstract AbstractDescriptorImpl createNewInstance();

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        AbstractDescriptorImpl clone = createNewInstance();
        clone.setId(getId());
        return clone;
    }

    public abstract java.lang.String getPermissionFlagFromAction(ParameterProviderI provider);
}
