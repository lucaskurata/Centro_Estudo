package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um Programa para um caixa eletr�nico. O programa dever� perguntar ao usu�rio a valor do saque e depois informar 
 * quantas notas de cada valor ser�o fornecidas. As notas dispon�veis ser�o as de 1, 5, 10, 50 e 100 reais. O valor m�nimo � 
 * de 10 reais e o m�ximo de 600 reais. O programa n�o deve se preocupar com a quantidade de notas existentes na m�quina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece tr�s notas de 100, uma nota de 50, quatro notas de 10, uma nota de 
5 e quatro notas de 1.*/

public class Ex009 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor a ser sacado: ");
		int valor = in.nextInt();
		int resultado = 0;
		int resto = 0;
		int cem = 0;
		int cinquenta = 0;
		int dez = 0;
		int cinco = 0;
		int um = 0;
		int n = 0;
		while(n < 1) {
			if (valor >= 10 && valor <= 600) {
			resultado = valor / 100;
			resto = valor % 100;
			cem += resultado;
			if(resto > 0) {
			resultado = resto / 50;
			resto = resto % 50;
			cinquenta+= resultado;
			}
			if (resto > 0) {
				resultado = resto / 10;
				resto = resto % 10;
				dez += resultado;
			}
			if (resto > 0) {
				resultado = resto / 5;
				resto = resto % 5;
				cinco += resultado;
			}
			if (resto > 0) {
				resultado = resto / 01;
				um += resultado;
				System.out.println("Notas de cem: " + cem + "\n Notas de cinquenta: " + cinquenta + "\n Notas de 10: " + dez + 
						"\n Notas de 5: " +  
				cinco + "\n Notas de um: " + um);
				n+=1;
			}
		}else{
			System.out.println("valor inv�lido, digite novamente");
			n +=1 ;
			}			
	}
		
  }
}
