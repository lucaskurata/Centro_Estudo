package EstruturaSequencial;

import java.util.Scanner;

/*Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero].*/

public class Ex001 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num = in.nextInt();
		if (num < 0) {
			System.out.println("N�o � positivo...");
		} else {
			System.out.println("O n�mero �: " + num);
		}
		
	}
}
