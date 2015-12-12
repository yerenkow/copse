package org.javaz.copse.web.fields.helper;

import org.javaz.copse.web.fields.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.copse.web.fields.impl.FieldType;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class FieldTypeHelper extends AbstractMapConvertibleHelper<FieldTypeI> {

    public static final String UPDATE_SCRIPT = "update %s set field_type = ?"
                + " , type = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (field_type"
                    + " , type"
                    + " , id"
                    + " ) VALUES (?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (field_type"
                    + " , type"
                    + " ) VALUES (?, ?)";

    public static final String F_ID = "id";
    public static final String F_FIELD_TYPE = "field_type";
    public static final String F_TYPE = "type";

    public FieldTypeHelper() {
        setIdName(F_ID);
        setTableName("copse_field_type");
    }
    public FieldTypeI buildFromMap(Map h) {
        FieldTypeI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_FIELD_TYPE) != null) { b.setFieldType((java.lang.String) h.get(F_FIELD_TYPE)); }
        if(h.get(F_TYPE) != null) { b.setType( new java.lang.Integer(((Number) h.get(F_TYPE)).intValue()));}
        return b;
    }

    public FieldTypeI createNewInstance() {
        return new FieldType();
    }

    public StringMapPair getDbUpdateQuery(String tableName, FieldTypeI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getFieldType());
        map.put(2, obj.getType());
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
