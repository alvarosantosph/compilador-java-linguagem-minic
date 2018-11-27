package br.com.minic.elementos;

import java.util.ArrayList;

public class TodosOsComandos implements IComando {

	// Atributo

	ArrayList<IComando> comandosOpt;

	// Construtor

	public TodosOsComandos(ArrayList<IComando> comandosOpt) {
		setComandosOpt(comandosOpt);
	}

	// Métodos Acessores e Modificadores

	public ArrayList<IComando> getComandosOpt() {
		return comandosOpt;
	}

	public void setComandosOpt(ArrayList<IComando> comandosOpt) {
		this.comandosOpt = comandosOpt;
	}

	// Método toString

	public String toString() {
		StringBuilder BlocoDeComandos = new StringBuilder();
		if (this.comandosOpt != null) {
			for (IComando ComandoOpt : this.comandosOpt) {

				BlocoDeComandos.append(ComandoOpt.toString());
				BlocoDeComandos.append("\n");

			}
		}
		return BlocoDeComandos.toString();
	}

	// Método Implementado

	public void setEntreParenteses(boolean b) {

	}
}
