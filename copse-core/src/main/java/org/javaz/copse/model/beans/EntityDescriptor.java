
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class EntityDescriptor implements EntityDescriptorI {
    public static final String F_ID = "id";
    public static final String F_TITLE = "title";
    public static final String F_TYPE_ID = "type_id";

    private java.lang.Integer id;
    private java.lang.String title;
    private java.lang.Integer typeId;

    public EntityDescriptor () {
    }

    public EntityDescriptor createNewInstance() {
        return new EntityDescriptor();
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
    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }
    public java.lang.Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(java.lang.Integer typeId) {
        this.typeId = typeId;
    }

    public Object clone() throws CloneNotSupportedException {
        EntityDescriptor clone = createNewInstance();
        clone.setId(getId());
        clone.setTitle(getTitle());
        clone.setTypeId(getTypeId());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        if(typeId != null) { h.put(F_TYPE_ID, "" + getTypeId()); }
        return h;
    }

}
