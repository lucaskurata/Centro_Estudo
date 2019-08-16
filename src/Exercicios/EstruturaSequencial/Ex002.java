package EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que peça dois números e imprima a soma*/

public class Ex002 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = in.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = in.nextInt();
		
		int soma = num1 + num2;
		System.out.println("A soma é: " + soma);
		
		
	}
}
