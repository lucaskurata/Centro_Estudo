package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.*/

public class Ex002 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num = in.nextInt();
		if(num < 0) {
			System.out.println("� negativo");
		}else {
			System.out.println("� positivo!");
		}
	}
}
