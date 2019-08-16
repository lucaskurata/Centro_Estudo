package oo.heranca;

public class ferrari extends carro{

	public ferrari() {
		velocidade_maxima = 350;
	}
	public void acelerar() {
		super.acelerarMais(20);
	}
	public void frear() {
		super.frearMais(15);
	}
	
}
