package br.edu.qi.planetoffice.model;
// Generated 09/12/2018 19:07:56 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Aluno generated by hbm2java
 */
@Entity
@Table(name = "aluno")
public class Aluno implements java.io.Serializable {

	private Integer idPessoa;
	private Pessoa pessoa;
	private String fpagamento;
	private Set<Turma> turmas = new HashSet<Turma>(0);

	public Aluno() {
	}

	public Aluno(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Aluno(Pessoa pessoa, String fpagamento) {
		this.pessoa = pessoa;
		this.fpagamento = fpagamento;
	}

	public Aluno(Pessoa pessoa, String fpagamento, Set<Turma> turmas) {
		this.pessoa = pessoa;
		this.fpagamento = fpagamento;
		this.turmas = turmas;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "pessoa"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "idPessoa", unique = true, nullable = false)
	public Integer getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "fpagamento", length = 15)
	public String getFpagamento() {
		return this.fpagamento;
	}

	public void setFpagamento(String fpagamento) {
		this.fpagamento = fpagamento;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "alunos")
	public Set<Turma> getTurmas() {
		return this.turmas;
	}

	public void setTurmas(Set<Turma> turmas) {
		this.turmas = turmas;
	}

}
