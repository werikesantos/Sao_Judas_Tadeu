package aula03;

import javax.swing.JOptionPane;

public class Exe06_OperadoresExpressoes2 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para (a):"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para (b)"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para (c)"));
		
		if (a == b || a == c || b == c) {
			System.out.println("H� pelo menos 2 n�meros iguais");
		} else {
			System.out.println("Os n�meros s�o diferentes");
		}

	}

}
