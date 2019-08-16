package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class SET_ConjuntoArrumado {
	public static void main(String[] args) {
		Set<String> aprovados = new HashSet<String>();
		aprovados.add("lucas");
		aprovados.add("kurata");
		aprovados.add("Tamashiro");
		
		System.out.println("Sem for(each): "+ aprovados);
		for(Object nome: aprovados) {
			System.out.println("\n Com for(each)" + nome);
		}
	}
}
