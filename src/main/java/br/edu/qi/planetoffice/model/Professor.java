package br.edu.qi.planetoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity(name = "professores")
public class Professor {

	private Integer idPessoa;
	private Pessoa pessoa;
	private String formacao;

	public Professor() {
	}

	public Professor(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Professor(Pessoa pessoa, String formacao) {
		this.pessoa = pessoa;
		this.formacao = formacao;
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

	@Column(name = "formacao", length = 15)
	public String getFormacao() {
		return this.formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

}
