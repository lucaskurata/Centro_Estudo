package EstruturaControle;

import java.util.Scanner;

public class ExJogoAdivinhacao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Chute um número: ");
		int chute = 0;
		int aleatorio = 82;
		int quantidadeRestante = 10;
		
		for (int n = 1; n <=10; n ++) {
			chute = in.nextInt();
			if (chute == aleatorio) {
				System.out.printf("Parabéns, você acertou %d", aleatorio);
			}else if (chute != aleatorio) {
				quantidadeRestante--;
				System.out.printf("Tentativas restantes %d", quantidadeRestante);
				if (chute<aleatorio && quantidadeRestante > 0) {
					System.out.println("\n O número que você chutou é MENOR que o valor aleatório");
				}else if(chute>aleatorio && quantidadeRestante > 0) {
					System.out.println("\n O número que você chutou é MAIOR que o valor aleatório");
				}else if(chute > aleatorio || chute<aleatorio && quantidadeRestante == 0) {
					System.out.println("\n Perdeu!!!");
				}
			}
		}
	}
}
