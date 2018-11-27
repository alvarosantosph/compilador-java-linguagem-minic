package br.com.minic.elementos;

public class ComandoWhile implements IComando {
	
	// Atributos
	
	IComando codWHILE;
	IExpressao expRelacional;
	
	// Construtor
	
	public ComandoWhile(IExpressao ExpRelacional, IComando codWHILE) {
		setExpRelacional(expRelacional);
		setCodWHILE(codWHILE);
	}
	
	// Métodos Acessores e Modificadores

	public IExpressao getExpRelacional() {
		return expRelacional;
	}

	public void setExpRelacional(IExpressao expRelacional) {
		this.expRelacional = expRelacional;
	}

	public IComando getCodWHILE() {
		return codWHILE;
	}

	public void setCodWHILE(IComando codWHILE) {
		this.codWHILE = codWHILE;
	}
	
	// Método toString
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("while (" + this.getExpRelacional() + ") \n");
		toString.append("  " + this.getCodWHILE() + ";");
		
	    return toString.toString();		
	}
	
	// Método Implementado

	public void setEntreParenteses(boolean b) {
		
	}

}
