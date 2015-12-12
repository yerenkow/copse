
package org.javaz.copse.web.fields.impl;

import org.javaz.copse.web.fields.iface.*;

import java.util.*;
import java.sql.*;
import java.io.Serializable;

public abstract class AbstractField implements FieldI {
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

    private java.lang.Integer id;
    private java.lang.Integer columnNumber;
    private java.lang.String defaultValue;
    private java.lang.String fieldName;
    private java.lang.Integer fieldRole;
    private java.lang.Integer fieldTypeId;
    private java.lang.String help;
    private java.lang.String htmlOverriddenLabel;
    private java.lang.String htmlOverriddenName;
    private java.lang.String javaType;
    private java.lang.Boolean nullable;
    private java.lang.Boolean numeric;
    private java.lang.String options;
    private java.lang.Integer orderValue;
    private java.lang.Integer ownerId;
    private java.lang.Integer pageId;
    private java.lang.Boolean readonly;
    private java.lang.Boolean required;
    private java.lang.String size;
    private java.lang.Boolean sortable;
    private java.lang.String sqlType;
    private java.lang.Integer type;
    private java.lang.Boolean useInSql;

    public AbstractField () {
    }

    public abstract AbstractField createNewInstance();

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }
    public Comparable getPrimaryKey() {
        return id;
    }

    public void setGeneratedPrimaryKey(Comparable key) {
        this.id = ((java.lang.Number) key).intValue();
    }
    public java.lang.Integer getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(java.lang.Integer columnNumber) {
        this.columnNumber = columnNumber;
    }
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }
    public java.lang.String getFieldName() {
        return fieldName;
    }

    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }
    public java.lang.Integer getFieldRole() {
        return fieldRole;
    }

    public void setFieldRole(java.lang.Integer fieldRole) {
        this.fieldRole = fieldRole;
    }
    public java.lang.Integer getFieldTypeId() {
        return fieldTypeId;
    }

    public void setFieldTypeId(java.lang.Integer fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
    }
    public java.lang.String getHelp() {
        return help;
    }

    public void setHelp(java.lang.String help) {
        this.help = help;
    }
    public java.lang.String getHtmlOverriddenLabel() {
        return htmlOverriddenLabel;
    }

    public void setHtmlOverriddenLabel(java.lang.String htmlOverriddenLabel) {
        this.htmlOverriddenLabel = htmlOverriddenLabel;
    }
    public java.lang.String getHtmlOverriddenName() {
        return htmlOverriddenName;
    }

    public void setHtmlOverriddenName(java.lang.String htmlOverriddenName) {
        this.htmlOverriddenName = htmlOverriddenName;
    }
    public java.lang.String getJavaType() {
        return javaType;
    }

    public void setJavaType(java.lang.String javaType) {
        this.javaType = javaType;
    }
    public java.lang.Boolean getNullable() {
        return nullable;
    }

    public void setNullable(java.lang.Boolean nullable) {
        this.nullable = nullable;
    }
    public java.lang.Boolean getNumeric() {
        return numeric;
    }

    public void setNumeric(java.lang.Boolean numeric) {
        this.numeric = numeric;
    }
    public java.lang.String getOptions() {
        return options;
    }

    public void setOptions(java.lang.String options) {
        this.options = options;
    }
    public java.lang.Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(java.lang.Integer orderValue) {
        this.orderValue = orderValue;
    }
    public java.lang.Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }
    public java.lang.Integer getPageId() {
        return pageId;
    }

    public void setPageId(java.lang.Integer pageId) {
        this.pageId = pageId;
    }
    public java.lang.Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(java.lang.Boolean readonly) {
        this.readonly = readonly;
    }
    public java.lang.Boolean getRequired() {
        return required;
    }

    public void setRequired(java.lang.Boolean required) {
        this.required = required;
    }
    public java.lang.String getSize() {
        return size;
    }

    public void setSize(java.lang.String size) {
        this.size = size;
    }
    public java.lang.Boolean getSortable() {
        return sortable;
    }

    public void setSortable(java.lang.Boolean sortable) {
        this.sortable = sortable;
    }
    public java.lang.String getSqlType() {
        return sqlType;
    }

    public void setSqlType(java.lang.String sqlType) {
        this.sqlType = sqlType;
    }
    public java.lang.Integer getType() {
        return type;
    }

    public void setType(java.lang.Integer type) {
        this.type = type;
    }
    public java.lang.Boolean getUseInSql() {
        return useInSql;
    }

    public void setUseInSql(java.lang.Boolean useInSql) {
        this.useInSql = useInSql;
    }

    public Object clone() throws CloneNotSupportedException {
        AbstractField clone = createNewInstance();
        clone.setId(getId());
        clone.setColumnNumber(getColumnNumber());
        clone.setDefaultValue(getDefaultValue());
        clone.setFieldName(getFieldName());
        clone.setFieldRole(getFieldRole());
        clone.setFieldTypeId(getFieldTypeId());
        clone.setHelp(getHelp());
        clone.setHtmlOverriddenLabel(getHtmlOverriddenLabel());
        clone.setHtmlOverriddenName(getHtmlOverriddenName());
        clone.setJavaType(getJavaType());
        clone.setNullable(getNullable());
        clone.setNumeric(getNumeric());
        clone.setOptions(getOptions());
        clone.setOrderValue(getOrderValue());
        clone.setOwnerId(getOwnerId());
        clone.setPageId(getPageId());
        clone.setReadonly(getReadonly());
        clone.setRequired(getRequired());
        clone.setSize(getSize());
        clone.setSortable(getSortable());
        clone.setSqlType(getSqlType());
        clone.setType(getType());
        clone.setUseInSql(getUseInSql());
        return clone;
    }

    public Map<String, String> toStringMap() {
        Map<String, String> h = new HashMap<String, String>();
        if(id != null) { h.put(F_ID, "" + getId()); }
        if(columnNumber != null) { h.put(F_COLUMN_NUMBER, "" + getColumnNumber()); }
        if(defaultValue != null) { h.put(F_DEFAULT_VALUE, "" + getDefaultValue()); }
        if(fieldName != null) { h.put(F_FIELD_NAME, "" + getFieldName()); }
        if(fieldRole != null) { h.put(F_FIELD_ROLE, "" + getFieldRole()); }
        if(fieldTypeId != null) { h.put(F_FIELD_TYPE_ID, "" + getFieldTypeId()); }
        if(help != null) { h.put(F_HELP, "" + getHelp()); }
        if(htmlOverriddenLabel != null) { h.put(F_HTML_OVERRIDDEN_LABEL, "" + getHtmlOverriddenLabel()); }
        if(htmlOverriddenName != null) { h.put(F_HTML_OVERRIDDEN_NAME, "" + getHtmlOverriddenName()); }
        if(javaType != null) { h.put(F_JAVA_TYPE, "" + getJavaType()); }
        if(nullable != null) { h.put(F_NULLABLE, "" + getNullable()); }
        if(numeric != null) { h.put(F_NUMERIC, "" + getNumeric()); }
        if(options != null) { h.put(F_OPTIONS, "" + getOptions()); }
        if(orderValue != null) { h.put(F_ORDER_VALUE, "" + getOrderValue()); }
        if(ownerId != null) { h.put(F_OWNER_ID, "" + getOwnerId()); }
        if(pageId != null) { h.put(F_PAGE_ID, "" + getPageId()); }
        if(readonly != null) { h.put(F_READONLY, "" + getReadonly()); }
        if(required != null) { h.put(F_REQUIRED, "" + getRequired()); }
        if(size != null) { h.put(F_SIZE, "" + getSize()); }
        if(sortable != null) { h.put(F_SORTABLE, "" + getSortable()); }
        if(sqlType != null) { h.put(F_SQL_TYPE, "" + getSqlType()); }
        if(type != null) { h.put(F_TYPE, "" + getType()); }
        if(useInSql != null) { h.put(F_USE_IN_SQL, "" + getUseInSql()); }
        return h;
    }

    public abstract void initExtendedOptions();
    public abstract java.lang.String getExtendedOption(String key);
    public abstract java.util.HashMap toHashMapSpecial(String view);
}
