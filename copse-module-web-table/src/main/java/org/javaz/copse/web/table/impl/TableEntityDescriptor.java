
package org.javaz.copse.web.table.impl;

import org.javaz.copse.logic.iface.ParameterProviderI;
import org.javaz.copse.web.table.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public  class TableEntityDescriptor implements TableEntityDescriptorI {
    public static final String F_ID = "id";
    public static final String F_ADDITIONAL_WHERE = "additional_where";
    public static final String F_DB_ID = "db_id";
    public static final String F_DELETE_FIELD = "delete_field";
    public static final String F_DESCRIPTOR_ID = "descriptor_id";
    public static final String F_FLAGS = "flags";
    public static final String F_JOIN_TABLES = "join_tables";
    public static final String F_LINKED_CHILD_ENTITY_COLUMN_ID = "linked_child_entity_column_id";
    public static final String F_LINKED_ORDER_FIELD = "linked_order_field";
    public static final String F_LINKED_PARENT_ENTITY_ID = "linked_parent_entity_id";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_TABLE_NAME = "table_name";
    public static final String F_TITLE = "title";
    public static final String F_TYPE_ID = "type_id";

    private java.lang.Integer id;
    private java.lang.String additionalWhere;
    private java.lang.Integer dbId;
    private java.lang.String deleteField;
    private java.lang.Integer descriptorId;
    private java.lang.String flags;
    private java.lang.String joinTables;
    private java.lang.String linkedChildEntityColumnId;
    private java.lang.String linkedOrderField;
    private java.lang.Integer linkedParentEntityId;
    private java.lang.Integer orderValue;
    private java.lang.String tableName;
    private java.lang.String title;
    private java.lang.Integer typeId;

    public TableEntityDescriptor () {
    }

    public TableEntityDescriptor createNewInstance() {
        return new TableEntityDescriptor();
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
    public java.lang.String getAdditionalWhere() {
        return additionalWhere;
    }

    public void setAdditionalWhere(java.lang.String additionalWhere) {
        this.additionalWhere = additionalWhere;
    }
    public java.lang.Integer getDbId() {
        return dbId;
    }

    public void setDbId(java.lang.Integer dbId) {
        this.dbId = dbId;
    }
    public java.lang.String getDeleteField() {
        return deleteField;
    }

    public void setDeleteField(java.lang.String deleteField) {
        this.deleteField = deleteField;
    }
    public java.lang.Integer getDescriptorId() {
        return descriptorId;
    }

    public void setDescriptorId(java.lang.Integer descriptorId) {
        this.descriptorId = descriptorId;
    }
    public java.lang.String getFlags() {
        return flags;
    }

    public void setFlags(java.lang.String flags) {
        this.flags = flags;
    }
    public java.lang.String getJoinTables() {
        return joinTables;
    }

    public void setJoinTables(java.lang.String joinTables) {
        this.joinTables = joinTables;
    }
    public java.lang.String getLinkedChildEntityColumnId() {
        return linkedChildEntityColumnId;
    }

    public void setLinkedChildEntityColumnId(java.lang.String linkedChildEntityColumnId) {
        this.linkedChildEntityColumnId = linkedChildEntityColumnId;
    }
    public java.lang.String getLinkedOrderField() {
        return linkedOrderField;
    }

    public void setLinkedOrderField(java.lang.String linkedOrderField) {
        this.linkedOrderField = linkedOrderField;
    }
    public java.lang.Integer getLinkedParentEntityId() {
        return linkedParentEntityId;
    }

    public void setLinkedParentEntityId(java.lang.Integer linkedParentEntityId) {
        this.linkedParentEntityId = linkedParentEntityId;
    }
    public java.lang.Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(java.lang.Integer orderValue) {
        this.orderValue = orderValue;
    }
    public java.lang.String getTableName() {
        return tableName;
    }

    public void setTableName(java.lang.String tableName) {
        this.tableName = tableName;
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
        TableEntityDescriptor clone = createNewInstance();
        clone.setId(getId());
        clone.setAdditionalWhere(getAdditionalWhere());
        clone.setDbId(getDbId());
        clone.setDeleteField(getDeleteField());
        clone.setDescriptorId(getDescriptorId());
        clone.setFlags(getFlags());
        clone.setJoinTables(getJoinTables());
        clone.setLinkedChildEntityColumnId(getLinkedChildEntityColumnId());
        clone.setLinkedOrderField(getLinkedOrderField());
        clone.setLinkedParentEntityId(getLinkedParentEntityId());
        clone.setOrderValue(getOrderValue());
        clone.setTableName(getTableName());
        clone.setTitle(getTitle());
        clone.setTypeId(getTypeId());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(additionalWhere != null) { h.put(F_ADDITIONAL_WHERE, "" + getAdditionalWhere()); }
        if(dbId != null) { h.put(F_DB_ID, "" + getDbId()); }
        if(deleteField != null) { h.put(F_DELETE_FIELD, "" + getDeleteField()); }
        if(descriptorId != null) { h.put(F_DESCRIPTOR_ID, "" + getDescriptorId()); }
        if(flags != null) { h.put(F_FLAGS, "" + getFlags()); }
        if(joinTables != null) { h.put(F_JOIN_TABLES, "" + getJoinTables()); }
        if(linkedChildEntityColumnId != null) { h.put(F_LINKED_CHILD_ENTITY_COLUMN_ID, "" + getLinkedChildEntityColumnId()); }
        if(linkedOrderField != null) { h.put(F_LINKED_ORDER_FIELD, "" + getLinkedOrderField()); }
        if(linkedParentEntityId != null) { h.put(F_LINKED_PARENT_ENTITY_ID, "" + getLinkedParentEntityId()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        if(tableName != null) { h.put(F_TABLE_NAME, "" + getTableName()); }
        if(title != null) { h.put(F_TITLE, "" + getTitle()); }
        if(typeId != null) { h.put(F_TYPE_ID, "" + getTypeId()); }
        return h;
    }

    public String getPermissionFlagFromAction(ParameterProviderI provider) {
        return "r";
    }
}
