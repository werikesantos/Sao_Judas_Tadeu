package aula04;

import javax.swing.JOptionPane;

public class Exe01_While {

	public static void main(String[] args) {
		
		/*
		 * O loop WHILE(enquanto) primeiro testa condi��o l�gica; 
		 * se ela for verdadeira, executa o c�digo que est� dentro do loop e testa a condi��o l�gica de novo; 
		 * se for verdadeira, executa de novo; e assim secessivamente at� que a condi��o l�gica se torne falsa.
		 * 
		 ****USANDO PRINCIPALMENTE QUANDO O N�MERO DE EXECU��ES DO LOOP � DESCONHECIDO.
		 * 
		 * Leia inteiros digitados pelo usu�rio at� que ele digite -1
		 * 
		 */
		
		int x = 0;
		
		while (x != -1) {
			
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
			
		}	

	}

}
