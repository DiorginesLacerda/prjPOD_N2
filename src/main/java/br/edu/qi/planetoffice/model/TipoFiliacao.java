package br.edu.qi.planetoffice.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "tipo_filiacao")
public class TipoFiliacao {

	private Integer idTipo;
	private String descricao;
	private Set<Filiacao> filiacaos = new HashSet<Filiacao>(0);

	public TipoFiliacao() {
	}

	public TipoFiliacao(String descricao, Set<Filiacao> filiacaos) {
		this.descricao = descricao;
		this.filiacaos = filiacaos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTipo", unique = true, nullable = false)
	public Integer getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	@Column(name = "descricao", length = 15)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoFiliacao")
	public Set<Filiacao> getFiliacaos() {
		return this.filiacaos;
	}

	public void setFiliacaos(Set<Filiacao> filiacaos) {
		this.filiacaos = filiacaos;
	}
}
