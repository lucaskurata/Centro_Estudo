package EstruturaControle;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a nota do aluno: ");
		Double nota = in.nextDouble();

		if (nota > 6) {
			System.out.println("Aluno aprovado!");
		} else if (nota == 6) {
			System.out.println("Cuidado!");
		} else {
			System.out.println("Reprovado!");
		}
	}
}
