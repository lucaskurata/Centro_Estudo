package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente*/

public class Ex006 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite tr�s n�meros: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int aux = 0;
		
		if(num3 > num2) {
			aux = num3;
			num3 = num2;
			num2 = aux;
		}
		if(num2 > num1) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		if(num3 > num2) {
			aux = num3;
			num3 = num2;
			num2 = aux;
		}
		
		System.out.println(num1 + "," +  num2 + "," + num3);
	}
	
	
}
