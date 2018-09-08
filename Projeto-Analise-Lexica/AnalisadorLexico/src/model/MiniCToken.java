/**
 * UNIPE - Centro Universitario de Joao Pessoa
 * Ano Letivo: 2018.2
 * Disciplina: Construção de Compiladores
 * Professor: Hilario Tomaz Alves de Oliveira
 */

package model;

/**
* @author: Alvaro Andrade
* @date: 07 de set de 2018
* @time: 20:23:00
*/

public class MiniCToken {

	private String tipo;
	private String lexema;
	private int linha;
	private int coluna;

	public MiniCToken(String tipo, String lexema, int linha, int coluna) {
		this.tipo = tipo;
		this.lexema = lexema;
		this.linha = linha;
		this.coluna = coluna;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLexema() {
		return lexema;
	}

	public void setLexema(String lexema) {
		this.lexema = lexema;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
}
