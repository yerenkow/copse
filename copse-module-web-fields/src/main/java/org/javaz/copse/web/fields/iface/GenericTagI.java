package org.javaz.copse.web.fields.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface GenericTagI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getCategoryId();
    public void setCategoryId(java.lang.Integer categoryId);

    public java.lang.String getTitle();
    public void setTitle(java.lang.String title);


    public Map<String, String> toStringMap();

}
