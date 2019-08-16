package EstruturaControle;

import java.util.Scanner;

public class Controlewhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroNotas = 0;
				
		while (nota != -1) {
			nota = in.nextDouble();
			if (nota <=10 && nota >=0) {
				somaDasNotas += nota;
				numeroNotas++;
			}
			
		}
		System.out.printf("A média é: %.2f", somaDasNotas / numeroNotas);
		
		
	}
}
