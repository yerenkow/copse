
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class Plugin implements PluginI {
    public static final String F_ID = "id";
    public static final String F_CLASS_NAME = "class_name";
    public static final String F_CONFIG = "config";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_ORDER_VALUE = "order_value";

    private java.lang.Integer id;
    private java.lang.String className;
    private java.lang.String config;
    private java.lang.Integer entityId;
    private java.lang.Integer orderValue;

    public Plugin () {
    }

    public Plugin createNewInstance() {
        return new Plugin();
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
    public java.lang.String getClassName() {
        return className;
    }

    public void setClassName(java.lang.String className) {
        this.className = className;
    }
    public java.lang.String getConfig() {
        return config;
    }

    public void setConfig(java.lang.String config) {
        this.config = config;
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

    public Object clone() throws CloneNotSupportedException {
        Plugin clone = createNewInstance();
        clone.setId(getId());
        clone.setClassName(getClassName());
        clone.setConfig(getConfig());
        clone.setEntityId(getEntityId());
        clone.setOrderValue(getOrderValue());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(className != null) { h.put(F_CLASS_NAME, "" + getClassName()); }
        if(config != null) { h.put(F_CONFIG, "" + getConfig()); }
        if(entityId != null) { h.put(F_ENTITY_ID, "" + getEntityId()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        return h;
    }

}
