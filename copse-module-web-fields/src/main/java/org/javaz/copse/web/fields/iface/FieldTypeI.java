package org.javaz.copse.web.fields.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface FieldTypeI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getFieldType();
    public void setFieldType(java.lang.String fieldType);

    public java.lang.Integer getType();
    public void setType(java.lang.Integer type);


    public Map<String, String> toStringMap();

}
