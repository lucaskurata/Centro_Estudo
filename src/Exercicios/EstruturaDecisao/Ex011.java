package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um Programa que pe�a uma data no formato dd/mm/aaaa e determine se a mesma � uma data v�lida.*/

public class Ex011 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o dia: ");
		int dia = in.nextInt();
		System.out.println("Digite o mes: ");
		int mes = in.nextInt();
		System.out.println("Digite o ano: ");
		int ano = in.nextInt();
		
		String data = dia + "/" + mes + "/" + ano;
		if (data.length() > 8 && data.length() < 11){
			System.out.println("Data v�lida! --> " + data);
		}else {
			System.out.println("Data inv�lida! --> " + data);
		}
	}
}
