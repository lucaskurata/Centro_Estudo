package Operadores;

public class operadoresAtribuicao{
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int acrescimo = a+=b; //a = a + b
        int decrescimo = a-=b; // a = a - b
        int automultiplicacao = a*= b; // a = a * b
        int autodivisao = a/=b; // a = a / b
        int automodulo = a%=b;// a = a % b

        System.out.println("Acréscimo: " + acrescimo);
        System.out.println("Decréscimo: " + decrescimo);
        System.out.println("Auto-multiplicação: " + automultiplicacao);
        System.out.println("Auto-divisão: " + autodivisao);
        System.out.println("Auto-módulo: " + automodulo);
    }
}