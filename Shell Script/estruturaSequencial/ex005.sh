#usr/bin/env bash

#Faça um Programa que converta metros para centímetros.

metros="$1"

conversao=$(($metros*100))

echo "A conversão de $metros m para centímetros é de: $conversao cm"