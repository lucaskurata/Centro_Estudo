package classe;

public class calculadora {
	double resultado;
	//recebe parametro e retorna algo
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}
	//recebe par�metro  mas n�o retorna nada
	void acrescentar (double a) {
		resultado+=a;
	}
	//n�o recebe par�metro mas retorna algo
	double obterResultado() {
		return resultado;
	}
	//n�o recebe e nem retorna algo
	void apagar() {
		resultado = 0;
	}
	
}
