package Fundamentos;

import java.util.Scanner;

public class ExConverterCelsiusFahrenheit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a temperatura: ");
		String celsius  = in.nextLine();
		
		double temperatura = Double.parseDouble(celsius);
		double convercao = (temperatura*9/5) + 32;
		System.out.println(convercao);
	}
}
