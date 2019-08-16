package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapa {

	public static void main(String[] args) {
		Map<Integer, String> aprovados = new HashMap<Integer, String>();
		
		//Adicionando chave e valor
		aprovados.put(1, "Lucas");
		aprovados.put(2, "Henrique");
		aprovados.put(3, "Armando");
		aprovados.put(4, "Léia");
		
		//Buscando as chave(Key)
		System.out.println(aprovados.keySet());
		
		//Buscando os valores(values)
		System.out.println(aprovados.values());
		
		//Buscando chave e valor 
		System.out.println(aprovados.entrySet());
		
		//Alterando a chave/valor
		aprovados.put(1, "Lucas Kurata");
		System.out.println("\n Retornando a chave/valor que foi alterado: " + aprovados.get(1));

		//Contains retorna o valor
		//containsKey() retorna a chave
		//containsValue() --> retorna o valor
		System.out.println("\nBuscando pela chave" + aprovados.containsKey(3));
		System.out.println("Buscando pela Value" + aprovados.containsValue("Armando"));
	
		for (Integer codigo: aprovados.keySet()) {
			System.out.println("\n keys por FOR: " + codigo);
		}
		
		for (String nome: aprovados.values()) {
			System.out.println("\n Values por FOR: " + nome);
		}
		
		for (Entry<Integer, String> todos: aprovados.entrySet()) {
			System.out.println("\n Chave/Valor tudo junto: " + todos.getKey() + " " + todos.getValue());
		}
	}
}
