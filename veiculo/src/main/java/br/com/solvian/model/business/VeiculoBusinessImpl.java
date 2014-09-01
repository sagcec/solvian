package br.com.solvian.model.business;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.solvian.model.dao.VeiculoDAO;
import br.com.solvian.model.entity.VeiculoEntity;

/**
 * 
 * @author Gutemberg A Da Silva
 * 
 */

@Service("veiculoBusinessImpl")
@Transactional(readOnly = true)
public class VeiculoBusinessImpl implements Serializable,
		VeiculoBusiness<VeiculoEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	private VeiculoDAO<VeiculoEntity> categoriaDAO;

	public void setCategoriaDAO(VeiculoDAO<VeiculoEntity> categoriaDAO) {
		this.categoriaDAO = categoriaDAO;
	}

	@Transactional(readOnly = true)
	@Override
	public List<VeiculoEntity> autocomplete(String suggest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void delete(VeiculoEntity entity) throws Exception {
		// TODO Auto-generated method stub
		this.categoriaDAO.delete(entity, entity.getId());
	}

	@Transactional
	@Override
	public void enabled(VeiculoEntity entity) throws Exception {
		// TODO Auto-generated method stub
		if (entity.getAtivo().equals(Boolean.TRUE)) {
			entity.setAtivo(Boolean.FALSE);
		} else {
			entity.setAtivo(Boolean.TRUE);
		}

		this.categoriaDAO.update(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public List<VeiculoEntity> search(VeiculoEntity entity) throws Exception {
		List<VeiculoEntity> auxLista = this.categoriaDAO.search(entity);

		return auxLista;
	}

	@Transactional
	@Override
	public void insert(VeiculoEntity entity) throws Exception {
		// TODO Auto-generated method stub
		this.categoriaDAO.insert(entity);
	}

	@Transactional
	@Override
	public void update(VeiculoEntity entity) throws Exception {
		// TODO Auto-generated method stub
		this.categoriaDAO.update(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public List<VeiculoEntity> list() throws Exception {
		List<VeiculoEntity> auxLista = this.categoriaDAO.list();

		return auxLista;
	}

}