package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class LanguageHelper extends AbstractMapConvertibleHelper<LanguageI> {

    public static final String UPDATE_SCRIPT = "update %s set title = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (title"
                    + " , id"
                    + " ) VALUES (?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (title"
                    + " ) VALUES (?)";

    public static final String F_ID = "id";
    public static final String F_TITLE = "title";

    public LanguageHelper() {
        setIdName(F_ID);
        setTableName("copse_language");
    }
    public LanguageI buildFromMap(Map h) {
        LanguageI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        return b;
    }

    public LanguageI createNewInstance() {
        return new Language();
    }

    public StringMapPair getDbUpdateQuery(String tableName, LanguageI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getTitle());
        if (obj.getId() != null && !forceInsert) {
            map.put(2, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(2, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
