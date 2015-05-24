package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class UserHelper extends AbstractMapConvertibleHelper<UserI> {

    public static final String UPDATE_SCRIPT = "update %s set comments = ?"
                + " , enabled = ?"
                + " , name = ?"
                + " , oauth_id = ?"
                + " , parent_id = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (comments"
                    + " , enabled"
                    + " , name"
                    + " , oauth_id"
                    + " , parent_id"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (comments"
                    + " , enabled"
                    + " , name"
                    + " , oauth_id"
                    + " , parent_id"
                    + " ) VALUES (?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_COMMENTS = "comments";
    public static final String F_ENABLED = "enabled";
    public static final String F_NAME = "name";
    public static final String F_OAUTH_ID = "oauth_id";
    public static final String F_PARENT_ID = "parent_id";

    public UserHelper() {
        setIdName(F_ID);
        setTableName("copse_user");
    }
    public UserI buildFromMap(Map h) {
        UserI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_COMMENTS) != null) { b.setComments((java.lang.String) h.get(F_COMMENTS)); }
        if(h.get(F_ENABLED) != null) { b.setEnabled((java.lang.Boolean) h.get(F_ENABLED)); }
        if(h.get(F_NAME) != null) { b.setName((java.lang.String) h.get(F_NAME)); }
        if(h.get(F_OAUTH_ID) != null) { b.setOauthId((java.lang.String) h.get(F_OAUTH_ID)); }
        if(h.get(F_PARENT_ID) != null) { b.setParentId( new java.lang.Integer(((Number) h.get(F_PARENT_ID)).intValue()));}
        return b;
    }

    public UserI createNewInstance() {
        return new User();
    }

    public StringMapPair getDbUpdateQuery(String tableName, UserI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getComments());
        map.put(2, obj.getEnabled());
        map.put(3, obj.getName());
        map.put(4, obj.getOauthId());
        map.put(5, obj.getParentId());
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
