package org.javaz.copse.web.fields.helper;

import org.javaz.copse.web.fields.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.copse.web.fields.impl.Field;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;

public class FieldHelper extends AbstractMapConvertibleHelper<FieldI> {

    public static final String UPDATE_SCRIPT = "update %s set column_number = ?"
                + " , default_value = ?"
                + " , field_name = ?"
                + " , field_role = ?"
                + " , field_type_id = ?"
                + " , help = ?"
                + " , html_overridden_label = ?"
                + " , html_overridden_name = ?"
                + " , java_type = ?"
                + " , nullable = ?"
                + " , numeric = ?"
                + " , options = ?"
                + " , order_value = ?"
                + " , owner_id = ?"
                + " , page_id = ?"
                + " , readonly = ?"
                + " , required = ?"
                + " , size = ?"
                + " , sortable = ?"
                + " , sql_type = ?"
                + " , type = ?"
                + " , use_in_sql = ?"
                + "  where id = ?";

    public static final String INSERT_SCRIPT_ID = "insert into %s (column_number"
                    + " , default_value"
                    + " , field_name"
                    + " , field_role"
                    + " , field_type_id"
                    + " , help"
                    + " , html_overridden_label"
                    + " , html_overridden_name"
                    + " , java_type"
                    + " , nullable"
                    + " , numeric"
                    + " , options"
                    + " , order_value"
                    + " , owner_id"
                    + " , page_id"
                    + " , readonly"
                    + " , required"
                    + " , size"
                    + " , sortable"
                    + " , sql_type"
                    + " , type"
                    + " , use_in_sql"
                    + " , id"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (column_number"
                    + " , default_value"
                    + " , field_name"
                    + " , field_role"
                    + " , field_type_id"
                    + " , help"
                    + " , html_overridden_label"
                    + " , html_overridden_name"
                    + " , java_type"
                    + " , nullable"
                    + " , numeric"
                    + " , options"
                    + " , order_value"
                    + " , owner_id"
                    + " , page_id"
                    + " , readonly"
                    + " , required"
                    + " , size"
                    + " , sortable"
                    + " , sql_type"
                    + " , type"
                    + " , use_in_sql"
                    + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String F_ID = "id";
    public static final String F_COLUMN_NUMBER = "column_number";
    public static final String F_DEFAULT_VALUE = "default_value";
    public static final String F_FIELD_NAME = "field_name";
    public static final String F_FIELD_ROLE = "field_role";
    public static final String F_FIELD_TYPE_ID = "field_type_id";
    public static final String F_HELP = "help";
    public static final String F_HTML_OVERRIDDEN_LABEL = "html_overridden_label";
    public static final String F_HTML_OVERRIDDEN_NAME = "html_overridden_name";
    public static final String F_JAVA_TYPE = "java_type";
    public static final String F_NULLABLE = "nullable";
    public static final String F_NUMERIC = "numeric";
    public static final String F_OPTIONS = "options";
    public static final String F_ORDER_VALUE = "order_value";
    public static final String F_OWNER_ID = "owner_id";
    public static final String F_PAGE_ID = "page_id";
    public static final String F_READONLY = "readonly";
    public static final String F_REQUIRED = "required";
    public static final String F_SIZE = "size";
    public static final String F_SORTABLE = "sortable";
    public static final String F_SQL_TYPE = "sql_type";
    public static final String F_TYPE = "type";
    public static final String F_USE_IN_SQL = "use_in_sql";

    public FieldHelper() {
        setIdName(F_ID);
        setTableName("copse_field");
    }
    public FieldI buildFromMap(Map h) {
        FieldI b = createNewInstance();
        if(h.get(F_ID) != null) { b.setId( new java.lang.Integer(((Number) h.get(F_ID)).intValue()));}
        if(h.get(F_COLUMN_NUMBER) != null) { b.setColumnNumber( new java.lang.Integer(((Number) h.get(F_COLUMN_NUMBER)).intValue()));}
        if(h.get(F_DEFAULT_VALUE) != null) { b.setDefaultValue((java.lang.String) h.get(F_DEFAULT_VALUE)); }
        if(h.get(F_FIELD_NAME) != null) { b.setFieldName((java.lang.String) h.get(F_FIELD_NAME)); }
        if(h.get(F_FIELD_ROLE) != null) { b.setFieldRole( new java.lang.Integer(((Number) h.get(F_FIELD_ROLE)).intValue()));}
        if(h.get(F_FIELD_TYPE_ID) != null) { b.setFieldTypeId( new java.lang.Integer(((Number) h.get(F_FIELD_TYPE_ID)).intValue()));}
        if(h.get(F_HELP) != null) { b.setHelp((java.lang.String) h.get(F_HELP)); }
        if(h.get(F_HTML_OVERRIDDEN_LABEL) != null) { b.setHtmlOverriddenLabel((java.lang.String) h.get(F_HTML_OVERRIDDEN_LABEL)); }
        if(h.get(F_HTML_OVERRIDDEN_NAME) != null) { b.setHtmlOverriddenName((java.lang.String) h.get(F_HTML_OVERRIDDEN_NAME)); }
        if(h.get(F_JAVA_TYPE) != null) { b.setJavaType((java.lang.String) h.get(F_JAVA_TYPE)); }
        if(h.get(F_NULLABLE) != null) { b.setNullable((java.lang.Boolean) h.get(F_NULLABLE)); }
        if(h.get(F_NUMERIC) != null) { b.setNumeric((java.lang.Boolean) h.get(F_NUMERIC)); }
        if(h.get(F_OPTIONS) != null) { b.setOptions((java.lang.String) h.get(F_OPTIONS)); }
        if(h.get(F_ORDER_VALUE) != null) { b.setOrderValue( new java.lang.Integer(((Number) h.get(F_ORDER_VALUE)).intValue()));}
        if(h.get(F_OWNER_ID) != null) { b.setOwnerId( new java.lang.Integer(((Number) h.get(F_OWNER_ID)).intValue()));}
        if(h.get(F_PAGE_ID) != null) { b.setPageId( new java.lang.Integer(((Number) h.get(F_PAGE_ID)).intValue()));}
        if(h.get(F_READONLY) != null) { b.setReadonly((java.lang.Boolean) h.get(F_READONLY)); }
        if(h.get(F_REQUIRED) != null) { b.setRequired((java.lang.Boolean) h.get(F_REQUIRED)); }
        if(h.get(F_SIZE) != null) { b.setSize((java.lang.String) h.get(F_SIZE)); }
        if(h.get(F_SORTABLE) != null) { b.setSortable((java.lang.Boolean) h.get(F_SORTABLE)); }
        if(h.get(F_SQL_TYPE) != null) { b.setSqlType((java.lang.String) h.get(F_SQL_TYPE)); }
        if(h.get(F_TYPE) != null) { b.setType( new java.lang.Integer(((Number) h.get(F_TYPE)).intValue()));}
        if(h.get(F_USE_IN_SQL) != null) { b.setUseInSql((java.lang.Boolean) h.get(F_USE_IN_SQL)); }
        return b;
    }

    public FieldI createNewInstance() {
        return new Field();
    }

    public StringMapPair getDbUpdateQuery(String tableName, FieldI obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        map.put(1, obj.getColumnNumber());
        map.put(2, obj.getDefaultValue());
        map.put(3, obj.getFieldName());
        map.put(4, obj.getFieldRole());
        map.put(5, obj.getFieldTypeId());
        map.put(6, obj.getHelp());
        map.put(7, obj.getHtmlOverriddenLabel());
        map.put(8, obj.getHtmlOverriddenName());
        map.put(9, obj.getJavaType());
        map.put(10, obj.getNullable());
        map.put(11, obj.getNumeric());
        map.put(12, obj.getOptions());
        map.put(13, obj.getOrderValue());
        map.put(14, obj.getOwnerId());
        map.put(15, obj.getPageId());
        map.put(16, obj.getReadonly());
        map.put(17, obj.getRequired());
        map.put(18, obj.getSize());
        map.put(19, obj.getSortable());
        map.put(20, obj.getSqlType());
        map.put(21, obj.getType());
        map.put(22, obj.getUseInSql());
        if (obj.getId() != null && !forceInsert) {
            map.put(23, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(23, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
}
