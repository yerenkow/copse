package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class UserToUserGrantHelper extends AbstractMapConvertibleHelper<UserToUserGrantI> {

    public static final String UPDATE_SCRIPT = "update %s set child_user_id = ?"
                + " , comments = ?"
                + " , created_when = ?"
                + " , enabled = ?"
                + " , parent_user_id = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (child_user_id"
                    + " , comments"
                    + " , created_when"
                    + " , enabled"
                    + " , parent_user_id"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (child_user_id"
                    + " , comments"
                    + " , created_when"
                    + " , enabled"
                    + " , parent_user_id"
                    + " ) VALUES (?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_CHILD_USER_ID = "child_user_id";
    public static final String F_COMMENTS = "comments";
    public static final String F_CREATED_WHEN = "created_when";
    public static final String F_ENABLED = "enabled";
    public static final String F_PARENT_USER_ID = "parent_user_id";

    public UserToUserGrantHelper() {
        setIdName(F_ID);
        setTableName("copse_user_to_user_grant");
    }
    public UserToUserGrantI buildFromMap(Map h) {
        UserToUserGrantI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_CHILD_USER_ID) != null) { b.setChildUserId( new java.lang.Integer(((Number) h.get(F_CHILD_USER_ID)).intValue()));}
        if(h.get(F_COMMENTS) != null) { b.setComments((java.lang.String) h.get(F_COMMENTS)); }
        if(h.get(F_CREATED_WHEN) != null) { b.setCreatedWhen( new java.sql.Timestamp(((java.util.Date) h.get(F_CREATED_WHEN)).getTime()));}
        if(h.get(F_ENABLED) != null) { b.setEnabled((java.lang.Boolean) h.get(F_ENABLED)); }
        if(h.get(F_PARENT_USER_ID) != null) { b.setParentUserId( new java.lang.Integer(((Number) h.get(F_PARENT_USER_ID)).intValue()));}
        return b;
    }

    public UserToUserGrantI createNewInstance() {
        return new UserToUserGrant();
    }

    public StringMapPair getDbUpdateQuery(String tableName, UserToUserGrantI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getChildUserId());
        map.put(2, obj.getComments());
        map.put(3, obj.getCreatedWhen());
        map.put(4, obj.getEnabled());
        map.put(5, obj.getParentUserId());
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
