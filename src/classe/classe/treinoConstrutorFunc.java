package classe;

public class treinoConstrutorFunc {
	String nome;
	double salario;
	String funcao;
	
	treinoConstrutorFunc(String n, double s, String f){
		nome = n;
		salario = s;
		funcao = f;
	}
	
	String formatar() {
		return String.format("%d \n%d \n%d", nome, salario, funcao);
	}
}
