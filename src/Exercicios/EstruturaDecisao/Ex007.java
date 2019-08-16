package EstruturaDecisao;

import java.util.Scanner;

/*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores 
 * e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.*/

public class Ex007 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		double salario = in.nextDouble();
		if (salario <= 280){
			System.out.println(salario * 1.20);
		}else if (salario > 280 && salario <= 700) {
			System.out.println(salario * 1.15);
		}else if (salario > 700 && salario <= 1500) {
			System.out.println(salario * 1.10);
		}else {
			System.out.println(salario * 1.05);
		}
		
	}
	
}
