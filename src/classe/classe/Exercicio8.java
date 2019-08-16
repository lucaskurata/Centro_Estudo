package classe;

/**
 * 12. Modele uma classe Carro com os seguintes atributos: Nome do fabricante,
 * Modelo do carro, Ano do Carro. Crie o construtor para a classe Carro. Altere
 * os atributos para serem privados e crie os métodos get e set para cada
 * atributo. Crie um método apresentar(), a qual imprimirá no console as
 * informações do Carro.
 */

public class Exercicio8 {

	private String nomeFabricante;
	private String modelo;
	private int ano;
	
	public Exercicio8 (String nomeFabricante, String modelo, int ano) {
		this.setNomeFabricante(nomeFabricante);
		this.setModelo (modelo);
		this.setAno(ano);
	}
	
	public void apresentar() {
		System.out.println("FABRICANTE " + this.getNomeFabricante());
		System.out.println("MODELO " + this.getModelo());
		System.out.println("Ano "+ this.getAno());
	}
	
	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}
	
	public String getNomeFabricante() {
		return nomeFabricante;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	public static void main(String[] args) {
		Exercicio8 teste = new Exercicio8("Honda", "Accord", 2019);
		teste.apresentar();
	}
	
}
