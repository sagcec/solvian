package br.com.solvian.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.solvian.model.entity.VeiculoEntity;

/**
 * 
 * @author Gutemberg A Da Silva
 * 
 */

@Repository("veiculoDAOImpl")
public class VeiculoDAOImpl extends AbstractDAOImpl<VeiculoEntity> implements
		Serializable, VeiculoDAO<VeiculoEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VeiculoDAOImpl() {
		super("VeiculoEntity");
	}

	@Override
	public List<VeiculoEntity> search(VeiculoEntity entity) throws Exception {
		String sql = "FROM " + super.nomeEntidade + " ent";
		sql = sql.concat(" ORDER BY ent.id");

		Query query = super.getEntityManager().createQuery(sql);

		List<VeiculoEntity> auxLista = query.getResultList();

		return auxLista;
	}

	@Override
	public List<VeiculoEntity> list() throws Exception {
		String sql = "FROM " + super.nomeEntidade + " ent";
		sql = sql.concat(" ORDER BY ent.id");

		Query query = super.getEntityManager().createQuery(sql);

		List<VeiculoEntity> auxLista = query.getResultList();

		return auxLista;
	}

}