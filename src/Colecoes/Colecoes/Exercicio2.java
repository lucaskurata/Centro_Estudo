package Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Lucas");
		aprovados.add("henrique");
		aprovados.add("rodrigo");
		aprovados.add("Leia");
		aprovados.add("Armando");
		
		Collections.reverse(aprovados);
		System.out.println(aprovados);
	}
}

