
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class PermissionChecker implements PermissionCheckerI {
    public static final String F_ID = "id";
    public static final String F_ENTITY_DESCRIPTOR_TYPE_ID = "entity_descriptor_type_id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_FACTORY_ID = "factory_id";

    private java.lang.Integer id;
    private java.lang.Integer entityDescriptorTypeId;
    private java.lang.Integer entityId;
    private java.lang.Integer factoryId;

    public PermissionChecker () {
    }

    public PermissionChecker createNewInstance() {
        return new PermissionChecker();
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
    public java.lang.Integer getEntityDescriptorTypeId() {
        return entityDescriptorTypeId;
    }

    public void setEntityDescriptorTypeId(java.lang.Integer entityDescriptorTypeId) {
        this.entityDescriptorTypeId = entityDescriptorTypeId;
    }
    public java.lang.Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }
    public java.lang.Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(java.lang.Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Object clone() throws CloneNotSupportedException {
        PermissionChecker clone = createNewInstance();
        clone.setId(getId());
        clone.setEntityDescriptorTypeId(getEntityDescriptorTypeId());
        clone.setEntityId(getEntityId());
        clone.setFactoryId(getFactoryId());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(entityDescriptorTypeId != null) { h.put(F_ENTITY_DESCRIPTOR_TYPE_ID, "" + getEntityDescriptorTypeId()); }
        if(entityId != null) { h.put(F_ENTITY_ID, "" + getEntityId()); }
        if(factoryId != null) { h.put(F_FACTORY_ID, "" + getFactoryId()); }
        return h;
    }

}
