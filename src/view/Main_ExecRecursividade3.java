package view;

import java.util.Iterator;

import javax.swing.JOptionPane;

import controller.OpCont_ExecRecursividade3;

public class Main_ExecRecursividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		int vetor[] = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o vetor: "));
			if(vetor[i] < 1) {
				System.out.println("O valor do vetor tem que ser diferente de 0!");
				vetor[i] = 1;
			}
		}
		int quantidadePares = OpCont_ExecRecursividade3.vetorPares(tam, vetor);
		
		System.out.println("No vetor tem o total de "+quantidadePares+ " números pares.");
		

	}

}
