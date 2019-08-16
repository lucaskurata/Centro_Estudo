package EstruturaDecisao;

import java.util.Scanner;

/*Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.*/

public class Ex002 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = in.nextInt();
		if(num < 0) {
			System.out.println("É negativo");
		}else {
			System.out.println("É positivo!");
		}
	}
}
