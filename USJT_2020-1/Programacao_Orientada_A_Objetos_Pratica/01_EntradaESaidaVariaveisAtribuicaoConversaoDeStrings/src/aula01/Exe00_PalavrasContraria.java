package aula01;

import javax.swing.JOptionPane;

public class Exe00_PalavrasContraria {

	public static void main(String[] args) {
		
		/* EXERCICIO 01
		 * 
		 * Crie um algoritmo que leia tr�s palavras, separadamente, e as apresenta na tela na ordem contraria em que 
		 * foram digitadas, separadas por espa�o.
		 * 
		 */
		
		//Realizando leitura de dados solicitados pelo usuario
		String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
		String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
		String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra:");
		
		//Mostrando o resultado ao usuario
		JOptionPane.showMessageDialog(null, palavra3 +" "+ palavra2 +" "+ palavra1);
	}

}
