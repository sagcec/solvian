package br.com.solvian.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 
 * @author Gutemberg A Da Silva
 * 
 */

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract ID getId();

	public abstract void setId(ID id);

	@Column(name = "sn_ativo", nullable = false)
	protected Boolean ativo = Boolean.TRUE;

	// @Version
	// @Column(name = "nr_versao")
	// protected Integer versao;

	// public Integer getVersao() {
	// return versao;
	// }

	// public void setVersao(Integer versao) {
	// this.versao = versao;
	// }

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = (ativo == null ? Boolean.TRUE : ativo);
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (this.getId() != null ? this.getId().hashCode() : 0);

		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof AbstractEntity)) {
			return false;
		}

		AbstractEntity<?> ent = (AbstractEntity<?>) object;

		if ((this.getId() == null && ent.getId() != null)
				|| (this.getId() != null && !this.getId().equals(ent.getId()))) {
			return false;
		}

		return true;
	}

	public abstract String toString();

}