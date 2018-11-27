package br.com.minic.elementos;

public class ExpressaoUnaria implements IExpressao {

	// Atributos

	private String operador;
	private IExpressao expressao;
	private boolean isEntreParenteses;

	// Construtor

	public ExpressaoUnaria(String operador, IExpressao expressao) {

		this.setOperador(operador);
		this.setExpressao(expressao);

	}

	// Métodos Acessores e Modificadores

	public String getOperador() {

		return operador;

	}

	public void setOperador(String operador) {

		this.operador = operador;

	}

	public IExpressao getExpressao() {

		return expressao;

	}

	public void setExpressao(IExpressao expressao) {

		this.expressao = expressao;

	}

	public boolean isEntreParenteses() {

		return isEntreParenteses;

	}

	// Método toString
	
	@Override

	public String toString() {

		if (this.isEntreParenteses) {

			return "(" + this.getOperador() + "" + this.getExpressao() + ")";

		} else {

			return this.getOperador() + "" + this.getExpressao();

		}

	}
	
	// Método Implementado

	public void setEntreParenteses(boolean isEntreParenteses) {

	}

}
