
package org.javaz.copse.model.beans;

import org.javaz.copse.model.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class ActionHandlerDescriptor implements ActionHandlerDescriptorI {
    public static final String F_ID = "id";
    public static final String F_APPLICABLE_ACTION_LIST = "applicable_action_list";
    public static final String F_CONFIG = "config";
    public static final String F_ENTITY_DESCRIPTOR_TYPE_ID = "entity_descriptor_type_id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_FACTORY_ID = "factory_id";
    public static final String F_ORDER_VALUE = "order_value";

    private java.lang.Integer id;
    private java.lang.String applicableActionList;
    private java.lang.String config;
    private java.lang.Integer entityDescriptorTypeId;
    private java.lang.Integer entityId;
    private java.lang.Integer factoryId;
    private java.lang.Integer orderValue;

    public ActionHandlerDescriptor () {
    }

    public ActionHandlerDescriptor createNewInstance() {
        return new ActionHandlerDescriptor();
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
    public java.lang.String getApplicableActionList() {
        return applicableActionList;
    }

    public void setApplicableActionList(java.lang.String applicableActionList) {
        this.applicableActionList = applicableActionList;
    }
    public java.lang.String getConfig() {
        return config;
    }

    public void setConfig(java.lang.String config) {
        this.config = config;
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
    public java.lang.Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(java.lang.Integer orderValue) {
        this.orderValue = orderValue;
    }

    public Object clone() throws CloneNotSupportedException {
        ActionHandlerDescriptor clone = createNewInstance();
        clone.setId(getId());
        clone.setApplicableActionList(getApplicableActionList());
        clone.setConfig(getConfig());
        clone.setEntityDescriptorTypeId(getEntityDescriptorTypeId());
        clone.setEntityId(getEntityId());
        clone.setFactoryId(getFactoryId());
        clone.setOrderValue(getOrderValue());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(applicableActionList != null) { h.put(F_APPLICABLE_ACTION_LIST, "" + getApplicableActionList()); }
        if(config != null) { h.put(F_CONFIG, "" + getConfig()); }
        if(entityDescriptorTypeId != null) { h.put(F_ENTITY_DESCRIPTOR_TYPE_ID, "" + getEntityDescriptorTypeId()); }
        if(entityId != null) { h.put(F_ENTITY_ID, "" + getEntityId()); }
        if(factoryId != null) { h.put(F_FACTORY_ID, "" + getFactoryId()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        return h;
    }

}
