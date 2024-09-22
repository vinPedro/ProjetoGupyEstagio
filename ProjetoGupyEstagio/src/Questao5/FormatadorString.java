package Questao5;

public class FormatadorString {
	
	public static String inverterString(String string) {
		String[] vetorStrings =  string.split("");
		String auxString = null;
		
		for(int i = 0; i<vetorStrings.length/2; i++) {
			auxString = vetorStrings[i];
			vetorStrings[i] = vetorStrings[vetorStrings.length-i-1];
			vetorStrings[vetorStrings.length-i-1] = auxString;
		}
		
		return String.join("", vetorStrings);
	}

}
