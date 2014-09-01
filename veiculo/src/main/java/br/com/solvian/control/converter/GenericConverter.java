package br.com.solvian.control.converter;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * 
 * @author Gutemberg A Da Silva
 * 
 */

@FacesConverter("genericConverter")
public class GenericConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent componente,
			String valor) {
		if (valor != null) {
			return this.getAttributesFrom(componente).get(valor);
		}

		return null;
	}

	public String getAsString(FacesContext context, UIComponent componente,
			Object valor) {
		if (valor != null && !"".equals(valor)) {
			String chavePk = null;
			this.addAttribute(componente, valor);
			// chavePk = ((List) valor).get(0).toString();
			chavePk = valor.toString();

			if (chavePk != null) {
				return String.valueOf(chavePk);
			}
		}

		return (String) valor;
	}

	protected void addAttribute(UIComponent component, Object obj) {
		// String key = ((List) obj).get(0).toString();
		String key = obj.toString();
		this.getAttributesFrom(component).put(key, obj);
	}

	protected Map<String, Object> getAttributesFrom(UIComponent component) {
		return component.getAttributes();
	}

}