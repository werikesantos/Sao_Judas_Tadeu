package aula02;

import javax.swing.JOptionPane;

public class Exe04_ImprimaTamanhoString {

	public static void main(String[] args) {
		
		/* EXERC�CIO 04
		 * 
		 * Crie um algoritmo que leia tr�s strings por meio do JOptionPane e escreva a soma do
		 * comprimento destas strings.
		 * 
		 */
		
		// Solicitando informações ao ususario
		String um = JOptionPane.showInputDialog("1�) Digite algo:");
		String dois = JOptionPane.showInputDialog("2�) Digite algo:");
		String tres = JOptionPane.showInputDialog("3�) Digite algo:");
		
		//O comando abaixo ".length()" realiza a contagem de quantos caracteres possui a String.
		int soma1 = um.length();
		int soma2 = dois.length();
		int soma3 = tres.length();
		
		JOptionPane.showMessageDialog(null, soma1+"\n"+soma2+"\n"+soma3);
	}

}
