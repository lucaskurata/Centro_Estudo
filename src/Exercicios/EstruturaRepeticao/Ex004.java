package EstruturaRepeticao;

/*Supondo que a população de um país A seja da ordem de 80000 habitantes 
 * com uma taxa anual de crescimento de 3% e que a população de B seja 200000 
 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e 
 * escreva o número de anos necessários para que a população do país A 
 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.*/

public class Ex004 {

	public static void main(String[] args) {
		int a = 80000;
		int b = 200000;
		int ano = 0;
		int n = -1;
		
		while(n < 0) {
			Double paisA = 0.0;
			Double paisB = 0.0;
			if(paisA < paisB) {
				paisA = a * 1.03;
				paisB = b * 1.015;
				ano++;
			}if(paisA == paisB) {
				System.out.println("Quantidade anos: " + ano);
				n++;	
			}
		}		
	}
}
