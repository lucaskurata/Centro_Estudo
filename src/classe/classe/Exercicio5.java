package classe;

/**
 * 8. Crie uma classe ParImpar que contenha um m�todo que imprima em tela a soma
 * dos n�meros pares de 0 a 30 e a multiplica��o dos n�meros �mpares de 0 a 30.
 */

public class Exercicio5 {
	
		public static void somaParesMultiplicacaoImpares() {
			long par = 0;
			int impar = 0;

			for (int i = 0; i < 30; i++) {
				if (i % 2 == 0) {
					if (i > 2) {
						par = par * i;
					} else {
						par = i;
					}
				} else {
					impar = impar + i;
				}
			}

		System.out.println(par);
		System.out.println(impar);
	}
	
	public static void main(String[] args) {
		somaParesMultiplicacaoImpares();
	}
}
