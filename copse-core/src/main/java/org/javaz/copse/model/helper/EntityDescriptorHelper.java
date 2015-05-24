package org.javaz.copse.model.helper;

import org.javaz.copse.model.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class EntityDescriptorHelper extends AbstractMapConvertibleHelper<EntityDescriptorI> {

    public static final String UPDATE_SCRIPT = "update %s set title = ?"
                + " , type_id = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (title"
                    + " , type_id"
                    + " , id"
                    + " ) VALUES (?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (title"
                    + " , type_id"
                    + " ) VALUES (?, ?)";

    public static final String F_ID = "id";
    public static final String F_TITLE = "title";
    public static final String F_TYPE_ID = "type_id";

    public EntityDescriptorHelper() {
        setIdName(F_ID);
        setTableName("copse_entity_descriptor");
    }
    public EntityDescriptorI buildFromMap(Map h) {
        EntityDescriptorI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_TITLE) != null) { b.setTitle((java.lang.String) h.get(F_TITLE)); }
        if(h.get(F_TYPE_ID) != null) { b.setTypeId( new java.lang.Integer(((Number) h.get(F_TYPE_ID)).intValue()));}
        return b;
    }

    public EntityDescriptorI createNewInstance() {
        return new EntityDescriptor();
    }

    public StringMapPair getDbUpdateQuery(String tableName, EntityDescriptorI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getTitle());
        map.put(2, obj.getTypeId());
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
