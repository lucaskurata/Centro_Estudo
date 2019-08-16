package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class SET_ConjutoBaguncado {
	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("lucas");
		conjunto.add(3);
		conjunto.add(2.5);
		conjunto.add(false);
		
		System.out.println(conjunto.add(3));
		System.out.println(conjunto.add(4));
		System.out.println("Size --> " + conjunto.size());
		
		System.out.println("\n Removendo:");
		System.out.println("removendo um char" + conjunto.remove("a"));
		System.out.println("removendo um char" + conjunto.remove('a'));
	
		System.out.println("\n contido: ");
		System.out.println("está contido: "+ conjunto.contains("lucas"));
		
		System.out.println("\n Removendo: ");
		conjunto.clear();
		System.out.println(conjunto);
		System.out.println(conjunto.isEmpty());
	}
}
