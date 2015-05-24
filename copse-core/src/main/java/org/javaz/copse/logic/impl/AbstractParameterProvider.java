
package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.iface.*;

import java.util.*;

public abstract class AbstractParameterProvider implements ParameterProviderI {
    private java.util.HashMap parameterArrays;
    private java.util.HashMap parameters;
    private java.lang.String requestUrl;

    public AbstractParameterProvider () {
    }

    public abstract AbstractParameterProvider createNewInstance();

    public java.util.HashMap getParameterArrays() {
        return parameterArrays;
    }

    public void setParameterArrays(java.util.HashMap parameterArrays) {
        this.parameterArrays = parameterArrays;
    }
    public java.util.HashMap getParameters() {
        return parameters;
    }

    public void setParameters(java.util.HashMap parameters) {
        this.parameters = parameters;
    }
    public java.lang.String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(java.lang.String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public Object clone() throws CloneNotSupportedException {
        AbstractParameterProvider clone = createNewInstance();
        clone.setParameterArrays(getParameterArrays());
        clone.setParameters(getParameters());
        clone.setRequestUrl(getRequestUrl());
        return clone;
    }

    public abstract java.lang.Boolean isContainsParameter(String name, String value);
    public abstract java.lang.String getParameter(String name);
    public abstract String[] getParameterArrays(String name);
    public abstract void setAttributeInSession(String key, Object value);
    public abstract Object getAttributeFromSession(String key);
    public abstract void invalidateSession();
    public abstract void sendRedirect(String url) throws java.io.IOException;
    public abstract java.lang.String getRequestURL();
    public abstract java.lang.String getQueryString();
    public abstract java.lang.String getRemoteIp();
    public abstract java.lang.String getSessionKey();
}
