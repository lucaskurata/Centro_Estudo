package EstruturaSequencial;

import java.util.Scanner;

/*Tendo como dados de entrada a altura de uma pessoa,
 *  construa um algoritmo que calcule seu peso ideal, usando a 
 *  seguinte fórmula: (72.7*altura) - 58*/

public class Ex007 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a altura: ");
		double altura = in.nextDouble();
		double formula = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é de: " + formula);
		
	}
	
	
}
