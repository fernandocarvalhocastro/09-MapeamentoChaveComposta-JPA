package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_FUNCIONARIO")
@SecondaryTable(name="T_DADO_FUNCIONARIO")
@SequenceGenerator(allocationSize = 1, name = "seqFuncionario", sequenceName = "SQ_FUNCIONARIO")
public class Funcionario {

	@Id
	@GeneratedValue(generator = "seqFuncionario", strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_funcionario")
	private int codigo;

	@Column(name = "nm_funcionario", nullable = false, length = 100)
	private String nome;

	@Column(name = "dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	//OUTRAS TABELAS PRA MESMA ENTIDADE!!!

	
	@Column(name = "vl_salario", table="T_DADO_FUNCIONARIO")
	private double salario;

	@Column(name = "nr_conta" , table="T_DADO_FUNCIONARIO")
	private int conta;

	@Column(name = "nr_agencia", table="T_DADO_FUNCIONARIO")
	private int agencia;

	public Funcionario() {

	}

	public Funcionario(String nome, Calendar dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}
