package br.edu.qi.planetoffice.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity(name = "funcionarios")
public class Funcionario {
	private Integer idPessoa;
	private Pessoa pessoa;
	private Date dtadmissao;
	private String cargo;

	public Funcionario() {
	}

	public Funcionario(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Funcionario(Pessoa pessoa, Date dtadmissao, String cargo) {
		this.pessoa = pessoa;
		this.dtadmissao = dtadmissao;
		this.cargo = cargo;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtadmissao", length = 19)
	public Date getDtadmissao() {
		return this.dtadmissao;
	}

	public void setDtadmissao(Date dtadmissao) {
		this.dtadmissao = dtadmissao;
	}

	@Column(name = "cargo", length = 15)
	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
