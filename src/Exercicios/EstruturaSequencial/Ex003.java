package EstruturaSequencial;

import java.util.Scanner;

/*Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.*/

public class Ex003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite as notas: ");
		double nota1 = in.nextDouble();
		double nota2 = in.nextDouble();
		double nota3 = in.nextDouble();
		double nota4 = in.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("A m�dia �: %.2f", media);
		
	}
}
