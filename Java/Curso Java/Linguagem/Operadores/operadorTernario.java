package Operadores;
public class operadorTernario{
    public static void main(String[] args) {
        //verificar se o número é par ou ímpar
        int numero = 12;
                           // CONDIÇÃO ? <True>:<False>
        System.out.println( numero % 2 != 0 ? "É ímpar TRUE":"É par FALSE");
    }
}