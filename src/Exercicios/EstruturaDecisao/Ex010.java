package EstruturaDecisao;

import java.util.Scanner;

/*Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/

public class Ex010 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int numero = in.nextInt();
		int resultado = 0;
		int resto = 0;
		int centena = 0;
		int dezena = 0;
		int unidade = 0;
		if(numero > 0 && numero <= 1000) {
			resultado = numero / 100;
			resto = numero % 100;
			centena = resultado;
			if(resto > 0) {
				resultado = resto / 10;
				resto = numero % 10;
				dezena = resultado;
			}
			if(resto > 0) {
				resultado = resto / 1;
				unidade = resultado;
			}
		}
		
		System.out.println("Centena --> " + centena + "\n Dezena --> " + dezena + "\n Unidade --> " + unidade);
	}
}
