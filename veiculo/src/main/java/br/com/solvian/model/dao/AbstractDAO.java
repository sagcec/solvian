package br.com.solvian.model.dao;

import javax.persistence.EntityManager;

/**
 * 
 * @author Gutemberg A Da Silva
 * 
 */

public interface AbstractDAO<T> {

	public EntityManager getEntityManager();

	public void setEntityManager(EntityManager entityManager);

	public void delete(T entity, Long id) throws Exception;

	public void insert(T entity) throws Exception;

	public void update(T entity) throws Exception;

	public void flushAndClear() throws Exception;

}