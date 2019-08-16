package Fundamentos;

import java.util.Scanner;

public class resultadoQuadradoCubo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o número: ");
		Double num = in.nextDouble();
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		System.out.printf("Quadrado %.2f\n Cubo %.2f", quadrado, cubo);
	}
}
