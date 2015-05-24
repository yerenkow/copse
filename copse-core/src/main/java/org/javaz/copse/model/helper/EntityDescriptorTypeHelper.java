package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class EntityDescriptorTypeHelper extends AbstractMapConvertibleHelper<EntityDescriptorTypeI> {

    public static final String UPDATE_SCRIPT = "update %s set default_action = ?"
                + " , factory_id = ?"
                + " , title = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (default_action"
                    + " , factory_id"
                    + " , title"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (default_action"
                    + " , factory_id"
                    + " , title"
                    + " ) VALUES (?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_DEFAULT_ACTION = "default_action";
    public static final String F_FACTORY_ID = "factory_id";
    public static final String F_TITLE = "title";

    public EntityDescriptorTypeHelper() {
        setIdName(F_ID);
        setTableName("copse_entity_descriptor_type");
    }
    public EntityDescriptorTypeI buildFromMap(Map h) {
        EntityDescriptorTypeI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_DEFAULT_ACTION) != null) { b.setDefaultAction((java.lang.String) h.get(F_DEFAULT_ACTION)); }
        if(h.get(F_FACTORY_ID) != null) { b.setFactoryId( new java.lang.Integer(((Number) h.get(F_FACTORY_ID)).intValue()));}
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        return b;
    }

    public EntityDescriptorTypeI createNewInstance() {
        return new EntityDescriptorType();
    }

    public StringMapPair getDbUpdateQuery(String tableName, EntityDescriptorTypeI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getDefaultAction());
        map.put(2, obj.getFactoryId());
        map.put(3, obj.getTitle());
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
