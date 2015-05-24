
package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.iface.*;

import java.util.*;

public abstract class AbstractHandler implements HandlerI {
    private DataProviderI data;

    public AbstractHandler () {
    }

    public abstract AbstractHandler createNewInstance();

    public DataProviderI getData() {
        return data;
    }

    public void setData(DataProviderI data) {
        this.data = data;
    }

    public Object clone() throws CloneNotSupportedException {
        AbstractHandler clone = createNewInstance();
        clone.setData(getData());
        return clone;
    }

    public abstract void init(String config);
    public abstract AnswerDataI handleRequest(String action, MenuItemI menuItem, UserProfileI profile, DescriptorImplI descriptor, ParameterProviderI provider);
}
