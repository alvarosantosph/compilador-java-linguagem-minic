/**
 * UNIPE - Centro Universitario de Joao Pessoa
 * Ano Letivo: 2018.2
 * Disciplina: Construção de Compiladores
 * Professor: Hilario Tomaz Alves de Oliveira
 */

package geradorDeClasse;

import java.io.File;
import java.nio.file.Paths;

public class GeradorMiniC {

	 /**
	 * @author: Alvaro Andrade
	 * @date: 07 de set de 2018
	 * @time: 20:23:00
	 */
	
    public static void main(String[] args) {

        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/especificacoes/";

        String file = rootPath + subPath + "AnalisadorLexicoC.lex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);

    }
}