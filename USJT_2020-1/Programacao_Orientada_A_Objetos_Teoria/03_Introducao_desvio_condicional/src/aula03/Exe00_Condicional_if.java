package aula03;

import javax.swing.JOptionPane;

public class Exe00_Condicional_if {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		
		//UMA CONDI��O QUE SENDO VERDADEIRA, MOSTRA UMA MENSAGEM:
		if (x > 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � positivo");
		}

	}

}
