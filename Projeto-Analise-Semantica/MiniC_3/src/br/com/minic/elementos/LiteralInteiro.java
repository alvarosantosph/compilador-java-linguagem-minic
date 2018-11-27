package br.com.minic.elementos;

public class LiteralInteiro implements IExpressao {

	// Atributo

	private int valor;

	// Construtor

	public LiteralInteiro(int valor) {

		this.setValor(valor);

	}

	// Métodos Acessores e Modificadores

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
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
