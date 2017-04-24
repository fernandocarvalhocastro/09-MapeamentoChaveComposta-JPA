package br.com.fiap.entity;

import java.io.Serializable;

public class DependentePK implements Serializable{

	private int funcionario;
	private int codigo;

	public int getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	}

	public int getDependente() {
		return codigo;
	}

	public void setDependente(int dependente) {
		this.codigo = dependente;
	}

}
