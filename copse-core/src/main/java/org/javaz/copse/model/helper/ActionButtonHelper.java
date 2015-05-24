package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class ActionButtonHelper extends AbstractMapConvertibleHelper<ActionButtonI> {

    public static final String UPDATE_SCRIPT = "update %s set action = ?"
                + " , applicable_action_list = ?"
                + " , entity_descriptor_type_id = ?"
                + " , entity_id = ?"
                + " , js_code = ?"
                + " , order_value = ?"
                + " , render_action_list = ?"
                + " , required_permissions = ?"
                + " , selection_type = ?"
                + " , title = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (action"
                    + " , applicable_action_list"
                    + " , entity_descriptor_type_id"
                    + " , entity_id"
                    + " , js_code"
                    + " , order_value"
                    + " , render_action_list"
                    + " , required_permissions"
                    + " , selection_type"
                    + " , title"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (action"
                    + " , applicable_action_list"
                    + " , entity_descriptor_type_id"
                    + " , entity_id"
                    + " , js_code"
                    + " , order_value"
                    + " , render_action_list"
                    + " , required_permissions"
                    + " , selection_type"
                    + " , title"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_ACTION = "action";
    public static final String F_APPLICABLE_ACTION_LIST = "applicable_action_list";
    public static final String F_ENTITY_DESCRIPTOR_TYPE_ID = "entity_descriptor_type_id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_JS_CODE = "js_code";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_RENDER_ACTION_LIST = "render_action_list";
    public static final String F_REQUIRED_PERMISSIONS = "required_permissions";
    public static final String F_SELECTION_TYPE = "selection_type";
    public static final String F_TITLE = "title";

    public ActionButtonHelper() {
        setIdName(F_ID);
        setTableName("copse_action_button");
    }
    public ActionButtonI buildFromMap(Map h) {
        ActionButtonI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_ACTION) != null) { b.setAction((java.lang.String) h.get(F_ACTION)); }
        if(h.get(F_APPLICABLE_ACTION_LIST) != null) { b.setApplicableActionList((java.lang.String) h.get(F_APPLICABLE_ACTION_LIST)); }
        if(h.get(F_ENTITY_DESCRIPTOR_TYPE_ID) != null) { b.setEntityDescriptorTypeId( new java.lang.Integer(((Number) h.get(F_ENTITY_DESCRIPTOR_TYPE_ID)).intValue()));}
        if(h.get(F_ENTITY_ID) != null) { b.setEntityId( new java.lang.Integer(((Number) h.get(F_ENTITY_ID)).intValue()));}
        if(h.get(F_JS_CODE) != null) { b.setJsCode((java.lang.String) h.get(F_JS_CODE)); }
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        if(h.get(F_RENDER_ACTION_LIST) != null) { b.setRenderActionList((java.lang.String) h.get(F_RENDER_ACTION_LIST)); }
        if(h.get(F_REQUIRED_PERMISSIONS) != null) { b.setRequiredPermissions((java.lang.String) h.get(F_REQUIRED_PERMISSIONS)); }
        if(h.get(F_SELECTION_TYPE) != null) { b.setSelectionType( new java.lang.Integer(((Number) h.get(F_SELECTION_TYPE)).intValue()));}
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        return b;
    }

    public ActionButtonI createNewInstance() {
        return new ActionButton();
    }

    public StringMapPair getDbUpdateQuery(String tableName, ActionButtonI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getAction());
        map.put(2, obj.getApplicableActionList());
        map.put(3, obj.getEntityDescriptorTypeId());
        map.put(4, obj.getEntityId());
        map.put(5, obj.getJsCode());
        map.put(6, obj.getOrderValue());
        map.put(7, obj.getRenderActionList());
        map.put(8, obj.getRequiredPermissions());
        map.put(9, obj.getSelectionType());
        map.put(10, obj.getTitle());
        if (obj.getId() != null && !forceInsert) {
            map.put(11, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(11, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
