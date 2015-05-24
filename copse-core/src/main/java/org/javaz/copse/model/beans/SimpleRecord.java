
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class SimpleRecord implements SimpleRecordI {
    public static final String F_ID = "id";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_STRING_KEY = "string_key";
    public static final String F_STRING_VALUE = "string_value";
    public static final String F_STRING_VALUE2 = "string_value2";
    public static final String F_TYPE = "type";

    private java.lang.Integer id;
    private java.lang.Integer orderValue;
    private java.lang.String stringKey;
    private java.lang.String stringValue;
    private java.lang.String stringValue2;
    private java.lang.Integer type;

    public SimpleRecord () {
    }

    public SimpleRecord createNewInstance() {
        return new SimpleRecord();
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
    public java.lang.Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(java.lang.Integer orderValue) {
        this.orderValue = orderValue;
    }
    public java.lang.String getStringKey() {
        return stringKey;
    }

    public void setStringKey(java.lang.String stringKey) {
        this.stringKey = stringKey;
    }
    public java.lang.String getStringValue() {
        return stringValue;
    }

    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }
    public java.lang.String getStringValue2() {
        return stringValue2;
    }

    public void setStringValue2(java.lang.String stringValue2) {
        this.stringValue2 = stringValue2;
    }
    public java.lang.Integer getType() {
        return type;
    }

    public void setType(java.lang.Integer type) {
        this.type = type;
    }

    public Object clone() throws CloneNotSupportedException {
        SimpleRecord clone = createNewInstance();
        clone.setId(getId());
        clone.setOrderValue(getOrderValue());
        clone.setStringKey(getStringKey());
        clone.setStringValue(getStringValue());
        clone.setStringValue2(getStringValue2());
        clone.setType(getType());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        if(stringKey != null) { h.put(F_STRING_KEY, "" + getStringKey()); }
        if(stringValue != null) { h.put(F_STRING_VALUE, "" + getStringValue()); }
        if(stringValue2 != null) { h.put(F_STRING_VALUE2, "" + getStringValue2()); }
        if(type != null) { h.put(F_TYPE, "" + getType()); }
        return h;
    }

}
