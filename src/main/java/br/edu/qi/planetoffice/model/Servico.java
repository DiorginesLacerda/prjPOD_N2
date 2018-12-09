package br.edu.qi.planetoffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity(name = "servicos")
public class Servico {

	private Integer idItem;
	private Item item;
	private String especificacao;
	private Integer duracao;

	public Servico() {
   }

	public Servico(Item item) {
       this.item = item;
   }

	public Servico(Item item, String especificacao, Integer duracao) {
      this.item = item;
      this.especificacao = especificacao;
      this.duracao = duracao;
   }

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "item"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "idItem", unique = true, nullable = false)
	public Integer getIdItem() {
		return this.idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Column(name = "especificacao", length = 70)
	public String getEspecificacao() {
		return this.especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	@Column(name = "duracao")
	public Integer getDuracao() {
		return this.duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

}
