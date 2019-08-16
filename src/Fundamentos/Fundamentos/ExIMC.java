package Fundamentos;

import java.util.Scanner;

public class ExIMC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a sua altura: ");
		String alt = in.nextLine();
		System.out.println("Digite a sua peso: ");
		String kilo = in.nextLine();
		
		double altura = Double.parseDouble(alt);
		double peso = Double.parseDouble(kilo);
		double imc = peso/Math.pow(altura, 2);
		System.out.printf("IMC: %.2f", imc);
	}
}
