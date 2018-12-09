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
import javax.persistence.OneToOne;

@Entity(name = "item")
public class Item {

	private Integer idItem;
	private String descricao;
	private Float valor;
	private Set<ItemVenda> itemVendas = new HashSet<ItemVenda>(0);
	private Produto produto;
	private Servico servico;

	public Item() {
	}

	public Item(String descricao, Float valor, Set<ItemVenda> itemVendas, Produto produto, Servico servico) {
		this.descricao = descricao;
		this.valor = valor;
		this.itemVendas = itemVendas;
		this.produto = produto;
		this.servico = servico;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idItem", unique = true, nullable = false)
	public Integer getIdItem() {
		return this.idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	@Column(name = "descricao", length = 70)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "valor", precision = 12, scale = 0)
	public Float getValor() {
		return this.valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	public Set<ItemVenda> getItemVendas() {
		return this.itemVendas;
	}

	public void setItemVendas(Set<ItemVenda> itemVendas) {
		this.itemVendas = itemVendas;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "item")
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "item")
	public Servico getServico() {
		return this.servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

}
