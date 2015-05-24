package org.javaz.copse.model.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface PermissionI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Boolean getDeny();
    public void setDeny(java.lang.Boolean deny);

    public java.lang.Integer getEntityId();
    public void setEntityId(java.lang.Integer entityId);

    public java.lang.Integer getGroupId();
    public void setGroupId(java.lang.Integer groupId);

    public java.lang.String getPermissionFlags();
    public void setPermissionFlags(java.lang.String permissionFlags);

    public java.lang.Integer getUserId();
    public void setUserId(java.lang.Integer userId);


    public Map<String, String> toStringMap();

}
