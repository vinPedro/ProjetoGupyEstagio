package Questao3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Calculadora {

	public static void calcularMenorFaturamento(JSONArray faturamentos) {
		JSONObject objetoJson = (JSONObject) faturamentos.get(0);
		int dia = 1;
		double valor =Double.parseDouble(objetoJson.get("valor").toString());
		
		for (int i = 1; i < faturamentos.size(); i++) {
			objetoJson = (JSONObject) faturamentos.get(i);
			
			if(valor>Double.parseDouble(objetoJson.get("valor").toString())) {
				dia = Integer.parseInt(objetoJson.get("dia").toString());
				valor =Double.parseDouble(objetoJson.get("valor").toString());
			}
		}
		
		System.out.println("Menor faturamento mensal dia: " + dia + " - Faturamento: " + valor + "\n");
		
	}
	
	public static void calcularMenorFaturamentoSemZero(JSONArray faturamentos) {
		JSONObject objetoJson = (JSONObject) faturamentos.get(0);
		int dia = 1;
		double valor = Double.parseDouble(objetoJson.get("valor").toString());
		
		for (int i = 1; i < faturamentos.size(); i++) {
			objetoJson = (JSONObject) faturamentos.get(i);
			
			if(valor>Double.parseDouble(objetoJson.get("valor").toString()) && Double.parseDouble(objetoJson.get("valor").toString())>0) {
				dia = Integer.parseInt(objetoJson.get("dia").toString());
				valor =Double.parseDouble(objetoJson.get("valor").toString());
			}
		}
		
		System.out.println("Menor faturamento mensal dia(sem contar com valores = 0): " + dia + " - Faturamento: " + valor+ "\n");
		
	}
	
	public static void calcularMaiorFaturamento(JSONArray faturamentos) {
		JSONObject objetoJson = (JSONObject) faturamentos.get(0);
		int dia = 1;
		double valor =Double.parseDouble(objetoJson.get("valor").toString());
		
		for (int i = 1; i < faturamentos.size(); i++) {
			objetoJson = (JSONObject) faturamentos.get(i);
			
			if(valor<Double.parseDouble(objetoJson.get("valor").toString())) {
				dia = Integer.parseInt(objetoJson.get("dia").toString());
				valor =Double.parseDouble(objetoJson.get("valor").toString());
			}
		}
		
		System.out.println("Maior faturamento mensal dia: " + dia + " - Faturamento: " + valor + "\n");
		
	}
	
	public static double calcularMediaFaturamento(JSONArray faturamentos) {
		JSONObject objetoJson = (JSONObject) faturamentos.get(0);
		int dias = 0;
		double valor;
		double soma = 0;
		
		
		for (int i = 0 ; i < faturamentos.size(); i++) {
			objetoJson = (JSONObject) faturamentos.get(i);
			valor = Double.parseDouble(objetoJson.get("valor").toString());
			
			
			if(valor> 0){
				soma += valor;
				dias++;
			}
		}
		
		return soma/dias;
		
	}
	
	public static void calcularMaiorFaturamentoMediano(JSONArray faturamentos) {
		JSONObject objetoJson = (JSONObject) faturamentos.get(0);
		int dia = 0;
		double valor = 0;
		double media = calcularMediaFaturamento(faturamentos);
		
		System.out.println("Dias acima da média mensal - " + "\n");
		
		for (int i = 0; i < faturamentos.size(); i++) {
			objetoJson = (JSONObject) faturamentos.get(i);
			
			if(media<Double.parseDouble(objetoJson.get("valor").toString())) {
				dia = Integer.parseInt(objetoJson.get("dia").toString());
				valor =Double.parseDouble(objetoJson.get("valor").toString());
				System.out.println("Dia: " + dia + " - Faturamento: " + valor);
			}
		}
		
		
		
	}
	
	
	
	
}
