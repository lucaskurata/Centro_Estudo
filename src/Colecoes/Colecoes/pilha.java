package Colecoes;

import java.util.Stack;

public class pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		
		//Adicionado elementos na pilha
		pilha.push("Diario de um banana 1");
		pilha.push("A ilha perdida");
		pilha.push("Diario do Jhon Whinchester");
		
		
		System.out.println("Mostrando como funciona o Last In (peek()): ");
		System.out.println(pilha.peek());
		
		System.out.println("\n Removendo com pop(): " + pilha.pop());
		System.out.println("Removendo com pop(): " + pilha.pop());
		System.out.println("Removendo com pop(): " + pilha.pop());
		
		
	}
}
