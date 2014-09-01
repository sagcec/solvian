package br.com.solvian.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

/**
 * 
 * @author Gutemberg A Da Silva
 * 
 */

public class AbstractDAOImpl<T> implements AbstractDAO<T> {

	private final static String UNIT_NAME = "pu";

	@PersistenceContext(unitName = UNIT_NAME)
	private EntityManager entityManager;

	protected String nomeEntidade;

	public AbstractDAOImpl(String nomeEntidade) {
		this.nomeEntidade = nomeEntidade;
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void delete(T entity, Long id) throws Exception {
		this.getEntityManager().remove(
				this.getEntityManager().getReference(entity.getClass(), id));
	}

	@Override
	public void insert(T entity) throws Exception {
		this.getEntityManager().persist(entity);
	}

	@Override
	public void update(T entity) throws Exception {
		this.getEntityManager().merge(entity);
	}

	@Override
	public void flushAndClear() throws Exception {
		Session sessao = (Session) this.getEntityManager().getDelegate();

		if (sessao.isDirty()) {
			sessao.flush();
			sessao.clear();
		}
	}

}