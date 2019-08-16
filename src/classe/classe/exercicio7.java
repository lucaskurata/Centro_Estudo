package classe;

/**
 * 10. Crie uma classe ComparaNumero que contenha um método que receba dois
 * números e indique se são iguais ou se são diferentes. Mostre o maior número e
 * o menor número ( nesta sequência ).
 */

public class exercicio7 {

	public static void comparaNumero(int num1, int num2) {
		if (num1 == num2) {
			System.out.println(num1 + "é igual ao " + num2);
		}else if (num1 != num2) {
			System.out.println(num1 + "é diferente de " + num2);
		}else if (num1 > num2) {
			System.out.println(num1 + "é maior que " + num2);
		}else if (num1<num2) {
			System.out.println(num1 + "é menor que " + num2);
		}
	}
	
	public static void main(String[] args) {
		comparaNumero(5, 10);
	}
}
