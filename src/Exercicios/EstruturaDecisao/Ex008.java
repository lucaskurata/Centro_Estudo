package EstruturaDecisao;

import java.util.Scanner;

/*Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
"Telefonou para a v�tima?"
"Esteve no local do crime?"
"Mora perto da v�tima?"
"Devia para a v�tima?"
"J� trabalhou com a v�tima?" O programa deve no final emitir uma classifica��o sobre a participa��o da 
pessoa no crime. Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 
3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".*/

public class Ex008 {
	public static void main(String[] args) {
		int contador = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Telefonou para a v�tima? ");
		String resposta = in.nextLine().toLowerCase();
		if(resposta == "sim") {
			contador++;
			System.out.println(contador);
		}
		System.out.println("Esteve no local do crime? ");
		String resposta2 = in.nextLine().toLowerCase();
		if(resposta2 == "sim") {
			contador++;
			System.out.println(contador);
		}
		System.out.println("Mora perto da v�tima?" ) ;
		String resposta3 = in.nextLine().toLowerCase();
		if(resposta3 == "sim") {
			contador++;
			System.out.println(contador);
		}
		System.out.println("Devia para a v�tima? ");
		String resposta4 = in.nextLine().toLowerCase();
		if(resposta4 == "sim") {
			contador++;
			System.out.println(contador);
		}
		System.out.println("J� trabalhou com a v�tima?");
		String resposta5 = in.nextLine().toLowerCase();
		if(resposta5 == "sim") {
			contador++;
			System.out.println(contador);
		}
			
		if(contador == 2) {
			System.out.println("Suspeito!");
		}
		else if(contador>2 && contador <=4) {
			System.out.println("C�mplice");
		}else if(contador == 5) {
			System.out.println("Assassino!");
		}else if(contador == 0) {
			System.out.println("Inocente!");
		}
	}
	
}
