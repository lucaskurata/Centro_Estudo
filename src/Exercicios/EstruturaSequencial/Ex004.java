package EstruturaSequencial;

import java.util.Scanner;

/*Faša um Programa que converta metros para centÝmetros.*/

public class Ex004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite em metros: ");
		int metros = in.nextInt();
		int converter = metros * 100;
		System.out.println("Metros para centÝmetros: " + converter);
		
		
	}
}
