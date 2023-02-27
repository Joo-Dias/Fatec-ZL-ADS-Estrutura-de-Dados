package view;

import javax.swing.JOptionPane;

import controller.OpCont_Exec2Recursividade3;

public class Main_Exec2Recursividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		int resultado = OpCont_Exec2Recursividade3.fDigitos(num);
		
		System.out.println("A quantidade de digitos do valor digitado é de: "+resultado);

	}

}
