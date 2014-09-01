package br.com.solvian.model.dao;

import java.util.List;

public interface VeiculoDAO<CategoriaEntity> extends
		AbstractDAO<CategoriaEntity> {

	public List<CategoriaEntity> search(CategoriaEntity entity)
			throws Exception;

	public List<CategoriaEntity> list() throws Exception;

}