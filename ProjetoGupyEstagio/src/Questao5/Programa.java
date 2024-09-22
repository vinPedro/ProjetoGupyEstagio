package Questao5;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Digite string: ");
		String entrada = inputScanner.nextLine();
		
		System.out.println(FormatadorString.inverterString(entrada));
		
		inputScanner.close();
	}
}
