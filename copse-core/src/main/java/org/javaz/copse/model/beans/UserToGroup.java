
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class UserToGroup implements UserToGroupI {
    public static final String F_ID = "id";
    public static final String F_GROUP_ID = "group_id";
    public static final String F_USER_ID = "user_id";

    private java.lang.Integer id;
    private java.lang.Integer groupId;
    private java.lang.Integer userId;

    public UserToGroup () {
    }

    public UserToGroup createNewInstance() {
        return new UserToGroup();
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
    public java.lang.Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }
    public java.lang.Integer getUserId() {
        return userId;
    }

    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    public Object clone() throws CloneNotSupportedException {
        UserToGroup clone = createNewInstance();
        clone.setId(getId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(groupId != null) { h.put(F_GROUP_ID, "" + getGroupId()); }
        if(userId != null) { h.put(F_USER_ID, "" + getUserId()); }
        return h;
    }

}
