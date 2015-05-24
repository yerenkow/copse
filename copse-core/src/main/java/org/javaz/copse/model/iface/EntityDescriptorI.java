package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface EntityDescriptorI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.String getTitle();
    public void setTitle(java.lang.String title);

    public java.lang.Integer getTypeId();
    public void setTypeId(java.lang.Integer typeId);


    public Map<String, String> toStringMap();

}
