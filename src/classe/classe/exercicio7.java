package classe;

/**
 * 10. Crie uma classe ComparaNumero que contenha um m�todo que receba dois
 * n�meros e indique se s�o iguais ou se s�o diferentes. Mostre o maior n�mero e
 * o menor n�mero ( nesta sequ�ncia ).
 */

public class exercicio7 {

	public static void comparaNumero(int num1, int num2) {
		if (num1 == num2) {
			System.out.println(num1 + "� igual ao " + num2);
		}else if (num1 != num2) {
			System.out.println(num1 + "� diferente de " + num2);
		}else if (num1 > num2) {
			System.out.println(num1 + "� maior que " + num2);
		}else if (num1<num2) {
			System.out.println(num1 + "� menor que " + num2);
		}
	}
	
	public static void main(String[] args) {
		comparaNumero(5, 10);
	}
}
