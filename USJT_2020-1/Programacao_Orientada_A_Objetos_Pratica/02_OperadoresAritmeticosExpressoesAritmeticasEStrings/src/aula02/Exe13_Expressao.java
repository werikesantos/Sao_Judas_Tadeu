package aula02;

import javax.swing.JOptionPane;

public class Exe13_Expressao {

	public static void main(String[] args) {
		
		/* EXERCICIO 13
		 * 
		 * Escrever um algoritmo que leia tr�s n�mero reais (a, b e c), calcule e escreve o resultado
		 * da express�o x = 2 * ( ( a - c ) / 8 ) = b * 5.
		 * 
		 */
		
		String sA = JOptionPane.showInputDialog("Digite um valor para (a):");
		String sB = JOptionPane.showInputDialog("Digite um valor para (b):");
		String sC = JOptionPane.showInputDialog("Digite um valor para (c):");
		
		double a = Integer.parseInt(sA);
		double b = Integer.parseInt(sB);
		double c = Integer.parseInt(sC);
		
		double x = 2 * ((a - c) / 8) - b * 5;

		JOptionPane.showMessageDialog(null, "O resultado da express�o X = 2 * ( ( a - c ) / 8 ) - b * 5 � igual:\n\n"+x);
	}

}
