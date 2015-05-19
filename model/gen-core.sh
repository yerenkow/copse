#!/bin/sh

jar="javaz-uml-1.5.0.jar"
src="../copse-core/src/main/java/"
bean_whole="1"
bean_by_one="2"
bean_difference="4"
params="-DtemplatePath=templates -Dpackage=org.javaz.copse.model -Dexcpackage=org.javaz.copse.exc -DtablePrefix=copse_ -Dpkgprefix=true"
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-core-current.json create-iface ${bean_by_one} -DoutPath=${src}org/javaz/copse/model/iface ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-core-current.json create-bean ${bean_by_one}  -DoutPath=${src}org/javaz/copse/model ${params}
java -cp ${jar} org.javaz.uml.RenderFtl versions/copse-core-current.json create-helper ${bean_by_one}  -DoutPath=${src}org/javaz/copse/model/helper ${params}
