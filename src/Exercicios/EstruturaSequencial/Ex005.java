package EstruturaSequencial;

import java.util.Scanner;

/*Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.*/

public class Ex005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Digite o raio do c�rculo: ");
		double raio = in.nextDouble();
		int area = (int) (3.14 * Math.pow(raio, 2));
		System.out.println("O raio do c�rculo: " + area);
		
	}
}
