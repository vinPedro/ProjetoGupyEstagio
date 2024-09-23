package Questao2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
			
		try {
			System.out.println("Digite um n�mero: ");
			int entrada = inputScanner.nextInt();
			System.out.println(Quest�oFibonacci.buscarElemento(entrada));
		} catch (InputMismatchException e) {
			System.out.println("Digite um n�mero v�lido!");
		}
		
		
		
		
		inputScanner.close();

	}

}
