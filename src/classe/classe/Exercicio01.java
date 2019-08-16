package classe;

import java.util.Scanner;

public class Exercicio01 {

	static void somar (int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = in.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int n2 = in.nextInt();
		
		somar(n1,n2);
	}
}
