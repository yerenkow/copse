package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface MenuItemI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getEntityId();
    public void setEntityId(java.lang.Integer entityId);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);

    public java.lang.Integer getParentMenuId();
    public void setParentMenuId(java.lang.Integer parentMenuId);

    public java.lang.String getTitle();
    public void setTitle(java.lang.String title);


    public Map<String, String> toStringMap();

}
