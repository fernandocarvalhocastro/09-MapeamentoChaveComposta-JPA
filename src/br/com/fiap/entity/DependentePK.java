package br.com.fiap.entity;

import java.io.Serializable;

public class DependentePK implements Serializable{

	private int funcionario;
	private int dependente;

	public int getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	}

	public int getDependente() {
		return dependente;
	}

	public void setDependente(int dependente) {
		this.dependente = dependente;
	}

}
