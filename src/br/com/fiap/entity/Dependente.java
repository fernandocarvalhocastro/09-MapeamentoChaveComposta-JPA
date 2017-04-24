package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_DEPENDENTE")
@IdClass(DependentePK.class)
public class Dependente {

	@Id
	@SequenceGenerator(allocationSize = 1, name = "seqDependente", sequenceName = "SQ_DEPENDENTE")
	@GeneratedValue(generator = "seqDependente", strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_dependente")
	private int codigo;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	@JoinColumn(name="cd_funcionario")
	private Funcionario funcionario;

	@Column(name = "nm_dependente", nullable = false, length = 100)
	private String nome;
	
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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	
}
