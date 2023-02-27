package view;

import javax.swing.JOptionPane;

import controller.OpCont_Exec2Recursividade1;

public class Main_Exec2Recursividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		if(num > 12) {
			System.out.println("Valor não permitido!");
		} else {
			int resultado = OpCont_Exec2Recursividade1.fFatorial(num);
			
			System.out.println("O resultado do fatorial é: "+resultado);
		}
	}

}
