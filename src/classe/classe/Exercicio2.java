package classe;

import java.util.Scanner;

public class Exercicio2 {

	static int maiorNumero;
	
	static void maiorNumero (int a, int b, int c) {
		if (a > b && a > c) {
			maiorNumero = a;
		}else if (b>a && b>c) {
			maiorNumero = b;
		}else{
			maiorNumero = c;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = in.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int n2 = in.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int n3 = in.nextInt();
		
		maiorNumero(n1,n2,n3);
		
		System.out.println(maiorNumero);
	}
}


