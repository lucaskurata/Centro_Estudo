package EstruturaDecisao;

import java.util.Scanner;

/*As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores 
 * e lhe contraram para desenvolver o programa que calcular� os reajustes.
Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, 
baseado no sal�rio atual:
sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela:
o sal�rio antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo sal�rio, ap�s o aumento.*/

public class Ex007 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu sal�rio: ");
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
