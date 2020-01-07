#!/usr/bin/env bash

#Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
#Calcule e mostre o total do seu salário no referido mês

ganho="$1"
horas="$2"

echo "O salário referido é de: $(($ganho*$horas))"
