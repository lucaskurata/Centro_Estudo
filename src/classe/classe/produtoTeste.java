package classe;

public class produtoTeste {
	public static void main(String[] args) {
		produto prod1 = new produto();
		prod1.nome = "Notebook Acer";
		prod1.preco = 1260.00;
		prod1.desconto = 0.15;
		
		produto prod2 = new produto ("Caneta bic", 2.50, 0.05);
		
		System.out.println(prod1.produtoDesconto());
		System.out.println(prod2.produtoDesconto());
	}
}
