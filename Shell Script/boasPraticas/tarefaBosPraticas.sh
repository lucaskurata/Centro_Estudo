#!/usr/bin/env bash
#
#Nome do programa: forAte100.sh
#
# Site:
# Autor: LucasK
#Manutencao: Lucask
#
#--------------------------------------------------------------------------------------------------#
#Este programa executa do 0 ao 99 e printa "*" quebrando as linhas 99 vezes

comeca=0
ate=100

if [ $(($comeca < $ate)) ]
then
    for i in $ate
    do
        for j in $ate
        do
            echo "*"
        done;
        echo "\n"
    done
fi


#-----------------------------------------------------------------------------------------------------------------#