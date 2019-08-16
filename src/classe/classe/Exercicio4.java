package classe;

/**
 * 7. Crie uma classe NumeroDecrescente que contenha um método que receba um
 * número inteiro e imprima, em ordem decrescente, o valor do número até 0.
 */

public class Exercicio4 {
	public static void numeroDecrescente (int num) {
		int lista;
		for (int i = 0; i < num + 1; i++) {
			lista = num - i;
			System.out.println(lista);
		}
	}
	
	
	public static void main(String[] args) {
		int num = 10;
		numeroDecrescente(num);
	}
}
