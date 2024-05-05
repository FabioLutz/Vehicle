#!/bin/bash

set -e

cd /home/runner/Vehicle

# Verifica se as pastas de saída existem, caso não, as cria
if [ ! -d target/classes/com/vehicle/car/controller ]; then
	mkdir -p target/classes/com/vehicle/car/controller
fi

if [ ! -d target/classes/com/vehicle/car/model ]; then
	mkdir -p target/classes/com/vehicle/car/model
fi

# Compila o projeto
javac src/main/java/com/vehicle/car/*/*.java

# Move os arquivos .class para a pasta de saída
mv src/main/java/com/vehicle/car/controller/*.class target/classes/com/vehicle/car/controller/

mv src/main/java/com/vehicle/car/model/*.class target/classes/com/vehicle/car/model/
