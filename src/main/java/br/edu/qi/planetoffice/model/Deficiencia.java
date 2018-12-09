package br.edu.qi.planetoffice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="deficiencias")
public class Deficiencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDeficiencia;
	private String descricao;
	private String grau;

	public Deficiencia() {
		super();
	}

	public Deficiencia(int idDeficiencia, String descricao, String grau) {
		super();
		this.idDeficiencia = idDeficiencia;
		this.descricao = descricao;
		this.grau = grau;
	}

	public int getCodDeficiencia() {
		return idDeficiencia;
	}

	public void setCodDeficiencia(int codDeficiencia) {
		this.idDeficiencia = codDeficiencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}
}
