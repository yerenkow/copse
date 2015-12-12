#!/bin/sh

what="$1"
ver="$2"
jar="javaz-uml-1.5.0.jar"

java -cp ${jar} org.javaz.uml.VioletParser copse-${what}.class.violet.html versions/copse-${what}-ver${ver}.json
cp versions/copse-${what}-ver${ver}.json versions/copse-${what}-current.json
