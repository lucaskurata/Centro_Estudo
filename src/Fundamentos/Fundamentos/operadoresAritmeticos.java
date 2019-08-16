package Fundamentos;

public class operadoresAritmeticos {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		int soma = num1 + num2 + num3 + 6;
		System.out.println(soma);	
		System.out.println(num3 - num2);
		
		//Cuidado como a ordem de operação
		System.out.println((num1 + num2) * num3/2);
		
		//resto da divisão
		System.out.println(18 % 5);
	}
}
