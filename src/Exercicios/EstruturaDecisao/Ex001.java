package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.*/

public class Ex001 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int primeiro = in.nextInt();
		System.out.println("Digite o segundo valor: ");
		int segundo = in.nextInt();
		
		if(primeiro >  segundo) {
			System.out.println(primeiro + " > " + segundo);
		} else if (segundo > primeiro) {
			System.out.println(primeiro + " < " + segundo);
		}else {
			System.out.println("Valores iguais");
		}
	}
}
