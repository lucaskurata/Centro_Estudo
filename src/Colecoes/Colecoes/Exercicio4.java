package Colecoes;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int vetor1 [] = {1, 2, 3, 4, 5};
		int vetor2  [] = {4, 5, 6, 7, 8};
		int interseccao [] = new int [(vetor1.length + vetor2.length / 2)];
		
		for (int i = 0; i < vetor1.length; i++) {
			for(int j = 0 ; j < vetor2.length; j ++) {
				if (vetor1[i] == vetor2[j]) {
					interseccao[i] = vetor1[i];
					System.out.println(interseccao[i]);
					break;
				}
			}
		}
	}


	
}
