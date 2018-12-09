package br.edu.qi.planetoffice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "sexo")
public class Sexo {

	private Integer idSexo;
	private String descricao;
	private Set<Pessoa> pessoas = new HashSet<Pessoa>(0);

	public Sexo() {
	}

	public Sexo(String descricao, Set<Pessoa> pessoas) {
		this.descricao = descricao;
		this.pessoas = pessoas;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSexo", unique = true, nullable = false)
	public Integer getIdSexo() {
		return this.idSexo;
	}

	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}

	@Column(name = "descricao", length = 15)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sexo")
	public Set<Pessoa> getPessoaes() {
		return this.pessoas;
	}

	public void setPessoaes(Set<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}
