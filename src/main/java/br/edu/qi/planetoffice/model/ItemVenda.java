package br.edu.qi.planetoffice.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name = "item_venda")
public class ItemVenda {

	private ItemVendaId id;
	private Item item;
	private Venda venda;
	private Integer quantidade;
	private Float valorUnitario;

	public ItemVenda() {
	}

	public ItemVenda(ItemVendaId id, Item item, Venda venda) {
		this.id = id;
		this.item = item;
		this.venda = venda;
	}

	public ItemVenda(ItemVendaId id, Item item, Venda venda, Integer quantidade, Float valorUnitario) {
		this.id = id;
		this.item = item;
		this.venda = venda;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idItem", column = @Column(name = "idItem", nullable = false)),
			@AttributeOverride(name = "idVenda", column = @Column(name = "idVenda", nullable = false)) })
	public ItemVendaId getId() {
		return this.id;
	}

	public void setId(ItemVendaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idItem", nullable = false, insertable = false, updatable = false)
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVenda", nullable = false, insertable = false, updatable = false)
	public Venda getVenda() {
		return this.venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	@Column(name = "quantidade")
	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "valor_unitario", precision = 12, scale = 0)
	public Float getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
