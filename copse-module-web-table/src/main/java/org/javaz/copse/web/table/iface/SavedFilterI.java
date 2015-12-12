package org.javaz.copse.web.table.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface SavedFilterI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.sql.Timestamp getCreatedWhen();
    public void setCreatedWhen(java.sql.Timestamp createdWhen);

    public java.lang.Integer getEntityId();
    public void setEntityId(java.lang.Integer entityId);

    public java.lang.Integer getGroupId();
    public void setGroupId(java.lang.Integer groupId);

    public java.lang.Boolean getIsDefault();
    public void setIsDefault(java.lang.Boolean isDefault);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);

    public java.lang.String getTitle();
    public void setTitle(java.lang.String title);

    public java.lang.Integer getUserId();
    public void setUserId(java.lang.Integer userId);

    public java.lang.String getValue();
    public void setValue(java.lang.String value);


    public Map<String, String> toStringMap();

}
