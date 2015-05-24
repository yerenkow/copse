package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class DataBaseHelper extends AbstractMapConvertibleHelper<DataBaseI> {

    public static final String UPDATE_SCRIPT = "update %s set config = ?"
                + " , factory_id = ?"
                + " , login = ?"
                + " , name = ?"
                + " , password = ?"
                + " , url = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (config"
                    + " , factory_id"
                    + " , login"
                    + " , name"
                    + " , password"
                    + " , url"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (config"
                    + " , factory_id"
                    + " , login"
                    + " , name"
                    + " , password"
                    + " , url"
                    + " ) VALUES (?, ?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_CONFIG = "config";
    public static final String F_FACTORY_ID = "factory_id";
    public static final String F_LOGIN = "login";
    public static final String F_NAME = "name";
    public static final String F_PASSWORD = "password";
    public static final String F_URL = "url";

    public DataBaseHelper() {
        setIdName(F_ID);
        setTableName("copse_data_base");
    }
    public DataBaseI buildFromMap(Map h) {
        DataBaseI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_CONFIG) != null) { b.setConfig((java.lang.String) h.get(F_CONFIG)); }
        if(h.get(F_FACTORY_ID) != null) { b.setFactoryId( new java.lang.Integer(((Number) h.get(F_FACTORY_ID)).intValue()));}
        if(h.get(F_LOGIN) != null) { b.setLogin((java.lang.String) h.get(F_LOGIN)); }
        if(h.get(F_NAME) != null) { b.setName((java.lang.String) h.get(F_NAME)); }
        if(h.get(F_PASSWORD) != null) { b.setPassword((java.lang.String) h.get(F_PASSWORD)); }
        if(h.get(F_URL) != null) { b.setUrl((java.lang.String) h.get(F_URL)); }
        return b;
    }

    public DataBaseI createNewInstance() {
        return new DataBase();
    }

    public StringMapPair getDbUpdateQuery(String tableName, DataBaseI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getConfig());
        map.put(2, obj.getFactoryId());
        map.put(3, obj.getLogin());
        map.put(4, obj.getName());
        map.put(5, obj.getPassword());
        map.put(6, obj.getUrl());
        if (obj.getId() != null && !forceInsert) {
            map.put(7, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(7, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
