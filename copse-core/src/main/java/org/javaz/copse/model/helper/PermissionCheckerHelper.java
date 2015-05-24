package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class PermissionCheckerHelper extends AbstractMapConvertibleHelper<PermissionCheckerI> {

    public static final String UPDATE_SCRIPT = "update %s set entity_descriptor_type_id = ?"
                + " , entity_id = ?"
                + " , factory_id = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (entity_descriptor_type_id"
                    + " , entity_id"
                    + " , factory_id"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (entity_descriptor_type_id"
                    + " , entity_id"
                    + " , factory_id"
                    + " ) VALUES (?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_ENTITY_DESCRIPTOR_TYPE_ID = "entity_descriptor_type_id";
    public static final String F_ENTITY_ID = "entity_id";
    public static final String F_FACTORY_ID = "factory_id";

    public PermissionCheckerHelper() {
        setIdName(F_ID);
        setTableName("copse_permission_checker");
    }
    public PermissionCheckerI buildFromMap(Map h) {
        PermissionCheckerI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_ENTITY_DESCRIPTOR_TYPE_ID) != null) { b.setEntityDescriptorTypeId( new java.lang.Integer(((Number) h.get(F_ENTITY_DESCRIPTOR_TYPE_ID)).intValue()));}
        if(h.get(F_ENTITY_ID) != null) { b.setEntityId( new java.lang.Integer(((Number) h.get(F_ENTITY_ID)).intValue()));}
        if(h.get(F_FACTORY_ID) != null) { b.setFactoryId( new java.lang.Integer(((Number) h.get(F_FACTORY_ID)).intValue()));}
        return b;
    }

    public PermissionCheckerI createNewInstance() {
        return new PermissionChecker();
    }

    public StringMapPair getDbUpdateQuery(String tableName, PermissionCheckerI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getEntityDescriptorTypeId());
        map.put(2, obj.getEntityId());
        map.put(3, obj.getFactoryId());
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
