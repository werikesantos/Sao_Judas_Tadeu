package aula02;

import javax.swing.JOptionPane;

public class Exe03_RaizQuadrada {

	public static void main(String[] args) {
		
		/* EXERCICIO 03
		 * 
		 * Crie um algoritmo que leia um n�mero inteiro e o eleve ao quadrado usando o m�todo
		 * double Math.pow(base, expoente), onde base e expoente s�o n�mero reais.
		 * 
		 */
		
		String sNumero = JOptionPane.showInputDialog("Digite um valor inteiro:");
		
		int numero = Integer.parseInt(sNumero);
		
		double elevado = Math.pow(numero, 2);
		
		JOptionPane.showMessageDialog(null, "O n�mero digitado, eleve ao quadrado � igual: "+elevado);
	}

}
