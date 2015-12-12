package org.javaz.copse.web.fields.iface;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.io.Serializable;


public interface FieldI extends MapConvertibleI  {
    public java.lang.Integer getId();
    public void setId(java.lang.Integer id);

    public java.lang.Integer getColumnNumber();
    public void setColumnNumber(java.lang.Integer columnNumber);

    public java.lang.String getDefaultValue();
    public void setDefaultValue(java.lang.String defaultValue);

    public java.lang.String getFieldName();
    public void setFieldName(java.lang.String fieldName);

    public java.lang.Integer getFieldRole();
    public void setFieldRole(java.lang.Integer fieldRole);

    public java.lang.Integer getFieldTypeId();
    public void setFieldTypeId(java.lang.Integer fieldTypeId);

    public java.lang.String getHelp();
    public void setHelp(java.lang.String help);

    public java.lang.String getHtmlOverriddenLabel();
    public void setHtmlOverriddenLabel(java.lang.String htmlOverriddenLabel);

    public java.lang.String getHtmlOverriddenName();
    public void setHtmlOverriddenName(java.lang.String htmlOverriddenName);

    public java.lang.String getJavaType();
    public void setJavaType(java.lang.String javaType);

    public java.lang.Boolean getNullable();
    public void setNullable(java.lang.Boolean nullable);

    public java.lang.Boolean getNumeric();
    public void setNumeric(java.lang.Boolean numeric);

    public java.lang.String getOptions();
    public void setOptions(java.lang.String options);

    public java.lang.Integer getOrderValue();
    public void setOrderValue(java.lang.Integer orderValue);

    public java.lang.Integer getOwnerId();
    public void setOwnerId(java.lang.Integer ownerId);

    public java.lang.Integer getPageId();
    public void setPageId(java.lang.Integer pageId);

    public java.lang.Boolean getReadonly();
    public void setReadonly(java.lang.Boolean readonly);

    public java.lang.Boolean getRequired();
    public void setRequired(java.lang.Boolean required);

    public java.lang.String getSize();
    public void setSize(java.lang.String size);

    public java.lang.Boolean getSortable();
    public void setSortable(java.lang.Boolean sortable);

    public java.lang.String getSqlType();
    public void setSqlType(java.lang.String sqlType);

    public java.lang.Integer getType();
    public void setType(java.lang.Integer type);

    public java.lang.Boolean getUseInSql();
    public void setUseInSql(java.lang.Boolean useInSql);


    public Map<String, String> toStringMap();

    public void initExtendedOptions();
    public java.lang.String getExtendedOption(String key);
    public java.util.HashMap toHashMapSpecial(String view);
}
