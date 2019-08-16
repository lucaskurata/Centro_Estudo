package oo.heranca;

public class carro {

	protected int velocidade_maxima = 200;
	private int velocidade_atual = 0;
	
	protected final void acelerarMais(int velocidade) {
		if(velocidade_atual + velocidade > velocidade_maxima) {
			velocidade_atual = velocidade_maxima;
		}else {
			velocidade_atual+= velocidade;
		}
	}
	
	protected final void frearMais(int velocidade) {
		if (velocidade_atual - velocidade < 0) {
			velocidade_atual = 0;
		}else {
			velocidade_atual -= velocidade;
		}
	}
	
	public void acelerar() {
		acelerarMais(5);
	}
	public void frear() {
		frearMais(5);
	}
	
	public int getVelocidade_atual(){
		return this.velocidade_atual;
	}
}
