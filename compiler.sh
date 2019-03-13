# DEPRECATED BECAUSE KATIA HATES US

#!/bin/bash
mkdir -p build;
javac src/*.java;
for i in $( ls src | grep class ); do
  mv "src/$i" build/
done
# clear;