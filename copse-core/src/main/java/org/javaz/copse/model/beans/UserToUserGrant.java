
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class UserToUserGrant implements UserToUserGrantI {
    public static final String F_ID = "id";
    public static final String F_CHILD_USER_ID = "child_user_id";
    public static final String F_COMMENTS = "comments";
    public static final String F_CREATED_WHEN = "created_when";
    public static final String F_ENABLED = "enabled";
    public static final String F_PARENT_USER_ID = "parent_user_id";

    private java.lang.Integer id;
    private java.lang.Integer childUserId;
    private java.lang.String comments;
    private java.sql.Timestamp createdWhen;
    private java.lang.Boolean enabled;
    private java.lang.Integer parentUserId;

    public UserToUserGrant () {
    }

    public UserToUserGrant createNewInstance() {
        return new UserToUserGrant();
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
    public java.lang.Integer getChildUserId() {
        return childUserId;
    }

    public void setChildUserId(java.lang.Integer childUserId) {
        this.childUserId = childUserId;
    }
    public java.lang.String getComments() {
        return comments;
    }

    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }
    public java.sql.Timestamp getCreatedWhen() {
        return createdWhen;
    }

    public void setCreatedWhen(java.sql.Timestamp createdWhen) {
        this.createdWhen = createdWhen;
    }
    public java.lang.Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }
    public java.lang.Integer getParentUserId() {
        return parentUserId;
    }

    public void setParentUserId(java.lang.Integer parentUserId) {
        this.parentUserId = parentUserId;
    }

    public Object clone() throws CloneNotSupportedException {
        UserToUserGrant clone = createNewInstance();
        clone.setId(getId());
        clone.setChildUserId(getChildUserId());
        clone.setComments(getComments());
        clone.setCreatedWhen(getCreatedWhen());
        clone.setEnabled(getEnabled());
        clone.setParentUserId(getParentUserId());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(childUserId != null) { h.put(F_CHILD_USER_ID, "" + getChildUserId()); }
        if(comments != null) { h.put(F_COMMENTS, "" + getComments()); }
        if(createdWhen != null) { h.put(F_CREATED_WHEN, "" + getCreatedWhen()); }
        if(enabled != null) { h.put(F_ENABLED, "" + getEnabled()); }
        if(parentUserId != null) { h.put(F_PARENT_USER_ID, "" + getParentUserId()); }
        return h;
    }

}
