package EstruturaDecisao;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre o maior deles.*/

public class Ex005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = in.nextInt();
		System.out.println("Digite o sergundo número: ");
		int num2 = in.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = in.nextInt();

		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é maior");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é maior");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(num3 + " é maior");
		}
	}
}
