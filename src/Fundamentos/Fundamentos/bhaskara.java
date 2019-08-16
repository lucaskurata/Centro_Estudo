package Fundamentos;

import java.util.Scanner;

public class bhaskara {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Valor de A: ");
		int a = in.nextInt();
		System.out.println("Valor de B: ");
		int b = in.nextInt();
		System.out.println("Valor de C: ");
		int c = in.nextInt();
		
		int delta = (b * b) - 4*a*c;
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.printf("Fórmula: %dx² +%db + %dc = 0", a, b, c);
		System.out.printf("\n Valor do delta: %d \n valor do x1: %.2f \n valor x2: %.2f", delta, x1, x2);

		
	}
}
