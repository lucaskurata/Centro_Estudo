package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Lucas");
		fila.add("kurata");
		fila.offer("Tamashiro");
		
		//Peek - retorna null se 1º elemento não existir na fila
		//Element - retorna um erro se 1º elemento não existir na fila
		 System.out.println("pegando o primeiro da fila com peek: " + fila.peek());
		 System.out.println("pegando o primeiro da fila com element: "+ fila.element());
		 
		 //Apaga o primeiro da fila
		 //Poll apaga item, se não existir ele retorna null
		 //Remove apaga item, se não existir ele retorna um erro
		 System.out.println("\nApagando o primeiro da fila com poll() : " + fila.poll());
		 System.out.println("Apagando o primeiro da fila com remove() " + fila.remove());
		 System.out.println("Apagando o primeiro da fila com pool(): " + fila.poll());
		 System.out.println("tentando remover uma fila vazia: " + fila.poll());
		
	}
}
