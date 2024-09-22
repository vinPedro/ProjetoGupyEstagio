package Questao3;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class Programa {

	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser(); 
		
		try(FileReader reader = new FileReader("dados.json")) {
			Object object = jsonParser.parse(reader);
			JSONArray faturamentosArray = (JSONArray) object;
			
			Calculadora.calcularMenorFaturamento(faturamentosArray);
			Calculadora.calcularMaiorFaturamento(faturamentosArray);
			Calculadora.calcularMenorFaturamentoSemZero(faturamentosArray);
			System.out.println("Média do faturamento mensal: " + Calculadora.calcularMediaFaturamento(faturamentosArray) + "\n");
			Calculadora.calcularMaiorFaturamentoMediano(faturamentosArray);
			
		} catch (Exception e) {
			System.out.println("Erro!");
		}
	}
}
