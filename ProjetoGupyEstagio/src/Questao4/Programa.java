package Questao4;

public class Programa {

	public static void main(String[] args) {
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		
		double faturamentoMensal = sp + rj + mg + es + outros;
		
		System.out.println(faturamentoMensal);
		System.out.println("Percentual de faturamento de SP: " + Calculadora.faturamento(faturamentoMensal, sp) + "%");
		System.out.println("Percentual de faturamento de RJ: " +Calculadora.faturamento(faturamentoMensal, rj)+ "%");
		System.out.println("Percentual de faturamento de MG: " +Calculadora.faturamento(faturamentoMensal, mg)+ "%");
		System.out.println("Percentual de faturamento de ES: " +Calculadora.faturamento(faturamentoMensal, es)+ "%");
		System.out.println("Percentual de faturamento de Outros: " +Calculadora.faturamento(faturamentoMensal, outros)+ "%");	

	}

}
