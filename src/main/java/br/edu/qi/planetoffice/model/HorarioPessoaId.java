package br.edu.qi.planetoffice.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HorarioPessoaId implements java.io.Serializable {

	private int idPessoa;
	private int idHorario;

	public HorarioPessoaId() {
	}

	public HorarioPessoaId(int idPessoa, int idHorario) {
		this.idPessoa = idPessoa;
		this.idHorario = idHorario;
	}

	@Column(name = "idPessoa", nullable = false)
	public int getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	@Column(name = "idHorario", nullable = false)
	public int getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HorarioPessoaId))
			return false;
		HorarioPessoaId castOther = (HorarioPessoaId) other;

		return (this.getIdPessoa() == castOther.getIdPessoa()) && (this.getIdHorario() == castOther.getIdHorario());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPessoa();
		result = 37 * result + this.getIdHorario();
		return result;
	}

}
