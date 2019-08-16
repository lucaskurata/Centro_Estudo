package classe;

public class produto {
	String nome;
	double preco;
	double desconto;
	
	produto(){
		
	}
	
	produto(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	double produtoDesconto() {
		return preco - preco*desconto;
	}
}
