package aula03;

import javax.swing.JOptionPane;

public class Exe02_Condicional_if_elseif_else {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
		
		if (x > 0) {
		
			JOptionPane.showMessageDialog(null, "O n�mero � positivo");
		//NA LINHA ABAIXO EST� APRESENTANDO UMA OUTRA CONDI��O, QUE SE CASO VERDADEIRA APRESENTA A MENSAGEM.
		}else if (x < 0){
			
			JOptionPane.showMessageDialog(null, "O n�mero � negativo");
		
		}else {
			
			JOptionPane.showMessageDialog(null, "O n�mero � nulo");
			
		}
	}

}
