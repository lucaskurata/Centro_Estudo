package classe;

public class calculadoraTeste {
	public static void main(String[] args) {
		calculadora calc = new calculadora();
		System.out.println(calc.somar(2.5, 2.5));
		calc.acrescentar(5.0);
		System.out.println(calc.obterResultado());
		calc.apagar();
		System.out.println(calc.obterResultado());
	}
}
