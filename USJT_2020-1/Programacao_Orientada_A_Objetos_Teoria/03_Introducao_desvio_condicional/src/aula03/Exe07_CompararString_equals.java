package aula03;

import javax.swing.JOptionPane;

public class Exe07_CompararString_equals {

	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("Voc� � um 'Aluno' ou 'Professor':");
		
		//ESSE M�TODO � UTILIZADO SOMENTE PARA COMPARAR STRING
		if(s1.equals("Aluno")){
			
			JOptionPane.showMessageDialog(null, "S�o iguais");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "S�o diferentes");
		
		}

	}

}
