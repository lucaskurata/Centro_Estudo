package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.*/

public class Ex005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = in.nextInt();
		System.out.println("Digite o sergundo n�mero: ");
		int num2 = in.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		int num3 = in.nextInt();

		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " � maior");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " � maior");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(num3 + " � maior");
		}
	}
}
