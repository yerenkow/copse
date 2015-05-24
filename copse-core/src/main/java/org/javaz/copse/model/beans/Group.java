
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class Group implements GroupI {
    public static final String F_ID = "id";
    public static final String F_CODE = "code";
    public static final String F_COMMENTS = "comments";
    public static final String F_ENABLED = "enabled";
    public static final String F_PARENT_GROUP_ID = "parent_group_id";
    public static final String F_TITLE = "title";

    private java.lang.Integer id;
    private java.lang.String code;
    private java.lang.String comments;
    private java.lang.Boolean enabled;
    private java.lang.Integer parentGroupId;
    private java.lang.String title;

    public Group () {
    }

    public Group createNewInstance() {
        return new Group();
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
    public java.lang.String getCode() {
        return code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
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
    public java.lang.Integer getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(java.lang.Integer parentGroupId) {
        this.parentGroupId = parentGroupId;
    }
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public Object clone() throws CloneNotSupportedException {
        Group clone = createNewInstance();
        clone.setId(getId());
        clone.setCode(getCode());
        clone.setComments(getComments());
        clone.setEnabled(getEnabled());
        clone.setParentGroupId(getParentGroupId());
        clone.setTitle(getTitle());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(code != null) { h.put(F_CODE, "" + getCode()); }
        if(comments != null) { h.put(F_COMMENTS, "" + getComments()); }
        if(enabled != null) { h.put(F_ENABLED, "" + getEnabled()); }
        if(parentGroupId != null) { h.put(F_PARENT_GROUP_ID, "" + getParentGroupId()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        return h;
    }

}
