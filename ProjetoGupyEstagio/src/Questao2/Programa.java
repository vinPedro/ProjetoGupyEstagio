package Questao2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
			
		try {
			System.out.println("Digite um número: ");
			int entrada = inputScanner.nextInt();
			System.out.println(QuestãoFibonacci.buscarElemento(entrada));
		} catch (InputMismatchException e) {
			System.out.println("Digite um número válido!");
		}
		
		
		
		
		inputScanner.close();

	}

}
