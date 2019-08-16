package EstruturaControle;
/*Criar um programa que receba duas notas parciais, calcular 
 * a me�?dia final. Se a nota do aluno 
 * for maior ou igual a 7.0 imprime no console "Aprovado", 
 * se a nota for menor que 7.0 e maior do que 4.0 imprime 
 * no console "Recuperação", caso contra�?rio imprime no console "Reprovado".*/

import java.util.Scanner;

public class ExCalculaMedia {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double nota = 0;
		for (int n = 1; n <=2; n++) {
			nota += in.nextDouble();
			if(nota/2 >= 7.0 && nota/2 <=10) {
				System.out.println("Aprovado "+ nota/2);
			}else if(nota/2 < 7.0 && nota/2 >= 4.0) {
				System.out.println("Recuperação " + nota/2);
			}else {
				System.out.println("Reprovado "+ nota/2);
			}
		}
	}
}
