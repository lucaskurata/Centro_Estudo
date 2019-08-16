package testeOO;

public class detalhes {

	
	public String funcao;
	public String tipo;
	
	protected final void descreve_funcao(String funcao) {
		System.out.println(funcao);
	}
	
	protected final void descreve_tipo (String tipo) {
		System.out.println(tipo);
	}
	
	public void descreve() {
		descreve_funcao("analista");
	}
	
	public void tipo() {
		descreve_tipo("estagiário");
	}
}
