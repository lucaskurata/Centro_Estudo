package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

	//ordene a lista
	public static void main(String[] args) {

		int baguncado [] = new int [5];
		int aux = 0;
		baguncado[0] = 2;
		baguncado[1] = 1;
		baguncado[3] = 3;
		
		if(baguncado[0]>baguncado[1]) {
			aux = baguncado[0];
			baguncado[0] = baguncado[1];
			baguncado[1] = aux;
			System.out.println(baguncado);
		}
		
	
		
	}
}
