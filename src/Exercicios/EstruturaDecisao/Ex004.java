package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um Programa que verifique se uma letra digitada � "F" ou "M"
 * . Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.*/

public class Ex004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma letra");
		String letra = in.nextLine().toLowerCase();
		if(letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
			System.out.println("� vogal");
		}
		if(letra == "b" || letra == "c" || letra == "d" || letra == "f" || letra == "g" 
			|| letra == "h" || letra == "j" || letra == "k" || letra == "l"
			|| letra == "m" || letra == "n" || letra == "p" || letra == "q" || letra == "r" 
			|| letra == "s" || letra == "t" || letra == "v" || letra == "w" || letra == "x" || letra == "y") {
			System.out.println("� consoante");
		}
	}
}
