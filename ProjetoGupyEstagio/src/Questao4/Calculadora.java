package Questao4;

public class Calculadora {

	public static String faturamento(double faturamentoTotal, double faturamentoFilial) {
		return String.format("%.2f", (faturamentoFilial * 100)/faturamentoTotal) ;
	}
}
