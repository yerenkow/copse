package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class MenuItemHelper extends AbstractMapConvertibleHelper<MenuItemI> {

    public static final String UPDATE_SCRIPT = "update %s set entity_id = ?"
                + " , order_value = ?"
                + " , parent_menu_id = ?"
                + " , title = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (entity_id"
                    + " , order_value"
                    + " , parent_menu_id"
                    + " , title"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (entity_id"
                    + " , order_value"
                    + " , parent_menu_id"
                    + " , title"
                    + " ) VALUES (?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_PARENT_MENU_ID = "parent_menu_id";
    public static final String F_TITLE = "title";

    public MenuItemHelper() {
        setIdName(F_ID);
        setTableName("copse_menu_item");
    }
    public MenuItemI buildFromMap(Map h) {
        MenuItemI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_ENTITY_ID) != null) { b.setEntityId( new java.lang.Integer(((Number) h.get(F_ENTITY_ID)).intValue()));}
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        if(h.get(F_PARENT_MENU_ID) != null) { b.setParentMenuId( new java.lang.Integer(((Number) h.get(F_PARENT_MENU_ID)).intValue()));}
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        return b;
    }

    public MenuItemI createNewInstance() {
        return new MenuItem();
    }

    public StringMapPair getDbUpdateQuery(String tableName, MenuItemI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getEntityId());
        map.put(2, obj.getOrderValue());
        map.put(3, obj.getParentMenuId());
        map.put(4, obj.getTitle());
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
