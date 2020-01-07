#!/usr/bin/env bash

#Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

valor="$1"

if [ -z $valor ]
then
    echo "Faltando parâmetros"
    exit 1
fi;

if [ $valor -lt 0 ]
then
    echo "Valor é negativo!"
else
    echo "Valor é positivo!"
fi;