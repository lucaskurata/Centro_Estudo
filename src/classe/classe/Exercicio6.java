package classe;

import java.util.Scanner;

/**
 * 9. Crie uma classe TrocaNumero que contenha um m�todo que receba dois
 * n�meros, NumA e NumB ( nessa ordem ), e imprima na ordem inversa, isto �, se
 * NumA = 5 e NumB = 10, por exemplo, devem ser impressos na ordem NumA = 10 e
 * NumB = 5.
 */

public class Exercicio6 {
	public static void trocaNumero(int numA, int numB) {

		int reserva = numA;
		numA = numB;
		numB = reserva;
		
		System.out.println(numA + "�" + numA);
		System.out.println(numB + "�" + numB);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero");
		int numA = in.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int numB = in.nextInt();
		trocaNumero(numA, numB);
		
	}
}
