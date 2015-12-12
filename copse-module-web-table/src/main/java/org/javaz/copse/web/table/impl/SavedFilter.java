
package org.javaz.copse.web.table.impl;

import org.javaz.copse.web.table.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class SavedFilter implements SavedFilterI {
    public static final String F_ID = "id";
    public static final String F_CREATED_WHEN = "created_when";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_GROUP_ID = "group_id";
    public static final String F_IS_DEFAULT = "is_default";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_TITLE = "title";
    public static final String F_USER_ID = "user_id";
    public static final String F_VALUE = "value";

    private java.lang.Integer id;
    private java.sql.Timestamp createdWhen;
    private java.lang.Integer entityId;
    private java.lang.Integer groupId;
    private java.lang.Boolean isDefault;
    private java.lang.Integer orderValue;
    private java.lang.String title;
    private java.lang.Integer userId;
    private java.lang.String value;

    public SavedFilter () {
    }

    public SavedFilter createNewInstance() {
        return new SavedFilter();
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
    public java.sql.Timestamp getCreatedWhen() {
        return createdWhen;
    }

    public void setCreatedWhen(java.sql.Timestamp createdWhen) {
        this.createdWhen = createdWhen;
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
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }
    public java.lang.Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(java.lang.Integer orderValue) {
        this.orderValue = orderValue;
    }
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }
    public java.lang.Integer getUserId() {
        return userId;
    }

    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }
    public java.lang.String getValue() {
        return value;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public Object clone() throws CloneNotSupportedException {
        SavedFilter clone = createNewInstance();
        clone.setId(getId());
        clone.setCreatedWhen(getCreatedWhen());
        clone.setEntityId(getEntityId());
        clone.setGroupId(getGroupId());
        clone.setIsDefault(getIsDefault());
        clone.setOrderValue(getOrderValue());
        clone.setTitle(getTitle());
        clone.setUserId(getUserId());
        clone.setValue(getValue());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(createdWhen != null) { h.put(F_CREATED_WHEN, "" + getCreatedWhen()); }
        if(entityId != null) { h.put(F_ENTITY_ID, "" + getEntityId()); }
        if(groupId != null) { h.put(F_GROUP_ID, "" + getGroupId()); }
        if(isDefault != null) { h.put(F_IS_DEFAULT, "" + getIsDefault()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        if(userId != null) { h.put(F_USER_ID, "" + getUserId()); }
        if(value != null) { h.put(F_VALUE, "" + getValue()); }
        return h;
    }

}
