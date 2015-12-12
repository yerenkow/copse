begin;
<#if beans??>
    <#if !tablePrefix??>
        <#assign tablePrefix = "tbl_">
    </#if>
    <#list beans as bean>
<#assign tableName = bean.table_name >
<#if tableName?index_of(":") &gt; 0 >
<#assign tableName=tableName?substring(0, tableName?index_of(":")) >
</#if>
    CREATE SEQUENCE ${tablePrefix}${tableName}_id_sequence;
    CREATE TABLE ${tablePrefix}${tableName}
    (
        <#assign attributes = bean.attributes>
        <#list attributes as attribute>
        ${attribute.column_name} ${attribute.sql_type},
        </#list>

        <#list attributes as attribute>
            <#if attribute.primary_key == 'true' >
        CONSTRAINT pk_${tablePrefix}${tableName} PRIMARY KEY (${attribute.column_name})
            </#if>
        </#list>
    );
        <#list attributes as attribute>
            <#if attribute.primary_key == 'true'  >
    ALTER TABLE ${tablePrefix}${tableName} ALTER COLUMN ${attribute.column_name} SET NOT NULL;
    ALTER TABLE ${tablePrefix}${tableName} ALTER COLUMN ${attribute.column_name} SET DEFAULT nextval('${tablePrefix}${tableName}_id_sequence'::regclass);

            </#if>
        </#list>
    </#list>
</#if>
rollback;