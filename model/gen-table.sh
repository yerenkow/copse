#!/bin/sh

jar="javaz-uml-1.5.0.jar"
src="../copse-module-web-table/src/main/java/"
src_sql="../copse-module-web-table/src/main/resources/"
bean_whole="1"
bean_by_one="2"
bean_difference="4"

params="-DtemplatePath=templates -Dpackage=org.javaz.copse.web.table -DtablePrefix=copse_ -Dsubpkg=impl -Dexcpackage=org.javaz.copse.exc"
params_helper="-DtemplatePath=templates -Dpackage=org.javaz.copse.web.table -DtablePrefix=copse_ -Dsubpkg=helper -Dexcpackage=org.javaz.copse.exc"
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-table-current.json create-iface ${bean_by_one} -DoutPath=${src}org/javaz/copse/web/table/iface ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-table-current.json create-bean ${bean_by_one} -DoutPath=${src}org/javaz/copse/web/table/impl ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-table-current.json create-postgresql ${bean_whole} -DoutPath=${src_sql} ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-table-current.json create-helper ${bean_by_one}  -DoutPath=${src}org/javaz/copse/web/table/helper ${params_helper}



