package EstruturaSequencial;

import java.util.Scanner;

/*Fa�a um Programa que converta metros para cent�metros.*/

public class Ex004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite em metros: ");
		int metros = in.nextInt();
		int converter = metros * 100;
		System.out.println("Metros para cent�metros: " + converter);
		
		
	}
}
