package org.javaz.copse.web.table.helper;

import org.javaz.copse.web.table.iface.*;
import org.javaz.copse.web.table.impl.TableEntityDescriptor;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class TableEntityDescriptorHelper extends AbstractMapConvertibleHelper<TableEntityDescriptorI> {

    public static final String UPDATE_SCRIPT = "update %s set additional_where = ?"
                + " , db_id = ?"
                + " , delete_field = ?"
                + " , descriptor_id = ?"
                + " , flags = ?"
                + " , join_tables = ?"
                + " , linked_child_entity_column_id = ?"
                + " , linked_order_field = ?"
                + " , linked_parent_entity_id = ?"
                + " , order_value = ?"
                + " , table_name = ?"
                + " , title = ?"
                + " , type_id = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (additional_where"
                    + " , db_id"
                    + " , delete_field"
                    + " , descriptor_id"
                    + " , flags"
                    + " , join_tables"
                    + " , linked_child_entity_column_id"
                    + " , linked_order_field"
                    + " , linked_parent_entity_id"
                    + " , order_value"
                    + " , table_name"
                    + " , title"
                    + " , type_id"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (additional_where"
                    + " , db_id"
                    + " , delete_field"
                    + " , descriptor_id"
                    + " , flags"
                    + " , join_tables"
                    + " , linked_child_entity_column_id"
                    + " , linked_order_field"
                    + " , linked_parent_entity_id"
                    + " , order_value"
                    + " , table_name"
                    + " , title"
                    + " , type_id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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

    public TableEntityDescriptorHelper() {
        setIdName(F_ID);
        setTableName("copse_table_entity_descriptor");
    }
    public TableEntityDescriptorI buildFromMap(Map h) {
        TableEntityDescriptorI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_ADDITIONAL_WHERE) != null) { b.setAdditionalWhere((java.lang.String) h.get(F_ADDITIONAL_WHERE)); }
        if(h.get(F_DB_ID) != null) { b.setDbId( new java.lang.Integer(((Number) h.get(F_DB_ID)).intValue()));}
        if(h.get(F_DELETE_FIELD) != null) { b.setDeleteField((java.lang.String) h.get(F_DELETE_FIELD)); }
        if(h.get(F_DESCRIPTOR_ID) != null) { b.setDescriptorId( new java.lang.Integer(((Number) h.get(F_DESCRIPTOR_ID)).intValue()));}
        if(h.get(F_FLAGS) != null) { b.setFlags((java.lang.String) h.get(F_FLAGS)); }
        if(h.get(F_JOIN_TABLES) != null) { b.setJoinTables((java.lang.String) h.get(F_JOIN_TABLES)); }
        if(h.get(F_LINKED_CHILD_ENTITY_COLUMN_ID) != null) { b.setLinkedChildEntityColumnId((java.lang.String) h.get(F_LINKED_CHILD_ENTITY_COLUMN_ID)); }
        if(h.get(F_LINKED_ORDER_FIELD) != null) { b.setLinkedOrderField((java.lang.String) h.get(F_LINKED_ORDER_FIELD)); }
        if(h.get(F_LINKED_PARENT_ENTITY_ID) != null) { b.setLinkedParentEntityId( new java.lang.Integer(((Number) h.get(F_LINKED_PARENT_ENTITY_ID)).intValue()));}
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        if(h.get(F_TABLE_NAME) != null) { b.setTableName((java.lang.String) h.get(F_TABLE_NAME)); }
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        if(h.get(F_TYPE_ID) != null) { b.setTypeId( new java.lang.Integer(((Number) h.get(F_TYPE_ID)).intValue()));}
        return b;
    }

    public TableEntityDescriptorI createNewInstance() {
        return new TableEntityDescriptor();
    }

    public StringMapPair getDbUpdateQuery(String tableName, TableEntityDescriptorI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getAdditionalWhere());
        map.put(2, obj.getDbId());
        map.put(3, obj.getDeleteField());
        map.put(4, obj.getDescriptorId());
        map.put(5, obj.getFlags());
        map.put(6, obj.getJoinTables());
        map.put(7, obj.getLinkedChildEntityColumnId());
        map.put(8, obj.getLinkedOrderField());
        map.put(9, obj.getLinkedParentEntityId());
        map.put(10, obj.getOrderValue());
        map.put(11, obj.getTableName());
        map.put(12, obj.getTitle());
        map.put(13, obj.getTypeId());
        if (obj.getId() != null && !forceInsert) {
            map.put(14, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(14, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
