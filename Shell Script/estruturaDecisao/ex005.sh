#!/usr/bin/env bash

#Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
#A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
#A mensagem "Reprovado", se a média for menor do que sete;
#A mensagem "Aprovado com Distinção", se a média for igual a dez.

nota="$1"
nota2="$2"
media=$((($nota+$nota2)/2))

if [ -z $nota ] || [ -z $nota2 ]
then
    echo "Parâmetros inválidos"
fi;

if [ $media -eq 10 ]
then
    echo "Parabéns!"
elif [ $media -ge 7 ]
then
    echo "Aprovado!"
else
    echo "Reprovado!"
fi;



