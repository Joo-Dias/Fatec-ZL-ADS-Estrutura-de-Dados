package view;

import javax.swing.JOptionPane;

import controller.OpCont_ExecRecursividade2;

public class Main_ExecRecursividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		double resultado = OpCont_ExecRecursividade2.divRecursiva(dividendo, divisor);
		JOptionPane.showMessageDialog(null, resultado);

	}

}
