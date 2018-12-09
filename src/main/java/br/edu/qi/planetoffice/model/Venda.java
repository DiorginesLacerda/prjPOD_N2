package br.edu.qi.planetoffice.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "vendas")
public class Venda {

	private Integer idVenda;
	private Pessoa pessoa;
	private Date data;
	private Float valorTotal;
	private Set<ItemVenda> itemVenda = new HashSet<ItemVenda>(0);

	public Venda() {
	}

	public Venda(Pessoa pessoa, Date data, Float valorTotal, Set<ItemVenda> itemVenda) {
		this.pessoa = pessoa;
		this.data = data;
		this.valorTotal = valorTotal;
		this.itemVenda = itemVenda;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idVenda", unique = true, nullable = false)
	public Integer getIdVenda() {
		return this.idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa")
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data", length = 19)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "valor_total", precision = 12, scale = 0)
	public Float getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vendas")
	public Set<ItemVenda> getItemVenda() {
		return this.itemVenda;
	}

	public void setItemVenda(Set<ItemVenda> itemVenda) {
		this.itemVenda = itemVenda;
	}

}
