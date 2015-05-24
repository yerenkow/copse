package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class PermissionHelper extends AbstractMapConvertibleHelper<PermissionI> {

    public static final String UPDATE_SCRIPT = "update %s set deny = ?"
                + " , entity_id = ?"
                + " , group_id = ?"
                + " , permission_flags = ?"
                + " , user_id = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (deny"
                    + " , entity_id"
                    + " , group_id"
                    + " , permission_flags"
                    + " , user_id"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (deny"
                    + " , entity_id"
                    + " , group_id"
                    + " , permission_flags"
                    + " , user_id"
                    + " ) VALUES (?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_DENY = "deny";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_GROUP_ID = "group_id";
    public static final String F_PERMISSION_FLAGS = "permission_flags";
    public static final String F_USER_ID = "user_id";

    public PermissionHelper() {
        setIdName(F_ID);
        setTableName("copse_permission");
    }
    public PermissionI buildFromMap(Map h) {
        PermissionI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_DENY) != null) { b.setDeny((java.lang.Boolean) h.get(F_DENY)); }
        if(h.get(F_ENTITY_ID) != null) { b.setEntityId( new java.lang.Integer(((Number) h.get(F_ENTITY_ID)).intValue()));}
        if(h.get(F_GROUP_ID) != null) { b.setGroupId( new java.lang.Integer(((Number) h.get(F_GROUP_ID)).intValue()));}
        if(h.get(F_PERMISSION_FLAGS) != null) { b.setPermissionFlags((java.lang.String) h.get(F_PERMISSION_FLAGS)); }
        if(h.get(F_USER_ID) != null) { b.setUserId( new java.lang.Integer(((Number) h.get(F_USER_ID)).intValue()));}
        return b;
    }

    public PermissionI createNewInstance() {
        return new Permission();
    }

    public StringMapPair getDbUpdateQuery(String tableName, PermissionI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getDeny());
        map.put(2, obj.getEntityId());
        map.put(3, obj.getGroupId());
        map.put(4, obj.getPermissionFlags());
        map.put(5, obj.getUserId());
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
