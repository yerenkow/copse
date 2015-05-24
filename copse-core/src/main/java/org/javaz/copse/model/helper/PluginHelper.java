package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class PluginHelper extends AbstractMapConvertibleHelper<PluginI> {

    public static final String UPDATE_SCRIPT = "update %s set class_name = ?"
                + " , config = ?"
                + " , entity_id = ?"
                + " , order_value = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (class_name"
                    + " , config"
                    + " , entity_id"
                    + " , order_value"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (class_name"
                    + " , config"
                    + " , entity_id"
                    + " , order_value"
                    + " ) VALUES (?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_CLASS_NAME = "class_name";
    public static final String F_CONFIG = "config";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_ORDER_VALUE = "order_value";

    public PluginHelper() {
        setIdName(F_ID);
        setTableName("copse_plugin");
    }
    public PluginI buildFromMap(Map h) {
        PluginI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_CLASS_NAME) != null) { b.setClassName((java.lang.String) h.get(F_CLASS_NAME)); }
        if(h.get(F_CONFIG) != null) { b.setConfig((java.lang.String) h.get(F_CONFIG)); }
        if(h.get(F_ENTITY_ID) != null) { b.setEntityId( new java.lang.Integer(((Number) h.get(F_ENTITY_ID)).intValue()));}
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        return b;
    }

    public PluginI createNewInstance() {
        return new Plugin();
    }

    public StringMapPair getDbUpdateQuery(String tableName, PluginI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getClassName());
        map.put(2, obj.getConfig());
        map.put(3, obj.getEntityId());
        map.put(4, obj.getOrderValue());
        if (obj.getId() != null && !forceInsert) {
            map.put(5, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(5, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
