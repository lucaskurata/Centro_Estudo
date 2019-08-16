package EstruturaDecisao;

import java.util.Scanner;

/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.*/

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
			System.out.println("Data válida! --> " + data);
		}else {
			System.out.println("Data inválida! --> " + data);
		}
	}
}
