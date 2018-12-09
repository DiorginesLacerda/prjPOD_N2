package br.edu.qi.planetoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "filiacao")
public class Filiacao {

	private Integer idFiliacao;
	private Pessoa pessoas;
	private TipoFiliacao tipoFiliacao;
	private String descricao;

	public Filiacao() {
	}

	public Filiacao(Pessoa pessoas, TipoFiliacao tipoFiliacao, String descricao) {
		this.pessoas = pessoas;
		this.tipoFiliacao = tipoFiliacao;
		this.descricao = descricao;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idFiliacao", unique = true, nullable = false)
	public Integer getIdFiliacao() {
		return this.idFiliacao;
	}

	public void setIdFiliacao(Integer idFiliacao) {
		this.idFiliacao = idFiliacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	public Pessoa getPessoa() {
		return this.pessoas;
	}

	public void setPessoa(Pessoa pessoas) {
		this.pessoas = pessoas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipo")
	public TipoFiliacao getTipoFiliacao() {
		return this.tipoFiliacao;
	}

	public void setTipoFiliacao(TipoFiliacao tipoFiliacao) {
		this.tipoFiliacao = tipoFiliacao;
	}

	@Column(name = "descricao", length = 15)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
