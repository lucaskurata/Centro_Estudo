#!/usr/bin/env bash

#Faça um Programa que peça as 4 notas bimestrais e mostre a média.

nota1="$1"
nota2="$2"
nota3="$3"
nota4="$4"

media=$((($nota1+$nota2+$nota3+$nota4)/4))

echo "A média é: $media"
