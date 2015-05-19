#!/bin/sh

#just don't forget increment here.
ver="1"

jar="javaz-uml-1.5.0.jar"
java -cp ${jar} org.javaz.uml.VioletParser copse-core.class.violet.html versions/copse-core-ver${ver}.json
cp versions/copse-core-ver${ver}.json versions/copse-core-current.json
