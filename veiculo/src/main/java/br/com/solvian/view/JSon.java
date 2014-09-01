package br.com.solvian.view;

import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

import br.com.solvian.model.entity.VeiculoEntity;

public class JSon {

	public static void main(String[] args) {
		try {
			VeiculoEntity pessoa = new VeiculoEntity();

			pessoa.setChassi("Fernanda");
			pessoa.setAnoFabricacao("123456789");

			JSONObject jsonObj = new JSONObject();

			jsonObj.put("nome", pessoa.getChassi());
			jsonObj.put("telefone", pessoa.getAnoFabricacao());

			System.out.println(jsonObj);

		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
