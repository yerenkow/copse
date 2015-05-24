
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class GenericFactory implements GenericFactoryI {
    public static final String F_ID = "id";
    public static final String F_FACTORY_CLASS = "factory_class";
    public static final String F_NAME = "name";
    public static final String F_TYPE = "type";

    private java.lang.Integer id;
    private java.lang.String factoryClass;
    private java.lang.String name;
    private java.lang.Integer type;

    public GenericFactory () {
    }

    public GenericFactory createNewInstance() {
        return new GenericFactory();
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
    public java.lang.String getFactoryClass() {
        return factoryClass;
    }

    public void setFactoryClass(java.lang.String factoryClass) {
        this.factoryClass = factoryClass;
    }
    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    public java.lang.Integer getType() {
        return type;
    }

    public void setType(java.lang.Integer type) {
        this.type = type;
    }

    public Object clone() throws CloneNotSupportedException {
        GenericFactory clone = createNewInstance();
        clone.setId(getId());
        clone.setFactoryClass(getFactoryClass());
        clone.setName(getName());
        clone.setType(getType());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(factoryClass != null) { h.put(F_FACTORY_CLASS, "" + getFactoryClass()); }
        if(name != null) { h.put(F_NAME, "" + getName()); }
        if(type != null) { h.put(F_TYPE, "" + getType()); }
        return h;
    }

}
