#!/usr/bin/env bash

echo "primeiro exemplo"
for ((i=0; i<=50; i++))
do
    echo $i
    soma+=$i
done

echo "percorrendo uma variável"
for i in $soma
do
    echo $i
done

echo "percorrendo um Array"
array=("Laranja" "Banana" "Maçã" "Abacaxi")
for i in "${array[@]}"
do
    echo $i
done

----------------------------"while"----------------------------------------
contador=0
while [[ $contador -lt 10 ]]
do
    echo "Deu certo: $contador"
    contador+=1
done