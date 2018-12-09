package br.edu.qi.planetoffice.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemVendaId implements java.io.Serializable {

	private int idItem;
	private int idVenda;

	public ItemVendaId() {
	}

	public ItemVendaId(int idItem, int idVenda) {
		this.idItem = idItem;
		this.idVenda = idVenda;
	}

	@Column(name = "idItem", nullable = false)
	public int getIdItem() {
		return this.idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	@Column(name = "idVenda", nullable = false)
	public int getIdVenda() {
		return this.idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ItemVendaId))
			return false;
		ItemVendaId castOther = (ItemVendaId) other;

		return (this.getIdItem() == castOther.getIdItem()) && (this.getIdVenda() == castOther.getIdVenda());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdItem();
		result = 37 * result + this.getIdVenda();
		return result;
	}
}