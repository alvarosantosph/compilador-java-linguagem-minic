package br.com.minic.elementos;

public class ComandoPrintint implements IComando {
	
	// Atributos
	
	private boolean EntreParenteses;
	private IExpressao exp;
	
	// Construtor
	
	public ComandoPrintint(IExpressao exp) {
		setExp(exp);
	}
	
	// Métodos Acessores e Modificadores

	public IExpressao getExp() {
		return exp;
	}

	public void setExp(IExpressao exp) {
		this.exp = exp;
	}
	public boolean EntreParenteses() {
        return EntreParenteses;
    }

    public void setEntreParenteses(boolean EntreParenteses) {
        this.EntreParenteses = EntreParenteses;
    }

    // Método toString
	
	public String toString() {
		StringBuilder comandoprintint = new StringBuilder();
		
		if(this.EntreParenteses){
	        String retorno = "printf(" + this.exp.toString() + ");";
	        comandoprintint.append(retorno);
	    }
	    else{
	        String retorno = "printf" + this.exp.toString() + ";";
	        comandoprintint.append(retorno);
	    }
	    
	    return comandoprintint.toString();		
	}

}
