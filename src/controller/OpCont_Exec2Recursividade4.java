package controller;

public class OpCont_Exec2Recursividade4 {
	
	public static String fInvertido(String str) {
	    // Caso a String tenha apenas um caractere
	    if (str.length() <= 1) {
	        return str;
	    }
	    // Chamada da função recursiva para inverter a primeira letra com a última
	    else {
	        char primeiro = str.charAt(0);
	        char ultimo = str.charAt(str.length()-1);
	        String subcadeia = str.substring(1, str.length()-1);
	        return ultimo + fInvertido(subcadeia) + primeiro;
	    }
	}
}
