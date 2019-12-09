#!/usr/bin/env bash

for ((i=0; i<11; i++))
do
    if [ $i%2==0 ]
    then
        echo "É divisível por 2"
    fi
done
