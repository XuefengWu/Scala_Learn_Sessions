#!/bin/bash

mkdir -p src/main/scala/
mkdir -p src/test/scala/
echo -e 'name := "hello" \n\nversion := "1.0" \n\nscalaVersion := "2.10.2"' > build.sbt

mkdir project
echo  'sbt.version=0.12.4' > project/build.properties
