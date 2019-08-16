package EstruturaControle;

import java.util.Scanner;

public class ExVerificaEntre0e10 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int num = in.nextInt();
		
		if (num >= 0 && num<=10 && num %2 == 0) {
			System.out.println("Está entre 0 e 10 e é par");
		}else if (num>=0 && num<=10 && num %2 != 0) {
			System.out.println("Está entre 0 e 10 e é impar");
		}else if (num<0 || num >10  && num %2 ==0) {
			System.out.println("Não está entre 0 e 10 e é par");
		}else if (num<0 || num >10  && num %2 != 0) {
			System.out.println("Não está entre 0 e 10 e é impar");
	}
	}
}
