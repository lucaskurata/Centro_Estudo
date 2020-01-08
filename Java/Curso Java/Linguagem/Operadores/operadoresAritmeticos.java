package Operadores;
public class operadoresAritmeticos{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Soma " + soma);
        System.out.println("Subtração " + subtracao);
        System.out.println("Multiplicação " + multiplicacao);
        System.out.println("Resultado da divisão " + divisao);
        System.out.println("Resto da divisão " + resto);
    }
}