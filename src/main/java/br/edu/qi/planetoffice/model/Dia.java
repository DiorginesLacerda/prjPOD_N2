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

@Entity(name = "dias")
public class Dia {

	private Integer idDia;
	private String descricao;
	private Set<Horario> horarios = new HashSet<Horario>(0);

	public Dia() {
	}

	public Dia(String descricao, Set<Horario> horarios) {
		this.descricao = descricao;
		this.horarios = horarios;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDia", unique = true, nullable = false)
	public Integer getIdDia() {
		return this.idDia;
	}

	public void setIdDia(Integer idDia) {
		this.idDia = idDia;
	}

	@Column(name = "descricao", length = 70)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dias")
	public Set<Horario> getHorarioes() {
		return this.horarios;
	}

	public void setHorarioes(Set<Horario> horarios) {
		this.horarios = horarios;
	}
}
