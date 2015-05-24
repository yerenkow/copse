
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class User implements UserI {
    public static final String F_ID = "id";
    public static final String F_COMMENTS = "comments";
    public static final String F_ENABLED = "enabled";
    public static final String F_NAME = "name";
    public static final String F_OAUTH_ID = "oauth_id";
    public static final String F_PARENT_ID = "parent_id";

    private java.lang.Integer id;
    private java.lang.String comments;
    private java.lang.Boolean enabled;
    private java.lang.String name;
    private java.lang.String oauthId;
    private java.lang.Integer parentId;

    public User () {
    }

    public User createNewInstance() {
        return new User();
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
    public java.lang.String getComments() {
        return comments;
    }

    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }
    public java.lang.Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }
    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    public java.lang.String getOauthId() {
        return oauthId;
    }

    public void setOauthId(java.lang.String oauthId) {
        this.oauthId = oauthId;
    }
    public java.lang.Integer getParentId() {
        return parentId;
    }

    public void setParentId(java.lang.Integer parentId) {
        this.parentId = parentId;
    }

    public Object clone() throws CloneNotSupportedException {
        User clone = createNewInstance();
        clone.setId(getId());
        clone.setComments(getComments());
        clone.setEnabled(getEnabled());
        clone.setName(getName());
        clone.setOauthId(getOauthId());
        clone.setParentId(getParentId());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(comments != null) { h.put(F_COMMENTS, "" + getComments()); }
        if(enabled != null) { h.put(F_ENABLED, "" + getEnabled()); }
        if(name != null) { h.put(F_NAME, "" + getName()); }
        if(oauthId != null) { h.put(F_OAUTH_ID, "" + getOauthId()); }
        if(parentId != null) { h.put(F_PARENT_ID, "" + getParentId()); }
        return h;
    }

}
