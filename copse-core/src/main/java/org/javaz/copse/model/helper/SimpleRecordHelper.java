package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class SimpleRecordHelper extends AbstractMapConvertibleHelper<SimpleRecordI> {

    public static final String UPDATE_SCRIPT = "update %s set order_value = ?"
                + " , string_key = ?"
                + " , string_value = ?"
                + " , string_value2 = ?"
                + " , type = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (order_value"
                    + " , string_key"
                    + " , string_value"
                    + " , string_value2"
                    + " , type"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (order_value"
                    + " , string_key"
                    + " , string_value"
                    + " , string_value2"
                    + " , type"
                    + " ) VALUES (?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_STRING_KEY = "string_key";
    public static final String F_STRING_VALUE = "string_value";
    public static final String F_STRING_VALUE2 = "string_value2";
    public static final String F_TYPE = "type";

    public SimpleRecordHelper() {
        setIdName(F_ID);
        setTableName("copse_simple_record");
    }
    public SimpleRecordI buildFromMap(Map h) {
        SimpleRecordI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        if(h.get(F_STRING_KEY) != null) { b.setStringKey((java.lang.String) h.get(F_STRING_KEY)); }
        if(h.get(F_STRING_VALUE) != null) { b.setStringValue((java.lang.String) h.get(F_STRING_VALUE)); }
        if(h.get(F_STRING_VALUE2) != null) { b.setStringValue2((java.lang.String) h.get(F_STRING_VALUE2)); }
        if(h.get(F_TYPE) != null) { b.setType( new java.lang.Integer(((Number) h.get(F_TYPE)).intValue()));}
        return b;
    }

    public SimpleRecordI createNewInstance() {
        return new SimpleRecord();
    }

    public StringMapPair getDbUpdateQuery(String tableName, SimpleRecordI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getOrderValue());
        map.put(2, obj.getStringKey());
        map.put(3, obj.getStringValue());
        map.put(4, obj.getStringValue2());
        map.put(5, obj.getType());
        if (obj.getId() != null && !forceInsert) {
            map.put(6, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(6, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
