package org.javaz.copse.logic.iface;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.io.Serializable;


public interface ParameterProviderI  {
    public java.util.HashMap getParameterArrays();
    public void setParameterArrays(java.util.HashMap parameterArrays);

    public java.util.HashMap getParameters();
    public void setParameters(java.util.HashMap parameters);

    public java.lang.String getRequestUrl();
    public void setRequestUrl(java.lang.String requestUrl);


    public java.lang.Boolean isContainsParameter(String name, String value);
    public java.lang.String getParameter(String name);
    public String[] getParameterArrays(String name);
    public void setAttributeInSession(String key, Object value);
    public Object getAttributeFromSession(String key);
    public void invalidateSession();
    public void sendRedirect(String url) throws java.io.IOException;
    public java.lang.String getRequestURL();
    public java.lang.String getQueryString();
    public java.lang.String getRemoteIp();
    public java.lang.String getSessionKey();
}
