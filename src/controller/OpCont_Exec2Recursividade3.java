package controller;

public class OpCont_Exec2Recursividade3 {
	
	public static int fDigitos(int num) {
		
		// Se o número tiver apenas um digito
		if(num < 10 && num > -10) {
			return 1;
		}
		// Chamada da função recursiva para dividir por 10 e somar com 1
		else {
			return 1 + fDigitos(num / 10);
		}
	}
}
