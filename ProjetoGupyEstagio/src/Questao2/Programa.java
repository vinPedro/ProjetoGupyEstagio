package Questao2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int entrada = inputScanner.nextInt();
		
		System.out.println(Quest�oFibonacci.buscarElemento(entrada));
		
		inputScanner.close();

	}

}
