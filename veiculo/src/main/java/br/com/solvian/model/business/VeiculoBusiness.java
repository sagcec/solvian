package br.com.solvian.model.business;

import java.util.List;

public interface VeiculoBusiness<T> extends AbstractBusiness<T> {

	public void enabled(T entity) throws Exception;

	public List<T> search(T entity) throws Exception;

	public List<T> list() throws Exception;

}