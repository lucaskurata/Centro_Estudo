package EstruturaControle;

import java.util.Scanner;

public class controleSwitch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a sua nota: ");
		int n = 0;
		while (n != -1) {
			n = in.nextInt();
			switch(n) {
			case 10:
			case 9:
				System.out.println("Parabéns");
				break;
			case 8:
			case 7:
				System.out.println("Foi muito bem");
				break;
			case 6:
			case 5:
				System.out.println("Precisa melhorar...");
				break;
			case 4:
			case 3:
				System.out.println("Recuperação imediato!");
				break;
			case 2:
			case 1:
				System.out.println("Cuidado, chance de ser reprovado");
				break;
			default:
				System.out.println("Nota inválida");
		
			}

		}
	}
}
