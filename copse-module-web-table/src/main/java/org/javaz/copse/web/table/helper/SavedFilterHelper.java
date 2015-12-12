package org.javaz.copse.web.table.helper;

import org.javaz.copse.web.table.iface.*;
import org.javaz.copse.web.table.impl.SavedFilter;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class SavedFilterHelper extends AbstractMapConvertibleHelper<SavedFilterI> {

    public static final String UPDATE_SCRIPT = "update %s set created_when = ?"
                + " , entity_id = ?"
                + " , group_id = ?"
                + " , is_default = ?"
                + " , order_value = ?"
                + " , title = ?"
                + " , user_id = ?"
                + " , value = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (created_when"
                    + " , entity_id"
                    + " , group_id"
                    + " , is_default"
                    + " , order_value"
                    + " , title"
                    + " , user_id"
                    + " , value"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (created_when"
                    + " , entity_id"
                    + " , group_id"
                    + " , is_default"
                    + " , order_value"
                    + " , title"
                    + " , user_id"
                    + " , value"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_CREATED_WHEN = "created_when";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_GROUP_ID = "group_id";
    public static final String F_IS_DEFAULT = "is_default";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_TITLE = "title";
    public static final String F_USER_ID = "user_id";
    public static final String F_VALUE = "value";

    public SavedFilterHelper() {
        setIdName(F_ID);
        setTableName("copse_saved_filter");
    }
    public SavedFilterI buildFromMap(Map h) {
        SavedFilterI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_CREATED_WHEN) != null) { b.setCreatedWhen( new java.sql.Timestamp(((java.util.Date) h.get(F_CREATED_WHEN)).getTime()));}
        if(h.get(F_ENTITY_ID) != null) { b.setEntityId( new java.lang.Integer(((Number) h.get(F_ENTITY_ID)).intValue()));}
        if(h.get(F_GROUP_ID) != null) { b.setGroupId( new java.lang.Integer(((Number) h.get(F_GROUP_ID)).intValue()));}
        if(h.get(F_IS_DEFAULT) != null) { b.setIsDefault((java.lang.Boolean) h.get(F_IS_DEFAULT)); }
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        if(h.get(F_USER_ID) != null) { b.setUserId( new java.lang.Integer(((Number) h.get(F_USER_ID)).intValue()));}
        if(h.get(F_VALUE) != null) { b.setValue((java.lang.String) h.get(F_VALUE)); }
        return b;
    }

    public SavedFilterI createNewInstance() {
        return new SavedFilter();
    }

    public StringMapPair getDbUpdateQuery(String tableName, SavedFilterI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getCreatedWhen());
        map.put(2, obj.getEntityId());
        map.put(3, obj.getGroupId());
        map.put(4, obj.getIsDefault());
        map.put(5, obj.getOrderValue());
        map.put(6, obj.getTitle());
        map.put(7, obj.getUserId());
        map.put(8, obj.getValue());
        if (obj.getId() != null && !forceInsert) {
            map.put(9, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(9, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
