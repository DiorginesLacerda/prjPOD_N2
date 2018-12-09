package br.edu.qi.planetoffice.model;

import java.sql.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "turmas")
public class Turma {

	private Integer idTurma;
	private Curso curso;
	private Integer capacidade;
	private Date dataFim;
	private Date dataInicio;
	private String tema;
	private Set<Produto> produtos = new HashSet<Produto>(0);
	private Set<Horario> horarios = new HashSet<Horario>(0);
	private Set<Aluno> alunos = new HashSet<Aluno>(0);

	public Turma() {
	}

	public Turma(Curso curso, Integer capacidade, Date dataFim, Date dataInicio, String tema, Set<Produto> produtos,
			Set<Horario> horarios, Set<Aluno> alunos) {
		this.curso = curso;
		this.capacidade = capacidade;
		this.dataFim = dataFim;
		this.dataInicio = dataInicio;
		this.tema = tema;
		this.produtos = produtos;
		this.horarios = horarios;
		this.alunos = alunos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "idTurma", unique = true, nullable = false)
	public Integer getIdTurma() {
		return this.idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCurso")
	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Column(name = "capacidade")
	public Integer getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_fim", length = 19)
	public Date getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_inicio", length = 19)
	public Date getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Column(name = "tema", length = 70)
	public String getTema() {
		return this.tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "prod_turmas", catalog = "dbinterdisciplinar", joinColumns = {
			@JoinColumn(name = "idTurma", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "idItem", nullable = false, updatable = false) })
	public Set<Produto> getProdutoes() {
		return this.produtos;
	}

	public void setProdutoes(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "turmases")
	public Set<Horario> getHorarioes() {
		return this.horarios;
	}

	public void setHorarioes(Set<Horario> horarios) {
		this.horarios = horarios;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "matricula", catalog = "dbinterdisciplinar", joinColumns = {
			@JoinColumn(name = "idTurma", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "idPessoa", nullable = false, updatable = false) })
	public Set<Aluno> getAlunoes() {
		return this.alunos;
	}

	public void setAlunoes(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

}
