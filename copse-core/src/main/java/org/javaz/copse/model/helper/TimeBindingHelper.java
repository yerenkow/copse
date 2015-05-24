package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class TimeBindingHelper extends AbstractMapConvertibleHelper<TimeBindingI> {

    public static final String UPDATE_SCRIPT = "update %s set enabled = ?"
                + " , from_time = ?"
                + " , record_id = ?"
                + " , till_time = ?"
                + " , type = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (enabled"
                    + " , from_time"
                    + " , record_id"
                    + " , till_time"
                    + " , type"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (enabled"
                    + " , from_time"
                    + " , record_id"
                    + " , till_time"
                    + " , type"
                    + " ) VALUES (?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_ENABLED = "enabled";
    public static final String F_FROM_TIME = "from_time";
    public static final String F_RECORD_ID = "record_id";
    public static final String F_TILL_TIME = "till_time";
    public static final String F_TYPE = "type";

    public TimeBindingHelper() {
        setIdName(F_ID);
        setTableName("copse_time_binding");
    }
    public TimeBindingI buildFromMap(Map h) {
        TimeBindingI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_ENABLED) != null) { b.setEnabled((java.lang.Boolean) h.get(F_ENABLED)); }
        if(h.get(F_FROM_TIME) != null) { b.setFromTime( new java.sql.Timestamp(((java.util.Date) h.get(F_FROM_TIME)).getTime()));}
        if(h.get(F_RECORD_ID) != null) { b.setRecordId( new java.lang.Integer(((Number) h.get(F_RECORD_ID)).intValue()));}
        if(h.get(F_TILL_TIME) != null) { b.setTillTime( new java.sql.Timestamp(((java.util.Date) h.get(F_TILL_TIME)).getTime()));}
        if(h.get(F_TYPE) != null) { b.setType( new java.lang.Integer(((Number) h.get(F_TYPE)).intValue()));}
        return b;
    }

    public TimeBindingI createNewInstance() {
        return new TimeBinding();
    }

    public StringMapPair getDbUpdateQuery(String tableName, TimeBindingI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getEnabled());
        map.put(2, obj.getFromTime());
        map.put(3, obj.getRecordId());
        map.put(4, obj.getTillTime());
        map.put(5, obj.getType());
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
