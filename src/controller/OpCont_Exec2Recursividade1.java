package controller;

public class OpCont_Exec2Recursividade1 {
	
	public static int fFatorial(int num) {
		// Se o número for 0 ou 1, a base é 1, então retorna 1.
		if(num == 0 || num == 1) {
			return 1;
		} 
		// Caso não seja 1 ou 0, é chamada a recursiva para fazer multiplicação
		else {
			return num * fFatorial(num -1);
		}
		
	}
}
