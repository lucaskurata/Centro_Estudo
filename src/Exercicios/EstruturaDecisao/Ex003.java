package EstruturaDecisao;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M"
 * . Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

public class Ex003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite F ou M");
		String letra = in.nextLine();
		if(letra == "M" || letra == "m") {
			System.out.println("É masculino");
		} else if(letra == "F" || letra == "f") {
			System.out.println("É feminino");
		}
		
	}
}
