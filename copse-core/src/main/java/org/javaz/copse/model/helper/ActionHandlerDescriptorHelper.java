package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class ActionHandlerDescriptorHelper extends AbstractMapConvertibleHelper<ActionHandlerDescriptorI> {

    public static final String UPDATE_SCRIPT = "update %s set applicable_action_list = ?"
                + " , config = ?"
                + " , entity_descriptor_type_id = ?"
                + " , entity_id = ?"
                + " , factory_id = ?"
                + " , order_value = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (applicable_action_list"
                    + " , config"
                    + " , entity_descriptor_type_id"
                    + " , entity_id"
                    + " , factory_id"
                    + " , order_value"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (applicable_action_list"
                    + " , config"
                    + " , entity_descriptor_type_id"
                    + " , entity_id"
                    + " , factory_id"
                    + " , order_value"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_APPLICABLE_ACTION_LIST = "applicable_action_list";
    public static final String F_CONFIG = "config";
    public static final String F_ENTITY_DESCRIPTOR_TYPE_ID = "entity_descriptor_type_id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_FACTORY_ID = "factory_id";
    public static final String F_ORDER_VALUE = "order_value";

    public ActionHandlerDescriptorHelper() {
        setIdName(F_ID);
        setTableName("copse_action_handler_descriptor");
    }
    public ActionHandlerDescriptorI buildFromMap(Map h) {
        ActionHandlerDescriptorI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_APPLICABLE_ACTION_LIST) != null) { b.setApplicableActionList((java.lang.String) h.get(F_APPLICABLE_ACTION_LIST)); }
        if(h.get(F_CONFIG) != null) { b.setConfig((java.lang.String) h.get(F_CONFIG)); }
        if(h.get(F_ENTITY_DESCRIPTOR_TYPE_ID) != null) { b.setEntityDescriptorTypeId( new java.lang.Integer(((Number) h.get(F_ENTITY_DESCRIPTOR_TYPE_ID)).intValue()));}
        if(h.get(F_ENTITY_ID) != null) { b.setEntityId( new java.lang.Integer(((Number) h.get(F_ENTITY_ID)).intValue()));}
        if(h.get(F_FACTORY_ID) != null) { b.setFactoryId( new java.lang.Integer(((Number) h.get(F_FACTORY_ID)).intValue()));}
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        return b;
    }

    public ActionHandlerDescriptorI createNewInstance() {
        return new ActionHandlerDescriptor();
    }

    public StringMapPair getDbUpdateQuery(String tableName, ActionHandlerDescriptorI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getApplicableActionList());
        map.put(2, obj.getConfig());
        map.put(3, obj.getEntityDescriptorTypeId());
        map.put(4, obj.getEntityId());
        map.put(5, obj.getFactoryId());
        map.put(6, obj.getOrderValue());
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
