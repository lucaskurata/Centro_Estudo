package EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].*/

public class Ex001 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = in.nextInt();
		if (num < 0) {
			System.out.println("Não é positivo...");
		} else {
			System.out.println("O número é: " + num);
		}
		
	}
}
