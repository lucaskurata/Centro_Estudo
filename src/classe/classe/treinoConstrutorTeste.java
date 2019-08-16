package classe;

public class treinoConstrutorTeste {
	public static void main(String[] args) {
		treinoConstrutorFunc funcionario = new treinoConstrutorFunc("Henrique", 1500.00, "engenheiro");
		
		
		System.out.println("Nome: "+ funcionario.nome + "\nSalario: " + funcionario.salario + "\nFunção: " + funcionario.funcao);
		System.out.println("Nome: "+ funcionario.nome + "\nSalario: " + funcionario.salario + "\nFunção: " + funcionario.funcao);

	}
}
