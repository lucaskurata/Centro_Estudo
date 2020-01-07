#!/usr/bin/env bash

#Peça dois números e imprima o maior deles

num="$1"
num2="$2"

if [ $num > $num2 ]
then
    echo "Número 1 ($num) é maior que o número 2 ($num2)"
else
    echo "Número 2 ($num2) é maior que o número 1 ($num)"
fi;