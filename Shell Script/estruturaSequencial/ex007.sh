#!/usr/bin/env bash

#Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

lado="$1"

area=$(($lado*$lado))
echo "A área do quadrado é: $area"