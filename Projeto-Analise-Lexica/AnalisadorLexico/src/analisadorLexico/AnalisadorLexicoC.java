/**
 * UNIPE - Centro Universitario de Joao Pessoa
 * Ano Letivo: 2018.2
 * Disciplina: Construção de Compiladores
 * Professor: Hilario Tomaz Alves de Oliveira
 */

package analisadorLexico;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

import model.MiniCToken;

/**
* @author: Alvaro Andrade
* @date: 07 de set de 2018
* @time: 20:23:00
*/

public class AnalisadorLexicoC {

    public static void main(String[] args) throws IOException{

        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/programa";

        String sourceCode = rootPath + subPath + "/ProgramaMiniC.txt";

        AnalisadorLexicoGerado lexical = new AnalisadorLexicoGerado(new FileReader(sourceCode));

        MiniCToken token;
        
        try {

        while ((token = lexical.yylex()) != null) {
        	
        	int linha = token.getLinha() + 1;
        	int coluna = token.getColuna() + 1;
        	
            System.out.println("<" + token.getTipo() + ", " + token.getLexema() + ", " + "L " + linha + " , " + "C " + coluna + ">");
        }
        
        } catch (Exception ex) {
        	System.out.println(ex);
        }
    }
}