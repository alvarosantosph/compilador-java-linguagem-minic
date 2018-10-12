
package br.com.minic;

import java.io.FileReader;

import com.sun.xml.internal.ws.api.wsdl.parser.XMLEntityResolver.Parser;

import br.com.minic.analisadorlexico.AnalisadorLexico;
import br.com.minic.analisadorsintatico.parser;
import java_cup.runtime.Symbol;

public class CompiladorMiniC {

  public static void main(String[] args) throws Exception {
  
    FileReader arquivoTeste = new FileReader( "programas/ProgramaTeste.txt" );
    
    AnalisadorLexico analisadorLexico = new AnalisadorLexico( arquivoTeste );
    
    parser analisadorSintatico = new parser( analisadorLexico );
    
    Symbol symbol = analisadorSintatico.parse();
    
    System.out.println( symbol );
	  
  }
  
}
