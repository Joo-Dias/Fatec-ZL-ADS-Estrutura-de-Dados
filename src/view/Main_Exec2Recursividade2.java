package view;

import javax.swing.JOptionPane;

import controller.OpCont_Exec2Recursividade2;

public class Main_Exec2Recursividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o tamanho do vetor: "));
		int vetor[] = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o vetor: "));
		}
		
		int resultado = OpCont_Exec2Recursividade2.fNegativos(tam, vetor, 0);
		System.out.println("A quantidade de números negativos no vetor é de: "+resultado);

	}

}
