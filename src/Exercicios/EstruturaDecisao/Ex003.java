package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um Programa que verifique se uma letra digitada � "F" ou "M"
 * . Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.*/

public class Ex003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite F ou M");
		String letra = in.nextLine();
		if(letra == "M" || letra == "m") {
			System.out.println("� masculino");
		} else if(letra == "F" || letra == "f") {
			System.out.println("� feminino");
		}
		
	}
}
