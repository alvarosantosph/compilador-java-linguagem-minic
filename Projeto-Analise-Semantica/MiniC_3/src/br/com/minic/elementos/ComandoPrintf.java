package br.com.minic.elementos;

public class ComandoPrintf implements IComando {
	
	// Atributo
	
	IExpressao exp;
	
	// Construtor
	
	public ComandoPrintf(IExpressao exp) {
		setExp(exp);
	}
	
	// Métodos Acessores e Modificadores

	public IExpressao getExp() {
		return exp;
	}

	public void setExp(IExpressao exp) {
		this.exp = exp;
	}

	// Método toString
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("Printf(" + this.getExp() + ");");
		
	    return toString.toString();		
	}
	
	// Método Implementado

	public void setEntreParenteses(boolean b) {
		
	}
}
