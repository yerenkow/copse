package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface PluginI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getClassName();
    public void setClassName(java.lang.String className);

    public java.lang.String getConfig();
    public void setConfig(java.lang.String config);

    public java.lang.Integer getEntityId();
    public void setEntityId(java.lang.Integer entityId);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);


    public Map<String, String> toStringMap();

}
