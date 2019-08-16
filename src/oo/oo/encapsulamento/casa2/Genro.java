package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo ;
	private int ano;
	
	/*public Genro (String segredo, int ano) {
		this.setSegredo ( segredo);
		this.setAno (ano);
	}*/
	
	/*public void apresentar() {
		System.out.println(this.getSegredo());
		System.out.println(this.getAno());
	}*/
	
	public void setSegredo(String segredo) {
		this.segredo = segredo;
		
	}
	public String getSegredo(){
		return this.segredo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public static void main(String[] args) {
		Genro exibe = new Genro();
		
		exibe.setSegredo("Java é difícil");
		exibe.setAno(2019);
		System.out.println("O segredo é: " + exibe.getSegredo());
		System.out.println("O ano é: " + exibe.getAno());
		//System.out.println("eu nunca falarei.." + exibe.segredo);
		
		
		
		/*Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoCasal);
		
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja);*/
		
		//Sogra sogrinha = new Sogra();
		//System.out.println(sogrinha.segredoDeFamilia);
	}
}
