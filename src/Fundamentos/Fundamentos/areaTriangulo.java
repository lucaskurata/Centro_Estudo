package Fundamentos;

import java.util.Scanner;

public class areaTriangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Valor da base: ");
		Double base = in.nextDouble();
		System.out.println("Valor da altura: ");
		Double altura = in.nextDouble();
		double area = (base*altura)/2;
		System.out.printf("A área é %.2f", area);
		
	}
}
