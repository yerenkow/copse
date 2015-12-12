package org.javaz.copse.web.table.helper;

import org.javaz.copse.web.table.iface.*;
import org.javaz.copse.web.table.impl.SqlCondition;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class SqlConditionHelper extends AbstractMapConvertibleHelper<SqlConditionI> {

    public static final String UPDATE_SCRIPT = "update %s set entity_id = ?"
                + " , java_type = ?"
                + " , key = ?"
                + " , order_value = ?"
                + " , type = ?"
                + " , value = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (entity_id"
                    + " , java_type"
                    + " , key"
                    + " , order_value"
                    + " , type"
                    + " , value"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (entity_id"
                    + " , java_type"
                    + " , key"
                    + " , order_value"
                    + " , type"
                    + " , value"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_JAVA_TYPE = "java_type";
    public static final String F_KEY = "key";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_TYPE = "type";
    public static final String F_VALUE = "value";

    public SqlConditionHelper() {
        setIdName(F_ID);
        setTableName("copse_sql_condition");
    }
    public SqlConditionI buildFromMap(Map h) {
        SqlConditionI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_ENTITY_ID) != null) { b.setEntityId( new java.lang.Integer(((Number) h.get(F_ENTITY_ID)).intValue()));}
        if(h.get(F_JAVA_TYPE) != null) { b.setJavaType((java.lang.String) h.get(F_JAVA_TYPE)); }
        if(h.get(F_KEY) != null) { b.setKey((java.lang.String) h.get(F_KEY)); }
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        if(h.get(F_TYPE) != null) { b.setType( new java.lang.Integer(((Number) h.get(F_TYPE)).intValue()));}
        if(h.get(F_VALUE) != null) { b.setValue((java.lang.String) h.get(F_VALUE)); }
        return b;
    }

    public SqlConditionI createNewInstance() {
        return new SqlCondition();
    }

    public StringMapPair getDbUpdateQuery(String tableName, SqlConditionI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getEntityId());
        map.put(2, obj.getJavaType());
        map.put(3, obj.getKey());
        map.put(4, obj.getOrderValue());
        map.put(5, obj.getType());
        map.put(6, obj.getValue());
        if (obj.getId() != null && !forceInsert) {
            map.put(7, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(7, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
