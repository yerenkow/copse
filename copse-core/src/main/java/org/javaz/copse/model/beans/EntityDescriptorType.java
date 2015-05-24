
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class EntityDescriptorType implements EntityDescriptorTypeI {
    public static final String F_ID = "id";
    public static final String F_DEFAULT_ACTION = "default_action";
    public static final String F_FACTORY_ID = "factory_id";
    public static final String F_TITLE = "title";

    private java.lang.Integer id;
    private java.lang.String defaultAction;
    private java.lang.Integer factoryId;
    private java.lang.String title;

    public EntityDescriptorType () {
    }

    public EntityDescriptorType createNewInstance() {
        return new EntityDescriptorType();
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
    public java.lang.String getDefaultAction() {
        return defaultAction;
    }

    public void setDefaultAction(java.lang.String defaultAction) {
        this.defaultAction = defaultAction;
    }
    public java.lang.Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(java.lang.Integer factoryId) {
        this.factoryId = factoryId;
    }
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public Object clone() throws CloneNotSupportedException {
        EntityDescriptorType clone = createNewInstance();
        clone.setId(getId());
        clone.setDefaultAction(getDefaultAction());
        clone.setFactoryId(getFactoryId());
        clone.setTitle(getTitle());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(defaultAction != null) { h.put(F_DEFAULT_ACTION, "" + getDefaultAction()); }
        if(factoryId != null) { h.put(F_FACTORY_ID, "" + getFactoryId()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        return h;
    }

}
