package aula03;

import javax.swing.JOptionPane;

public class Exe01_Condicional_if_else {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
		
		if (x > 0) 
			JOptionPane.showMessageDialog(null, "O n�mero � positivo");
		else //N�O SENDO UMA CONDI��O VERDADEIRA, ESTA LINHA � APRESENTADA AO USU�RIO
			JOptionPane.showMessageDialog(null, "O n�mero � negativo ou nulo");

	}

}
