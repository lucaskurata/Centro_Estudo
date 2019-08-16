package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra{
	
	//Defaul  nao precisa ser declarado
	String segredoCasal = "Meu marido está quase sendo demitido!";
	
	public static void main(String[] args) {
		Filha exibe = new Filha();
		System.out.println(exibe.segredoCasal);
		
		/*Genro meuAmor = new Genro();
		System.out.println(meuAmor.segredo);*/
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		Sogra mamae = new Sogra();
		//ERRADO ----------- System.out.println(mamae.segredoDeFamilia);
		//JÁ QUE É POR HERANÇA, DEVEMOS USAR A MESMA INSTANCIA DA CLASSE QUE ESTÁ HERDANDO
		
		System.out.println(exibe.segredoDeFamilia);
		
		
		
	}
}
