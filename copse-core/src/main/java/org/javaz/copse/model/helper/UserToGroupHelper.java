package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class UserToGroupHelper extends AbstractMapConvertibleHelper<UserToGroupI> {

    public static final String UPDATE_SCRIPT = "update %s set group_id = ?"
                + " , user_id = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (group_id"
                    + " , user_id"
                    + " , id"
                    + " ) VALUES (?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (group_id"
                    + " , user_id"
                    + " ) VALUES (?, ?)";

    public static final String F_ID = "id";
    public static final String F_GROUP_ID = "group_id";
    public static final String F_USER_ID = "user_id";

    public UserToGroupHelper() {
        setIdName(F_ID);
        setTableName("copse_user_to_group");
    }
    public UserToGroupI buildFromMap(Map h) {
        UserToGroupI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_GROUP_ID) != null) { b.setGroupId( new java.lang.Integer(((Number) h.get(F_GROUP_ID)).intValue()));}
        if(h.get(F_USER_ID) != null) { b.setUserId( new java.lang.Integer(((Number) h.get(F_USER_ID)).intValue()));}
        return b;
    }

    public UserToGroupI createNewInstance() {
        return new UserToGroup();
    }

    public StringMapPair getDbUpdateQuery(String tableName, UserToGroupI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getGroupId());
        map.put(2, obj.getUserId());
        if (obj.getId() != null && !forceInsert) {
            map.put(3, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(3, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
