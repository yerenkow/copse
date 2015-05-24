package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface SimpleRecordI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);

    public java.lang.String getStringKey();
    public void setStringKey(java.lang.String stringKey);

    public java.lang.String getStringValue();
    public void setStringValue(java.lang.String stringValue);

    public java.lang.String getStringValue2();
    public void setStringValue2(java.lang.String stringValue2);

    public java.lang.Integer getType();
    public void setType(java.lang.Integer type);


    public Map<String, String> toStringMap();

}
