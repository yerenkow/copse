package org.javaz.copse.web.fields.helper;

import org.javaz.copse.web.fields.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.copse.web.fields.impl.TagLink;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class TagLinkHelper extends AbstractMapConvertibleHelper<TagLinkI> {

    public static final String UPDATE_SCRIPT = "update %s set category_id = ?"
                + " , record_id = ?"
                + " , tag_id = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (category_id"
                    + " , record_id"
                    + " , tag_id"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (category_id"
                    + " , record_id"
                    + " , tag_id"
                    + " ) VALUES (?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_CATEGORY_ID = "category_id";
    public static final String F_RECORD_ID = "record_id";
    public static final String F_TAG_ID = "tag_id";

    public TagLinkHelper() {
        setIdName(F_ID);
        setTableName("copse_tag_link");
    }
    public TagLinkI buildFromMap(Map h) {
        TagLinkI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_CATEGORY_ID) != null) { b.setCategoryId( new java.lang.Integer(((Number) h.get(F_CATEGORY_ID)).intValue()));}
        if(h.get(F_RECORD_ID) != null) { b.setRecordId( new java.lang.Integer(((Number) h.get(F_RECORD_ID)).intValue()));}
        if(h.get(F_TAG_ID) != null) { b.setTagId( new java.lang.Integer(((Number) h.get(F_TAG_ID)).intValue()));}
        return b;
    }

    public TagLinkI createNewInstance() {
        return new TagLink();
    }

    public StringMapPair getDbUpdateQuery(String tableName, TagLinkI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getCategoryId());
        map.put(2, obj.getRecordId());
        map.put(3, obj.getTagId());
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
