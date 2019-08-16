package EstruturaControle;

import java.util.Scanner;

public class controleBreak {
	public static void main(String[] args) {
		double total = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		double salario =in.nextDouble();		
		System.out.println("Digite o seus gastos mensais: ");
		double gasto = 0;

		while(true) {		
			gasto = in.nextDouble();
			if (gasto > 0 && gasto <= salario){
				total += gasto;
			}else if(gasto <= 0 || gasto > salario) {			
				double resto = salario - total;
				System.out.printf("Salário R$%.2f \n Gastos mensais R$%.2f \n Restante R$%.2f", salario, total, resto);
				break;
			}
		}
		
	}
}
