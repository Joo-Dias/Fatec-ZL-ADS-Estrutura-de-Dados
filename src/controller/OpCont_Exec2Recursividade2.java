package controller;

public class OpCont_Exec2Recursividade2 {
	
	public static int fNegativos(int tam, int vetor[], int posicao) {
		// Caso a posição do vetor seja maior que o tamanho do vetor
		if(posicao >= tam) {
			return 0;
		}
		else {
			// Criando o contador de elementos nmegativos
			int contador;
			
			// Condição de parada, verificando se o valor da posição do vetor é menor que 0
			if(vetor[posicao] < 0) {
				contador = 1;
			} else {
				contador = 0;
			}
			return contador + fNegativos(tam, vetor, posicao + 1);
		}
	}
}
