package Fundamentos;

import java.util.Scanner;

public class operadorTernario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual é a nota? ");
		double nota1 = Double.parseDouble(in.nextLine());
		String resultado = nota1 >= 6 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}
