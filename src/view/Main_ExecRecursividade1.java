package view;

import javax.swing.JOptionPane;

import controller.OpCont_ExecRecursividade1;

public class Main_ExecRecursividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		int resultado = OpCont_ExecRecursividade1.multRecursiva(a, b);
		JOptionPane.showMessageDialog(null, resultado);
	}

}
