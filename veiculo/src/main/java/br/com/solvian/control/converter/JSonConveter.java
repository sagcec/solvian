package br.com.solvian.control.converter;

import java.util.List;

import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

import br.com.solvian.model.entity.VeiculoEntity;

public class JSonConveter {

	public static synchronized JSONArray getJSON(List<VeiculoEntity> auxLista)
			throws Exception {
		JSONArray jsonArray = new JSONArray();

		for (VeiculoEntity ent : auxLista) {
			JSONObject jsonObj = new JSONObject();

			jsonObj.put("chassi", ent.getChassi());
			jsonObj.put("cor", ent.getCor());
			jsonObj.put("potenciaMotor", ent.getPotenciaMotor());
			jsonObj.put("cilindradas", ent.getCilindradas());
			jsonObj.put("pesoLiquido", ent.getPesoLiquido());
			jsonObj.put("pesoBruto", ent.getPesoBruto());
			jsonObj.put("numeroSerie", ent.getNumeroSerie());
			jsonObj.put("tipoCombustivel", ent.getTipoCombustivel());
			jsonObj.put("numeroMotor", ent.getNumeroMotor());
			jsonObj.put("capacidadeMaximaTracao",
					ent.getCapacidadeMaximaTracao());
			jsonObj.put("distanciaEixos", ent.getDistanciaEixos());
			jsonObj.put("anoModelo", ent.getAnoModelo());
			jsonObj.put("anoFabricacao", ent.getAnoFabricacao());
			jsonObj.put("tipoPintura", ent.getTipoPintura());
			jsonObj.put("tipoVeiculo", ent.getTipoVeiculo());
			jsonObj.put("especieVeiculo", ent.getEspecieVeiculo());
			jsonObj.put("condicaoVin", ent.getCondicaoVin());
			jsonObj.put("condicaoVeiculo", ent.getCondicaoVeiculo());
			jsonObj.put("codigoMarcaModelo", ent.getCodigoMarcaModelo());
			jsonObj.put("lotacao", ent.getLotacao());

			jsonArray.put(jsonObj);
		}

		return jsonArray;
	}

}