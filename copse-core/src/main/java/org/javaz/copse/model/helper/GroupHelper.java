package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class GroupHelper extends AbstractMapConvertibleHelper<GroupI> {

    public static final String UPDATE_SCRIPT = "update %s set code = ?"
                + " , comments = ?"
                + " , enabled = ?"
                + " , parent_group_id = ?"
                + " , title = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (code"
                    + " , comments"
                    + " , enabled"
                    + " , parent_group_id"
                    + " , title"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (code"
                    + " , comments"
                    + " , enabled"
                    + " , parent_group_id"
                    + " , title"
                    + " ) VALUES (?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_CODE = "code";
    public static final String F_COMMENTS = "comments";
    public static final String F_ENABLED = "enabled";
    public static final String F_PARENT_GROUP_ID = "parent_group_id";
    public static final String F_TITLE = "title";

    public GroupHelper() {
        setIdName(F_ID);
        setTableName("copse_group");
    }
    public GroupI buildFromMap(Map h) {
        GroupI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_CODE) != null) { b.setCode((java.lang.String) h.get(F_CODE)); }
        if(h.get(F_COMMENTS) != null) { b.setComments((java.lang.String) h.get(F_COMMENTS)); }
        if(h.get(F_ENABLED) != null) { b.setEnabled((java.lang.Boolean) h.get(F_ENABLED)); }
        if(h.get(F_PARENT_GROUP_ID) != null) { b.setParentGroupId( new java.lang.Integer(((Number) h.get(F_PARENT_GROUP_ID)).intValue()));}
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        return b;
    }

    public GroupI createNewInstance() {
        return new Group();
    }

    public StringMapPair getDbUpdateQuery(String tableName, GroupI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getCode());
        map.put(2, obj.getComments());
        map.put(3, obj.getEnabled());
        map.put(4, obj.getParentGroupId());
        map.put(5, obj.getTitle());
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
