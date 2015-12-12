#!/bin/sh

jar="javaz-uml-1.5.0.jar"
src="../copse-module-web-fields/src/main/java/"
src_sql="../copse-module-web-fields/src/main/resources/"
bean_whole="1"
bean_by_one="2"
bean_difference="4"

params="-DtemplatePath=templates -Dpackage=org.javaz.copse.web.fields -DtablePrefix=copse_ -Dsubpkg=impl -Dexcpackage=org.javaz.copse.exc"
params_helper="-DtemplatePath=templates -Dpackage=org.javaz.copse.web.fields -DtablePrefix=copse_ -Dsubpkg=helper -Dexcpackage=org.javaz.copse.exc"
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-fields-current.json create-iface ${bean_by_one} -DoutPath=${src}org/javaz/copse/web/fields/iface ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-fields-current.json create-bean ${bean_by_one} -DoutPath=${src}org/javaz/copse/web/fields/impl ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-fields-current.json create-postgresql ${bean_whole} -DoutPath=${src_sql} ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-fields-current.json create-helper ${bean_by_one}  -DoutPath=${src}org/javaz/copse/web/fields/helper ${params_helper}



