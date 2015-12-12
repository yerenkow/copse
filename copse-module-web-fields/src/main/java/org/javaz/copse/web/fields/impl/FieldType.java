
package org.javaz.copse.web.fields.impl;

import org.javaz.copse.web.fields.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class FieldType implements FieldTypeI {
    public static final String F_ID = "id";
    public static final String F_FIELD_TYPE = "field_type";
    public static final String F_TYPE = "type";

    private java.lang.Integer id;
    private java.lang.String fieldType;
    private java.lang.Integer type;

    public FieldType () {
    }

    public FieldType createNewInstance() {
        return new FieldType();
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
    public java.lang.String getFieldType() {
        return fieldType;
    }

    public void setFieldType(java.lang.String fieldType) {
        this.fieldType = fieldType;
    }
    public java.lang.Integer getType() {
        return type;
    }

    public void setType(java.lang.Integer type) {
        this.type = type;
    }

    public Object clone() throws CloneNotSupportedException {
        FieldType clone = createNewInstance();
        clone.setId(getId());
        clone.setFieldType(getFieldType());
        clone.setType(getType());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(fieldType != null) { h.put(F_FIELD_TYPE, "" + getFieldType()); }
        if(type != null) { h.put(F_TYPE, "" + getType()); }
        return h;
    }

}
