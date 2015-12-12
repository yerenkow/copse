package org.javaz.copse.web.fields.helper;

import org.javaz.copse.web.fields.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.copse.web.fields.impl.GenericTag;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class GenericTagHelper extends AbstractMapConvertibleHelper<GenericTagI> {

    public static final String UPDATE_SCRIPT = "update %s set category_id = ?"
                + " , title = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (category_id"
                    + " , title"
                    + " , id"
                    + " ) VALUES (?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (category_id"
                    + " , title"
                    + " ) VALUES (?, ?)";

    public static final String F_ID = "id";
    public static final String F_CATEGORY_ID = "category_id";
    public static final String F_TITLE = "title";

    public GenericTagHelper() {
        setIdName(F_ID);
        setTableName("copse_generic_tag");
    }
    public GenericTagI buildFromMap(Map h) {
        GenericTagI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_CATEGORY_ID) != null) { b.setCategoryId( new java.lang.Integer(((Number) h.get(F_CATEGORY_ID)).intValue()));}
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        return b;
    }

    public GenericTagI createNewInstance() {
        return new GenericTag();
    }

    public StringMapPair getDbUpdateQuery(String tableName, GenericTagI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getCategoryId());
        map.put(2, obj.getTitle());
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
