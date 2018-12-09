package br.edu.qi.planetoffice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity(name = "produtos")
public class Produto {

	private Integer idItem;
	private Item item;
	private Integer quantidade;
	private String local;
	private Set<Turma> turmas = new HashSet<Turma>(0);

	public Produto() {
	}

	public Produto(Item item) {
		this.item = item;
	}

	public Produto(Item item, Integer quantidade, String local, Set<Turma> turmas) {
		this.item = item;
		this.quantidade = quantidade;
		this.local = local;
		this.turmas = turmas;
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

	@Column(name = "quantidade")
	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "local", length = 15)
	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "produtoses")
	public Set<Turma> getTurmaes() {
		return this.turmas;
	}

	public void setTurmaes(Set<Turma> turmas) {
		this.turmas = turmas;
	}

}
