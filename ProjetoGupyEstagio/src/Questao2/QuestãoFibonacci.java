package Questao2;

public class QuestãoFibonacci {
	
	public static boolean buscarElemento(int entrada) {
		int elemento1 = 0;
		int elemento2 = 1;
		int elementoFibonacci = 0;
		
		while(entrada>=elementoFibonacci) {
			if (entrada==elementoFibonacci) {
				return true;
			}
			elementoFibonacci = elemento1 + elemento2;
			elemento1= elemento2;
			elemento2 = elementoFibonacci;
			
		}
		
		return false;
	}

}
