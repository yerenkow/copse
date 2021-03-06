
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class Permission implements PermissionI {
    public static final String F_ID = "id";
    public static final String F_DENY = "deny";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_GROUP_ID = "group_id";
    public static final String F_PERMISSION_FLAGS = "permission_flags";
    public static final String F_USER_ID = "user_id";

    private java.lang.Integer id;
    private java.lang.Boolean deny;
    private java.lang.Integer entityId;
    private java.lang.Integer groupId;
    private java.lang.String permissionFlags;
    private java.lang.Integer userId;

    public Permission () {
    }

    public Permission createNewInstance() {
        return new Permission();
    }

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }
    public Comparable getPrimaryKey() {
        return id;
    }

    public void setGeneratedPrimaryKey(Comparable key) {
        this.id = ((java.lang.Number) key).intValue();
    }
    public java.lang.Boolean getDeny() {
        return deny;
    }

    public void setDeny(java.lang.Boolean deny) {
        this.deny = deny;
    }
    public java.lang.Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }
    public java.lang.Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }
    public java.lang.String getPermissionFlags() {
        return permissionFlags;
    }

    public void setPermissionFlags(java.lang.String permissionFlags) {
        this.permissionFlags = permissionFlags;
    }
    public java.lang.Integer getUserId() {
        return userId;
    }

    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    public Object clone() throws CloneNotSupportedException {
        Permission clone = createNewInstance();
        clone.setId(getId());
        clone.setDeny(getDeny());
        clone.setEntityId(getEntityId());
        clone.setGroupId(getGroupId());
        clone.setPermissionFlags(getPermissionFlags());
        clone.setUserId(getUserId());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(deny != null) { h.put(F_DENY, "" + getDeny()); }
        if(entityId != null) { h.put(F_ENTITY_ID, "" + getEntityId()); }
        if(groupId != null) { h.put(F_GROUP_ID, "" + getGroupId()); }
        if(permissionFlags != null) { h.put(F_PERMISSION_FLAGS, "" + getPermissionFlags()); }
        if(userId != null) { h.put(F_USER_ID, "" + getUserId()); }
        return h;
    }

}
