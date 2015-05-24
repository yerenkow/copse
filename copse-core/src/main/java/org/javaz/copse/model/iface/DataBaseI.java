package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface DataBaseI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getConfig();
    public void setConfig(java.lang.String config);

    public java.lang.Integer getFactoryId();
    public void setFactoryId(java.lang.Integer factoryId);

    public java.lang.String getLogin();
    public void setLogin(java.lang.String login);

    public java.lang.String getName();
    public void setName(java.lang.String name);

    public java.lang.String getPassword();
    public void setPassword(java.lang.String password);

    public java.lang.String getUrl();
    public void setUrl(java.lang.String url);


    public Map<String, String> toStringMap();

}
