package EstruturaDecisao;

import java.util.Scanner;

/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da 
pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 
3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/

public class Ex008 {
	public static void main(String[] args) {
		int contador = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Telefonou para a vítima? ");
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
		System.out.println("Mora perto da vítima?" ) ;
		String resposta3 = in.nextLine().toLowerCase();
		if(resposta3 == "sim") {
			contador++;
			System.out.println(contador);
		}
		System.out.println("Devia para a vítima? ");
		String resposta4 = in.nextLine().toLowerCase();
		if(resposta4 == "sim") {
			contador++;
			System.out.println(contador);
		}
		System.out.println("Já trabalhou com a vítima?");
		String resposta5 = in.nextLine().toLowerCase();
		if(resposta5 == "sim") {
			contador++;
			System.out.println(contador);
		}
			
		if(contador == 2) {
			System.out.println("Suspeito!");
		}
		else if(contador>2 && contador <=4) {
			System.out.println("Cúmplice");
		}else if(contador == 5) {
			System.out.println("Assassino!");
		}else if(contador == 0) {
			System.out.println("Inocente!");
		}
	}
	
}
