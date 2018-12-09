package br.edu.qi.planetoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "usuarios")
public class Usuario {

	private Integer idUsuario;
	private Pessoa pessoa;
	private String login;
	private String senha;

	public Usuario() {
   }

	public Usuario(Pessoa pessoa, String login, String senha) {
      this.pessoa = pessoa;
      this.login = login;
      this.senha = senha;
   }

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idUsuario", unique = true, nullable = false)
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "login", length = 15)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "senha", length = 15)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
