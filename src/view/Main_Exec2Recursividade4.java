package view;

import javax.swing.JOptionPane;

import controller.OpCont_Exec2Recursividade4;

public class Main_Exec2Recursividade4 {
	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		String resultado = OpCont_Exec2Recursividade4.fInvertido(palavra);
		
		System.out.println("A palavra "+palavra+" invertida é "+resultado);
	}
}
