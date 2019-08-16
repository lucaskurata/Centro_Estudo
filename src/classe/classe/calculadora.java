package classe;

public class calculadora {
	double resultado;
	//recebe parametro e retorna algo
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}
	//recebe parâmetro  mas não retorna nada
	void acrescentar (double a) {
		resultado+=a;
	}
	//não recebe parâmetro mas retorna algo
	double obterResultado() {
		return resultado;
	}
	//não recebe e nem retorna algo
	void apagar() {
		resultado = 0;
	}
	
}
