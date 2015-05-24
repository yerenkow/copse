package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class GenericFactoryHelper extends AbstractMapConvertibleHelper<GenericFactoryI> {

    public static final String UPDATE_SCRIPT = "update %s set factory_class = ?"
                + " , name = ?"
                + " , type = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (factory_class"
                    + " , name"
                    + " , type"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (factory_class"
                    + " , name"
                    + " , type"
                    + " ) VALUES (?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_FACTORY_CLASS = "factory_class";
    public static final String F_NAME = "name";
    public static final String F_TYPE = "type";

    public GenericFactoryHelper() {
        setIdName(F_ID);
        setTableName("copse_generic_factory");
    }
    public GenericFactoryI buildFromMap(Map h) {
        GenericFactoryI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_FACTORY_CLASS) != null) { b.setFactoryClass((java.lang.String) h.get(F_FACTORY_CLASS)); }
        if(h.get(F_NAME) != null) { b.setName((java.lang.String) h.get(F_NAME)); }
        if(h.get(F_TYPE) != null) { b.setType( new java.lang.Integer(((Number) h.get(F_TYPE)).intValue()));}
        return b;
    }

    public GenericFactoryI createNewInstance() {
        return new GenericFactory();
    }

    public StringMapPair getDbUpdateQuery(String tableName, GenericFactoryI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getFactoryClass());
        map.put(2, obj.getName());
        map.put(3, obj.getType());
        if (obj.getId() != null && !forceInsert) {
            map.put(4, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(4, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
