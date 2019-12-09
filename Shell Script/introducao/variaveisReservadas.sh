#!/usr/bin/env bash

var1="Parâmetro 1: $1"
var2="Parâmetro 2: $2"
var3="Parâmetro 3: $3"

echo "$var1"
echo "$var2"
echo "$var3"

echo "Todos os parâmetros $*"
echo "Quantos parâmetros? $#"
echo "Nome do Shell: $0"
echo "Último comando: $?"
echo "$0"

