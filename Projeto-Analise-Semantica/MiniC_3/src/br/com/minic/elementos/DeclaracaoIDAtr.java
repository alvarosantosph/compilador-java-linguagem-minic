package br.com.minic.elementos;

public class DeclaracaoIDAtr {
	
	// Atributos
	
	private Identificador id;
	private IExpressao exp;
	
	
	// Construtor
	
	public DeclaracaoIDAtr(Identificador id, IExpressao exp) {
		setId(id);
		setExp(exp);
	}
	
	// Métodos Acessores e Modificadores

	public Identificador getId() {
		return id;
	}

	public void setId(Identificador id) {
		this.id = id;
	}

	public IExpressao getExp() {
		return exp;
	}

	public void setExp(IExpressao exp) {
		this.exp = exp;
	}
	
	// Método toString
	
	public String toString() {
		StringBuilder declaracaoIDAtr = new StringBuilder();
        declaracaoIDAtr.append(this.id.toString());
        declaracaoIDAtr.append(" = ");
        declaracaoIDAtr.append(this.exp.toString());
        return declaracaoIDAtr.toString();		
	}	

}
