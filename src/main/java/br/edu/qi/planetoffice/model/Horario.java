package br.edu.qi.planetoffice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "horarios")
public class Horario {

	private Integer idHorario;
	private Dia dias;
	private String descricao;
	private Set<HorarioPessoa> horarioPessoases = new HashSet<HorarioPessoa>(0);
	private Set<Turma> turmas = new HashSet<Turma>(0);

	public Horario() {
	}

	public Horario(Dia dias, String descricao, Set<HorarioPessoa> horarioPessoases, Set<Turma> turmas) {
		this.dias = dias;
		this.descricao = descricao;
		this.horarioPessoases = horarioPessoases;
		this.turmas = turmas;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHorario", unique = true, nullable = false)
	public Integer getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDia")
	public Dia getDia() {
		return this.dias;
	}

	public void setDia(Dia dias) {
		this.dias = dias;
	}

	@Column(name = "descricao", length = 15)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "horarios")
	public Set<HorarioPessoa> getHorarioPessoaes() {
		return this.horarioPessoases;
	}

	public void setHorarioPessoaes(Set<HorarioPessoa> horarioPessoases) {
		this.horarioPessoases = horarioPessoases;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "horario_turmas", catalog = "dbinterdisciplinar", joinColumns = {
			@JoinColumn(name = "idHorario", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "idTurma", nullable = false, updatable = false) })
	public Set<Turma> getTurmaes() {
		return this.turmas;
	}

	public void setTurmaes(Set<Turma> turmas) {
		this.turmas = turmas;
	}
}
