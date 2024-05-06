#!/bin/bash

set -e

sh setInfoGit.sh

show_help() {
	echo -e "Usage: sh $0 [OPTION]\n"
	echo -e "\tAdd to staged area and commit, using Git\n"
	echo "Options:"
	echo "  -m MESSAGE, --message MESSAGE"
	echo -e "    Add to staged area and commit using the MESSAGE.\n"
	echo "  -r, --redo"
	echo -e "    Redo the last commit.\n"
	echo "  -u, --undo"
	echo -e "    Undo last changes in the staged area.\n"
	echo "  -h, --help"
	echo -e "    Show this help message.\n"
}

# Parâmetros
case "$1" in
	"")
		;;
	-m | --message)
		git add .
		git commit -m "$2"
		git show --stat HEAD
		exit 0
		;;
	-r | --redo)
		git add .
		git commit --amend
		git show --stat HEAD
		exit 0
		;;
	-u | --undo)
		git reset HEAD --
		git status
		exit 0
		;;
	-h | --help)
		show_help
		exit 0
		;;
	*)
		echo "Invalid option"
		echo "Use 'sh $0 --help' to see the list of options"
		exit 0
		;;
esac


input="a"
git status

while true; do
	read -p "Do you want to continue? [y/N]: " input

	case "$input" in
		[Yy])
			git add .
			break
			;;
		[Nn] | "")
			echo "Aborting..."
			exit 0
			;;
		*)
			echo "Invalid option"
			;;
	esac
done

input="a"
git log

while true; do
	read -p "Do you want to continue? [y/N]: " input

	case "$input" in
		[Yy])
			read -p "Type the commit message: " message
			git commit -m"${message}"
			git show --stat HEAD
			break
			;;
		[Nn] | "")
			echo "Aborting..."
			exit 0
			;;
		*)
			echo "Invalid option"
			;;
	esac
done

# git push