package Fundamentos;

import java.util.Scanner;

public class conversaoStringNumero {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Qual é a sua primera nota? ");
		String primeira = in.nextLine();
		System.out.println("Qual é a sua segunda nota? ");
		String segunda = in.nextLine();
		double nota1 = Double.parseDouble(primeira);
		double nota2 = Double.parseDouble(segunda);
		double total = nota1 + nota2;
		System.out.println("média é: " + total/2);

	}
}
