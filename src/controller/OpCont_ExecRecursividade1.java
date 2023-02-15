package controller;

public class OpCont_ExecRecursividade1 {
	
	public static int multRecursiva(int a, int b ) {
		if(b == 0) {
			return 0;
		}
		
		return a + multRecursiva(a, b - 1);
	}
}
