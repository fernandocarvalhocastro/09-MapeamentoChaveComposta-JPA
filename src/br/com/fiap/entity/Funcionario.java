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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_FUNCIONARIO")
@SequenceGenerator(allocationSize=1, name="seqFuncionario", sequenceName="SQ_FUNCIONARIO")
public class Funcionario {

	@Id
	@GeneratedValue(generator="seqFuncionario", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_funcionario")
	private int codigo;
	
	@Column(name="nm_funcionario",nullable=false, length=100)
	private String nome;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	/*
	@OneToMany(mappedBy="funcionario", cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	private List<Dependente> dependentes;
	 */
	
	public Funcionario(){
		
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
}
