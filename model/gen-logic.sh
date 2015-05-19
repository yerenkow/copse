#!/bin/sh

jar="javaz-uml-1.5.0.jar"
src="../copse-core/src/main/java/"
bean_whole="1"
bean_by_one="2"
bean_difference="4"
params="-DtemplatePath=templates -Dpackage=org.javaz.copse.logic -DtablePrefix=copse_ -DdbQuery=false -Dsubpkg=impl -Dexcpackage=org.javaz.copse.exc"
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-logic-current.json create-logic-iface ${bean_by_one} -DoutPath=${src}org/javaz/copse/logic/iface ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-logic-current.json create-logic ${bean_by_one} -DoutPath=${src}org/javaz/copse/logic/impl ${params}



