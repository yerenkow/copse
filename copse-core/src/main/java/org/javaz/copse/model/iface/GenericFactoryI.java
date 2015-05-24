package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface GenericFactoryI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getFactoryClass();
    public void setFactoryClass(java.lang.String factoryClass);

    public java.lang.String getName();
    public void setName(java.lang.String name);

    public java.lang.Integer getType();
    public void setType(java.lang.Integer type);


    public Map<String, String> toStringMap();

}
