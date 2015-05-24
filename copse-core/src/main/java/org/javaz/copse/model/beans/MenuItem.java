
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class MenuItem implements MenuItemI {
    public static final String F_ID = "id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_PARENT_MENU_ID = "parent_menu_id";
    public static final String F_TITLE = "title";

    private java.lang.Integer id;
    private java.lang.Integer entityId;
    private java.lang.Integer orderValue;
    private java.lang.Integer parentMenuId;
    private java.lang.String title;

    public MenuItem () {
    }

    public MenuItem createNewInstance() {
        return new MenuItem();
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
    public java.lang.Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }
    public java.lang.Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(java.lang.Integer orderValue) {
        this.orderValue = orderValue;
    }
    public java.lang.Integer getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(java.lang.Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public Object clone() throws CloneNotSupportedException {
        MenuItem clone = createNewInstance();
        clone.setId(getId());
        clone.setEntityId(getEntityId());
        clone.setOrderValue(getOrderValue());
        clone.setParentMenuId(getParentMenuId());
        clone.setTitle(getTitle());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(entityId != null) { h.put(F_ENTITY_ID, "" + getEntityId()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        if(parentMenuId != null) { h.put(F_PARENT_MENU_ID, "" + getParentMenuId()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        return h;
    }

}
