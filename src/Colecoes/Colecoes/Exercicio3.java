package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	///** 3. Crie um programa que una dois vetores um um vetor só; */
	public static void main(String[] args) {
		List<String> nome1 = new ArrayList<>();
		nome1.add("Lucas");
		nome1.add("Henrique");
		nome1.add("Rodrigo");
		
		List<String> nome2 = new ArrayList<>();
		nome2.add("Armando");
		nome2.add("Léia");
		
		List<String> copia = new ArrayList<>();
		copia.addAll(nome1);
		copia.addAll(nome2);
		System.out.println("Lista unificada: " + copia);
	}
}
