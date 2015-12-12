<#if bean??>
    <#assign beanName = bean.name >
    <#if beanName?index_of(":") &gt; 0 >
        <#assign beanName=beanName?substring(0, bean.name?index_of(":")) >
    </#if>
    <#if !dbQuery??>
        <#assign dbQuery = "true">
    </#if>
    <#if !comma??>
        <#assign comma = false>
    </#if>
    <#if !subpkg??>
        <#assign subpkg = "helper">
    </#if>
    <#assign attributes = bean.attributes>
package ${package}.${subpkg};

import ${package}.iface.*;
import org.javaz.copse.model.beans.*;
import org.javaz.jdbc.util.StringMapPair;

import org.javaz.jdbc.base.*;
import java.util.*;
import java.sql.*;
import java.io.Serializable;
<#assign tableName = bean.table_name >
<#if tableName?index_of(":") &gt; 0 >
<#assign tableName=tableName?substring(0, tableName?index_of(":")) >
</#if>

public class ${beanName}Helper extends AbstractMapConvertibleHelper<${beanName}I> {

    <#assign comma = false>
    <#assign sb = ''>
    <#list attributes as attribute>
        <#if attribute.primary_key != 'true'>
            <#if comma>
                <#assign sb = sb + ', '>
            </#if>
            <#assign sb = sb + attribute.column_name + ' = ?'>
            <#if !comma>
                <#assign comma = true>
            </#if>
            <#assign sb = sb + '\"\n                + " '>
        </#if>
    </#list>
    public static final String UPDATE_SCRIPT = "update %s set ${sb} where id = ?";

    <#assign comma = false>
    <#assign sb = ''>
    <#assign qms = ''>
    <#list attributes as attribute>
        <#if attribute.primary_key != 'true'>
            <#if comma>
                <#assign sb = sb + ', '>
                <#assign qms = qms + ', '>
            </#if>
            <#assign sb = sb + attribute.column_name>
            <#assign qms = qms + '?'>
            <#if !comma>
                <#assign comma = true>
            </#if>
            <#assign sb = sb + '\"\n                    + " '>
        </#if>
    </#list>
    <#assign sbPk = sb>
    <#assign qmsPk = qms>
    <#list attributes as attribute>
        <#if attribute.primary_key == 'true'>
            <#if comma>
                <#assign sbPk = sbPk + ', '>
                <#assign qmsPk = qmsPk + ', '>
            </#if>
            <#assign sbPk = sbPk + attribute.column_name>
            <#assign qmsPk = qmsPk + '?'>
            <#if !comma>
                <#assign comma = true>
            </#if>
            <#assign sbPk = sbPk + '\"\n                    + " '>
        </#if>
    </#list>
    public static final String INSERT_SCRIPT_ID = "insert into %s (${sbPk}) VALUES (${qmsPk})";

    public static final String INSERT_SCRIPT_NO_ID = "insert into %s (${sb}) VALUES (${qms})";

    <#list attributes as attribute>
    public static final String F_${attribute.column_name?upper_case} = "${attribute.column_name}";
    </#list>

    public ${beanName}Helper() {
        setIdName(F_ID);
        setTableName("${tablePrefix}${tableName}");
    }
    public ${beanName}I buildFromMap(Map h) {
        ${beanName}I b = createNewInstance();
    <#list attributes as attribute>
        <#assign found = "false">
        <#if attribute.type == "java.lang.Short" >
        if(h.get(F_${attribute.column_name?upper_case}) != null) { b.set${attribute.name?cap_first}( new ${attribute.type}(((Number) h.get(F_${attribute.column_name?upper_case})).shortValue()));}
            <#assign found = "true">
        </#if>
        <#if attribute.type == "java.lang.Integer" >
        if(h.get(F_${attribute.column_name?upper_case}) != null) { b.set${attribute.name?cap_first}( new ${attribute.type}(((Number) h.get(F_${attribute.column_name?upper_case})).intValue()));}
            <#assign found = "true">
        </#if>
        <#if attribute.type == "java.lang.Long" >
        if(h.get(F_${attribute.column_name?upper_case}) != null) { b.set${attribute.name?cap_first}( new ${attribute.type}(((Number) h.get(F_${attribute.column_name?upper_case})).longValue()));}
            <#assign found = "true">
        </#if>
        <#if attribute.type == "java.lang.Double" >
        if(h.get(F_${attribute.column_name?upper_case}) != null) { b.set${attribute.name?cap_first}( new ${attribute.type}(((Number) h.get(F_${attribute.column_name?upper_case})).doubleValue()));}
            <#assign found = "true">
        </#if>
        <#if attribute.type == "java.lang.Float" >
        if(h.get(F_${attribute.column_name?upper_case}) != null) { b.set${attribute.name?cap_first}( new ${attribute.type}(((Number) h.get(F_${attribute.column_name?upper_case})).floatValue()));}
            <#assign found = "true">
        </#if>
        <#if attribute.type == "java.sql.Date" || attribute.type == "java.sql.Timestamp" >
        if(h.get(F_${attribute.column_name?upper_case}) != null) { b.set${attribute.name?cap_first}( new ${attribute.type}(((java.util.Date) h.get(F_${attribute.column_name?upper_case})).getTime()));}
            <#assign found = "true">
        </#if>
        <#if found == "false">
        if(h.get(F_${attribute.column_name?upper_case}) != null) { b.set${attribute.name?cap_first}((${attribute.type}) h.get(F_${attribute.column_name?upper_case})); }
        </#if>
    </#list>
        return b;
    }

    public ${beanName}I createNewInstance() {
        return new ${beanName}();
    }

    <#if dbQuery == "true">
    public StringMapPair getDbUpdateQuery(String tableName, ${beanName}I obj, boolean forceInsert) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
            <#assign i = 1>
            <#assign iPk = 1>
            <#list attributes as attribute>
                <#if attribute.primary_key != 'true'>
        map.put(${i}, obj.get${attribute.name?cap_first}());
                    <#assign i = i + 1>
                </#if>
                <#assign iPk = iPk + 1>
            </#list>
        if (obj.getId() != null && !forceInsert) {
            map.put(${i}, obj.getId());
            return new StringMapPair(String.format(UPDATE_SCRIPT, tableName), map);
        } else {
            if (forceInsert) {
                map.put(${i}, obj.getId());
                return new StringMapPair(String.format(INSERT_SCRIPT_ID, tableName), map);
            } else {
                return new StringMapPair(String.format(INSERT_SCRIPT_NO_ID, tableName), map);
            }
        }
    }
    </#if>
}
</#if>