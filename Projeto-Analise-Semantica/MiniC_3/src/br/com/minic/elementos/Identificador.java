package br.com.minic.elementos;

public class Identificador implements IExpressao {

	// Atributos

	private String nome;

	// Construtor

	public Identificador(String nome) {

		this.setNome(nome);

	}

	// Métodos Acessores e Modificadores

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	// Método toString
	
	@Override

	public String toString() {

		return this.getNome();

	}

	// Método Implementado
	
	public void setEntreParenteses(boolean isEntreParenteses) {

	}

}
