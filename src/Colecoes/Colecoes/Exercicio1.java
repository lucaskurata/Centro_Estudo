package Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
	//Copie os valores de um vetor para um outro vetor
	public static void main(String[] args) {
		
		List<String> nome = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome dos integrantes da sua família");
		for(int i = 0; i<=4; i++) {
			nome.add(in.nextLine());
		}
		List<String> copia = new ArrayList<>();
		copia = nome;
		System.out.println("está é a cópia: " + copia);
		

	}
	
}
