package aula01;

import javax.swing.JOptionPane;

public class Exe02_MostrarValor {

	public static void main(String[] args) {
		
		/* EXERCICIO 02
		 * 
		 * Crie um algoritmo que leia um n�mero inteiro, armazene-o em uma vari�vel do tipo int e
		 * depois escreva na tela: O valor do n�mero digitado �: e o valor do n�mero.
		 * 
		 */
		
		//Solicita ao usuario que digite um valor
		String sNumero = JOptionPane.showInputDialog("Digite um n�mero:");
		
		//Convertendo a variavel String para int
		int numero = Integer.parseInt(sNumero);
		
		//Exibindo ao usuario o resultado
		JOptionPane.showMessageDialog(null, "O valor do n�mero digitado �: " + numero);

	}

}
