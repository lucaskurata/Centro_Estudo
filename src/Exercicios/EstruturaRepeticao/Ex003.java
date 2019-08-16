package EstruturaRepeticao;

import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/

public class Ex003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = -1;
		while (n < 0) {
			System.out.println("Digite o nome: ");
			String nome = in.nextLine();
			
			System.out.println("Digite a idade: ");
			int idade = in.nextInt();
			
			System.out.println("Digite o salário: ");
			Double salario = in.nextDouble();
			
			if(nome.length() > 3 && idade > 0 && idade <= 150 && salario > 0) {
				System.out.println("Válido...");
				n ++;
			}else {
				System.out.println("Digite novamente");
			}
			
		}
	}
}
