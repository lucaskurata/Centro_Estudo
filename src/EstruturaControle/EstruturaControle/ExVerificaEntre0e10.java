package EstruturaControle;

import java.util.Scanner;

public class ExVerificaEntre0e10 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		int num = in.nextInt();
		
		if (num >= 0 && num<=10 && num %2 == 0) {
			System.out.println("Est� entre 0 e 10 e � par");
		}else if (num>=0 && num<=10 && num %2 != 0) {
			System.out.println("Est� entre 0 e 10 e � impar");
		}else if (num<0 || num >10  && num %2 ==0) {
			System.out.println("N�o est� entre 0 e 10 e � par");
		}else if (num<0 || num >10  && num %2 != 0) {
			System.out.println("N�o est� entre 0 e 10 e � impar");
	}
	}
}
