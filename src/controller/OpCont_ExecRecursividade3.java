package controller;

public class OpCont_ExecRecursividade3 {
	
	public static int vetorPares(int tam, int vetor[]) {
		int qntdPares = 0;
		for(int i = 0; i < tam; i++) {
			if(vetor[i] % 2 == 0) {
				qntdPares++;
			}
		}
		return qntdPares;
	}
}
