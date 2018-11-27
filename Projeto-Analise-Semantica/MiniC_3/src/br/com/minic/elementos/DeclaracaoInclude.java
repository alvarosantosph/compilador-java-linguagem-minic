package br.com.minic.elementos;

public class DeclaracaoInclude {
	
	// Atributos
	
	private String identificador;
	
	
	// Construtor
	
	public DeclaracaoInclude(String identificador) {
		setIdentificador(identificador);
	}
	
	// Métodos Acessores e Modificadores

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	// Método toString
	
	@Override
	public String toString() {
	    StringBuilder declaracaoInclude = new StringBuilder();
	    
	    declaracaoInclude.append("#include<" + this.getIdentificador() + ".h>" );   
	    
		return declaracaoInclude.toString();
	}

}
