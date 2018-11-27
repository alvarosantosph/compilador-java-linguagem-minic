package br.com.minic.elementos;

public class ComandoExpAtribuicao implements IComando {
	
	// Atributos
	
	IExpressao identificador;
	IExpressao expAtr;
	
	// Construtor
	
	public ComandoExpAtribuicao(IExpressao identificador, IExpressao expAtr) {
		setIdentificador(identificador);
		setExpAtr(expAtr);
	}
	
	// Métodos Acessores e Modificadores

	public IExpressao getIdentificador() {
		return identificador;
	}

	public void setIdentificador(IExpressao identificador) {
		this.identificador = identificador;
	}
	
	public IExpressao getExpAtr() {
		return expAtr;
	}

	public void setExpAtr(IExpressao expAtr) {
		this.expAtr = expAtr;
	}
	
	// Método toString

	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getIdentificador());
		toString.append(this.getExpAtr());
		toString.append(";");
		
		return toString.toString();
	}
	
	// Método Implementado

	public void setEntreParenteses(boolean b) {
		
	}

}
