package EstruturaControle;

import java.util.Scanner;

public class ExVerificaBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um ano: ");
		int ano = in.nextInt();
		
		if (ano %4 == 0 && ano %100 != 0) {
			System.out.println(ano + " é um ano bissexto!");
		}else {
			System.out.println(ano + " não é bissexto!");
		}
	}
}
