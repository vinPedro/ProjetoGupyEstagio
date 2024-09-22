package Questao2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int entrada = inputScanner.nextInt();
		
		System.out.println(QuestãoFibonacci.buscarElemento(entrada));
		
		inputScanner.close();

	}

}
