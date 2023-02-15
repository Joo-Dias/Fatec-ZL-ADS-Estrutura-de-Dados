package controller;

public class OpCont_ExecRecursividade2 {
	
	public static int divRecursiva(int dividendo, int divisor) {
		
		if(dividendo < divisor) {
			return dividendo;
		}
		
		return divRecursiva(dividendo - divisor, divisor);
	}
}
