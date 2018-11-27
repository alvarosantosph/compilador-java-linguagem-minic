package br.com.minic.elementos;


public class DeclInclude {
	
	 // Atributo
	
	private String identificador; 
		   
	  // Construtor

	  public DeclInclude(String identificador){

		  this.setIdentificador( identificador );

	    
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
		  
		  StringBuilder declarainclude = new StringBuilder();
		  
		  declarainclude.append( "#include <" );	
		  declarainclude.append( this.getIdentificador());
		  declarainclude.append( ".h>" );    
		  return declarainclude.toString();
	    
	  }
	  
	
}
