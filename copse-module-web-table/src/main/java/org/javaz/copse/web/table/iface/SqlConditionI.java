package org.javaz.copse.web.table.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface SqlConditionI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getEntityId();
    public void setEntityId(java.lang.Integer entityId);

    public java.lang.String getJavaType();
    public void setJavaType(java.lang.String javaType);

    public java.lang.String getKey();
    public void setKey(java.lang.String key);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);

    public java.lang.Integer getType();
    public void setType(java.lang.Integer type);

    public java.lang.String getValue();
    public void setValue(java.lang.String value);


    public Map<String, String> toStringMap();

}
