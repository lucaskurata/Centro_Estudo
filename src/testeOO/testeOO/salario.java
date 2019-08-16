package testeOO;

import testeOO.detalhes;

public class salario extends detalhes{

	private int salario;
	private String nome;
	private String empresa;
	private String endereco;
	
	public void apresentar() {
		System.out.println("Salário: " + getSalario());
		System.out.println("Nome do empregado: " + getNome());
		System.out.println("Nome da empresa: " + getEmpresa());
		System.out.println("Endereço da empresa: " + getEndereco());
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public int getSalario() {
		return this.salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getEmpresa() {
		return this.empresa;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public static void main(String[] args) {
		salario exibe = new salario();
		exibe.setSalario(1260);
		exibe.setNome("Lucas Kurata");
		exibe.setEmpresa("Ericsson");
		exibe.setEndereco("Alameda Araguaia, 2104");
		exibe.apresentar();
		detalhes d = new detalhes();
		
	}
	
}
