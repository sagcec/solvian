package br.com.solvian.view;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;

import br.com.solvian.control.enumeration.SearchTypeEn;

/**
 * 
 * @author Gutemberg Albuquerque Da Silva
 * 
 */

public abstract class AbstractMb<T> {

	protected FacesContext facesContext = null;
	protected HttpSession httpSession = null;

	// private AbstractTemplate template;

	// public AbstractTemplate getTemplate() {
	// return template;
	// }

	protected static Logger logger;

	public AbstractMb() {
		this.facesContext = FacesContext.getCurrentInstance();
		this.httpSession = (HttpSession) this.facesContext.getExternalContext()
				.getSession(true);

		// this.template = template;
	}

	static {
		// logger = Logger.getLogger("beanLogger");
	}

	public abstract List<T> autocomplete(String suggest);

	public abstract String clear();

	public abstract String delete();

	public abstract String insert();

	public abstract String search();

	public abstract String update();

	public String newObject(Object obj) {
		try {
			obj = obj.getClass().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	};

	public List<SelectItem> getSiSearchType() {
		try {
			List<SelectItem> siList = new ArrayList<SelectItem>();

			// SearchTypeEn

			for (SearchTypeEn en : SearchTypeEn.values()) {
				siList.add(new SelectItem(en.toString(), en.name()));
			}

			return siList;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

}