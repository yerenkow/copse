
package org.javaz.copse.web.table.impl;

import org.javaz.copse.web.table.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class SqlCondition implements SqlConditionI {
    public static final String F_ID = "id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_JAVA_TYPE = "java_type";
    public static final String F_KEY = "key";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_TYPE = "type";
    public static final String F_VALUE = "value";

    private java.lang.Integer id;
    private java.lang.Integer entityId;
    private java.lang.String javaType;
    private java.lang.String key;
    private java.lang.Integer orderValue;
    private java.lang.Integer type;
    private java.lang.String value;

    public SqlCondition () {
    }

    public SqlCondition createNewInstance() {
        return new SqlCondition();
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
    public java.lang.String getJavaType() {
        return javaType;
    }

    public void setJavaType(java.lang.String javaType) {
        this.javaType = javaType;
    }
    public java.lang.String getKey() {
        return key;
    }

    public void setKey(java.lang.String key) {
        this.key = key;
    }
    public java.lang.Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(java.lang.Integer orderValue) {
        this.orderValue = orderValue;
    }
    public java.lang.Integer getType() {
        return type;
    }

    public void setType(java.lang.Integer type) {
        this.type = type;
    }
    public java.lang.String getValue() {
        return value;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public Object clone() throws CloneNotSupportedException {
        SqlCondition clone = createNewInstance();
        clone.setId(getId());
        clone.setEntityId(getEntityId());
        clone.setJavaType(getJavaType());
        clone.setKey(getKey());
        clone.setOrderValue(getOrderValue());
        clone.setType(getType());
        clone.setValue(getValue());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(entityId != null) { h.put(F_ENTITY_ID, "" + getEntityId()); }
        if(javaType != null) { h.put(F_JAVA_TYPE, "" + getJavaType()); }
        if(key != null) { h.put(F_KEY, "" + getKey()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        if(type != null) { h.put(F_TYPE, "" + getType()); }
        if(value != null) { h.put(F_VALUE, "" + getValue()); }
        return h;
    }

}
