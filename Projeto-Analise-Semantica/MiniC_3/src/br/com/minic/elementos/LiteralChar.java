package br.com.minic.elementos;

public class LiteralChar implements IExpressao {

	// Atributos

	private String valor;

	// Construtor

	public LiteralChar(String valor) {

		this.setValor(valor);

	}

	// Métodos Acessores e Modificadores

	public String getValor() {

		return valor;

	}

	public void setValor(String valor) {

		this.valor = valor;

	}
	
	// Método toString

	@Override

	public String toString() {

		return String.valueOf(this.getValor());

	}

	// Método Implementado
	
	public void setEntreParenteses(boolean isEntreParenteses) {

	}

}
