package br.edu.qi.planetoffice.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "pessoas")
public class Pessoa {
	private Integer idPessoa;
	private Etnia etnia;
	private Religiao religiao;
	private Sexo sexo;
	private Integer cep;
	private String logradouro;
	private String nomeSocial;
	private String nome;
	private Funcionario funcionario;
	private Professor professor;
	private Set<Telefone> telefones = new HashSet<Telefone>(0);
	private Aluno aluno;
	private Set<Deficiencia> deficiencias = new HashSet<Deficiencia>(0);
	private Set<HorarioPessoa> horarioPessoa = new HashSet<HorarioPessoa>(0);
	private Set<Filiacao> filiacoes = new HashSet<Filiacao>(0);
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);
	private Set<Venda> vendas = new HashSet<Venda>(0);

	public Pessoa() {
	}

	public Pessoa(Etnia etnia, Religiao religiao, Sexo sexo, Integer cep, String logradouro, String nomeSocial,
			String nome, Funcionario funcionario, Professor professor, Set<Telefone> telefones, Aluno aluno,
			Set<Deficiencia> deficiencias, Set<HorarioPessoa> horarioPessoa, Set<Filiacao> filiacoes,
			Set<Usuario> usuarios, Set<Venda> vendas) {
		this.etnia = etnia;
		this.religiao = religiao;
		this.sexo = sexo;
		this.cep = cep;
		this.logradouro = logradouro;
		this.nomeSocial = nomeSocial;
		this.nome = nome;
		this.funcionario = funcionario;
		this.professor = professor;
		this.telefones = telefones;
		this.aluno = aluno;
		this.deficiencias = deficiencias;
		this.horarioPessoa = horarioPessoa;
		this.filiacoes = filiacoes;
		this.usuarios = usuarios;
		this.vendas = vendas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idPessoa", unique = true, nullable = false)
	public Integer getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEtnia")
	public Etnia getEtnia() {
		return this.etnia;
	}

	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idReligiao")
	public Religiao getReligiao() {
		return this.religiao;
	}

	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSexo")
	public Sexo getSexo() {
		return this.sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Column(name = "cep")
	public Integer getCep() {
		return this.cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@Column(name = "logradouro", length = 70)
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Column(name = "nome_social", length = 50)
	public String getNomeSocial() {
		return this.nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	@Column(name = "nome", length = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoas")
	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoas")
	public Professor getProfessor() {
		return this.professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoas")
	public Set<Telefone> getTelefonees() {
		return this.telefones;
	}

	public void setTelefonees(Set<Telefone> telefones) {
		this.telefones = telefones;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoas")
	public Aluno getAluno() {
		return this.aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "defic_pessoas", catalog = "dbinterdisciplinar", joinColumns = {
			@JoinColumn(name = "idPessoa", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "idDeficiencia", nullable = false, updatable = false) })
	public Set<Deficiencia> getDeficienciaes() {
		return this.deficiencias;
	}

	public void setDeficienciaes(Set<Deficiencia> deficiencias) {
		this.deficiencias = deficiencias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoas")
	public Set<HorarioPessoa> getHorarioPessoaes() {
		return this.horarioPessoa;
	}

	public void setHorarioPessoaes(Set<HorarioPessoa> horarioPessoa) {
		this.horarioPessoa = horarioPessoa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoas")
	public Set<Filiacao> getFiliacaos() {
		return this.filiacoes;
	}

	public void setFiliacaos(Set<Filiacao> filiacoes) {
		this.filiacoes = filiacoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoas")
	public Set<Usuario> getUsuarioes() {
		return this.usuarios;
	}

	public void setUsuarioes(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoas")
	public Set<Venda> getVendaes() {
		return this.vendas;
	}

	public void setVendaes(Set<Venda> vendas) {
		this.vendas = vendas;
	}
}
