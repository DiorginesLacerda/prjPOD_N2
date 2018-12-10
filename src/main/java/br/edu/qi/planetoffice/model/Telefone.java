package br.edu.qi.planetoffice.model;
// Generated 09/12/2018 19:07:56 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone implements java.io.Serializable {

	private Integer idTelefone;
	private Pessoa pessoa;
	private String telefone;

	public Telefone() {
	}

	public Telefone(String telefone) {
		this.telefone = telefone;
	}

	public Telefone(Pessoa pessoa, String telefone) {
		this.pessoa = pessoa;
		this.telefone = telefone;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
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

	@Column(name = "telefone", length = 15)
	public String getTelefones() {
		return this.telefone;
	}

	public void setTelefones(String telefone) {
		this.telefone = telefone;
	}

}
