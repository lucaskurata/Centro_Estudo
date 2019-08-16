package EstruturaControle;

import java.util.Scanner;

public class estrutuaFor {
	public static void main(String[] args) {
		double somaNotas = 0;
		double qtdNotas = 0;
		double nota = 0;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a nota: ");
		for (int num = 0 ;  num <10; num++) {		
			nota = in.nextDouble();
			somaNotas += nota;
			qtdNotas++;
		}
		System.out.printf("Sua média é: %.2f",somaNotas/qtdNotas);
		
	}
}
