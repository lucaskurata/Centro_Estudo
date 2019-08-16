package EstruturaSequencial;

import java.util.Scanner;

/*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.*/

public class Ex005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Digite o raio do círculo: ");
		double raio = in.nextDouble();
		int area = (int) (3.14 * Math.pow(raio, 2));
		System.out.println("O raio do círculo: " + area);
		
	}
}
