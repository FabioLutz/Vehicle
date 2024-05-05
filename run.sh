#!/bin/bash

set -e

cd /home/runner/Vehicle

show_help() {
	echo -e "Usage: sh $0 [OPTION]\n"
	echo -e "\tRun the application.\n"
	echo "Options:"
	echo "  -c, --compile"
	echo -e "    Compile and run the project.\n"
	echo "  -h, --help"
	echo -e "    Show this help message.\n"
}

# Parâmetros
case "$1" in
	"")
		;;
	-c | --compile)
		sh compile.sh
		;;
	-h | --help)
		show_help
		exit 0
		;;
	*)
		echo "Invalid option"
		exit 0
		;;
esac

# Executa o projeto
cd target/classes
java com.vehicle.car.controller.Main
