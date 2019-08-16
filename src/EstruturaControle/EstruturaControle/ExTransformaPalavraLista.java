package EstruturaControle;
//Criar um programa que receba uma palavra e imprime no console letra por letra.

import java.util.Scanner;

public class ExTransformaPalavraLista {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite alguma palavra: ");
		String palavra = in.nextLine();
		
		char separa [] = palavra.toLowerCase().toCharArray();
		
		for (int i = 0; i < separa.length; i++) {
			System.out.println(separa[i]);
		}
	}
	
	
}
