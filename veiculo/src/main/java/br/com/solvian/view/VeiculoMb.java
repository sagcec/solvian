package br.com.solvian.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import br.com.solvian.control.converter.JSonConveter;
import br.com.solvian.control.enumeration.TipoCombustivelEn;
import br.com.solvian.control.enumeration.TipoPinturaEn;
import br.com.solvian.control.enumeration.TipoVeiculoEn;
import br.com.solvian.model.business.VeiculoBusiness;
import br.com.solvian.model.entity.VeiculoEntity;

@ManagedBean(name = "veiculoMb")
@ViewScoped
public class VeiculoMb extends AbstractMb<VeiculoEntity> implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private VeiculoEntity entity;

	public String getClasse() {
		return "Ve’culo";
	}

	@ManagedProperty(name = "veiculoBusiness", value = "#{veiculoBusinessImpl}")
	private VeiculoBusiness<VeiculoEntity> veiculoBusiness;

	private List<VeiculoEntity> list;

	public VeiculoMb() {
		// TODO Auto-generated constructor stub
		super();

		if (this.entity == null) {
			this.entity = new VeiculoEntity();
		}

		this.list = new ArrayList<VeiculoEntity>();
	}

	@PostConstruct
	public void pC() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public VeiculoEntity getEntity() {
		return entity;
	}

	public void setEntity(VeiculoEntity entity) {
		this.entity = entity;
	}

	public VeiculoBusiness<VeiculoEntity> getVeiculoBusiness() {
		return veiculoBusiness;
	}

	public void setVeiculoBusiness(
			VeiculoBusiness<VeiculoEntity> veiculoBusiness) {
		this.veiculoBusiness = veiculoBusiness;
	}

	public List<VeiculoEntity> getList() {
		return list;
	}

	public void setList(List<VeiculoEntity> list) {
		this.list = list;
	}

	@Override
	public List<VeiculoEntity> autocomplete(String suggest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String clear() {
		// TODO Auto-generated method stub
		try {
			this.entity = new VeiculoEntity();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		try {
			// System.out.println(this.system.getSystemName());
			this.veiculoBusiness.delete(this.entity);

			clear();
			search();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public String enabled() {
		// TODO Auto-generated method stub
		try {
			this.veiculoBusiness.enabled(this.entity);

			clear();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String insert() {
		// TODO Auto-generated method stub
		try {
			this.veiculoBusiness.insert(this.entity);

			clear();
			search();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public String newObject() {
		return super.newObject(this.entity);
	}

	@Override
	public String search() {
		try {
			this.list = this.veiculoBusiness.search(this.entity);

			return null;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		try {
			this.veiculoBusiness.update(this.entity);

			clear();
			search();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 
	 */

	public List<SelectItem> getSiTipoCombustivel() {
		try {
			List<SelectItem> siList = new ArrayList<SelectItem>();

			// SearchTypeEn

			for (TipoCombustivelEn en : TipoCombustivelEn.values()) {
				siList.add(new SelectItem(en));
			}

			return siList;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	public List<SelectItem> getSiTipoPintura() {
		try {
			List<SelectItem> siList = new ArrayList<SelectItem>();

			// SearchTypeEn

			for (TipoPinturaEn en : TipoPinturaEn.values()) {
				siList.add(new SelectItem(en));
			}

			return siList;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	public List<SelectItem> getSiTipoVeiculo() {
		try {
			List<SelectItem> siList = new ArrayList<SelectItem>();

			// SearchTypeEn

			for (TipoVeiculoEn en : TipoVeiculoEn.values()) {
				siList.add(new SelectItem(en));
			}

			return siList;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	private String json = "";

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String converterjson() {
		try {
			List<VeiculoEntity> list = this.veiculoBusiness.search(this.entity);

			System.out.println(JSonConveter.getJSON(list));

			this.json = JSonConveter.getJSON(list).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}