package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class lista {
	public static void main(String[] args) {
		List<String> nome = new ArrayList<String>();
		nome.add("Lucas");
		nome.add("Tamashiro");
		nome.add("Takashi");
		nome.add("Kurata");
		
		System.out.println(nome);
		
		
		//GET ou BUSCA POR INDICE
		System.out.println("buscando por indice: " + nome.get(1));
		
		//Adicionando repetido
		nome.add("Takashi");
		System.out.println("repetido: " +nome);
		
		//Removendo
		System.out.println("removendo: " +  nome.remove(4));
		
		
		//tamanho
		System.out.println("\nremovendo: "+nome.size());
		
		//for(each)
		for (Object nomes: nome) {
			System.out.println(nomes);
		}
	}
}
