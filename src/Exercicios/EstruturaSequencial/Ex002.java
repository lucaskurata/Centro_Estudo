package EstruturaSequencial;

import java.util.Scanner;

/*Fa�a um Programa que pe�a dois n�meros e imprima a soma*/

public class Ex002 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = in.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = in.nextInt();
		
		int soma = num1 + num2;
		System.out.println("A soma �: " + soma);
		
		
	}
}
