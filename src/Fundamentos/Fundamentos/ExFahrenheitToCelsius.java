package Fundamentos;

import java.util.Scanner;

public class ExFahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		String temperatura = in.nextLine();
		
		double fahrenheit = Double.parseDouble(temperatura);
		double total = (fahrenheit-32) *5/9;
		System.out.printf("Fahrenheint --> Celsius %.2f", total);
		}
}
