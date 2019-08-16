package classe;

import java.util.Scanner;

/**
 * 6. Crie uma função que receba o nome e a idade de 3 pessoas e diga qual o
 * nome da pessoa mais velha e o nome da pessoa mais nova.
 */

public class Exercicio3 {
	
	static void maisVelhaEMaisNova(String nome1, int num1, String nome2, int num2, String nome3, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println(nome1 + " é o mais velho!");
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(nome2 + " é o mais velho");
		}else {
			System.out.println(nome3 + " é o mais velho");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro nome: ");
		String nome1 = in.next();
		
		System.out.println("Digite a idade do primeiro: ");
		int num1 = in.nextInt();
		
		System.out.println("Digite o segundo nome: ");
		String nome2 = in.next();
		
		System.out.println("Digite a idade do segundo: ");
		int num2 = in.nextInt();
		
		System.out.println("Digite o terceiro nome: ");
		String nome3 = in.next();
		
		System.out.println("Digite a idade do terceiro: ");
		int num3 = in.nextInt();
		
		maisVelhaEMaisNova(nome1, num2, nome2, num2, nome3, num3);
	}
}
