package EstruturaControle;

import java.util.Scanner;

public class ExImprimeMaiorEntre10 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int maiorValor = 0;
		System.out.println("Digite um n�mero: ");
		for (int i = 0; i<10; i++) {
			int numero = in.nextInt();
			if (numero > maiorValor) {
				maiorValor = numero;
			}
		}
		System.out.println("O maior n�mero foi: " + maiorValor);
	}
}
