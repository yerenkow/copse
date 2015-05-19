<#assign abs = "">

<#assign beanName = bean.name >
<#if beanName?index_of(":") &gt; 0 >
    <#assign beanName=beanName?substring(0, bean.name?index_of(":")) >
</#if>
<#if bean.methods?size != 0 >
    <#assign abs = "Abstract">
</#if>
<#assign pref = "">
<#if pkgprefix??>
    <#assign pref = "abs/">
    <#if abs != "Abstract" >
        <#assign pref = "beans/">
    </#if>
</#if>
${pref}${abs}${beanName}.java