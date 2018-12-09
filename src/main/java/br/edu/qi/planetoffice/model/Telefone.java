package br.edu.qi.planetoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "telefones")
public class Telefone {

	private Integer idTelefone;
	private Pessoa pessoa;
	private String telefones;

	public Telefone() {
	}

	public Telefone(Pessoa pessoa, String telefones) {
		this.pessoa = pessoa;
		this.telefones = telefones;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTelefone", unique = true, nullable = false)
	public Integer getIdTelefone() {
		return this.idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "telefones", length = 15)
	public String getTelefone() {
		return this.telefones;
	}

	public void setTelefone(String telefones) {
		this.telefones = telefones;
	}

}
