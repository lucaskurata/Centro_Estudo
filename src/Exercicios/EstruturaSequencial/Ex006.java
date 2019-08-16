package EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
C = (5 * (F-32) / 9).*/

public class Ex006 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a temperatuda em Fahrenheit: ");
		double fahrenheit = in.nextDouble();
		double formula = (5 * (fahrenheit - 32)) / 9;
		System.out.printf("Conversão %.2f", formula);		
	}
}
