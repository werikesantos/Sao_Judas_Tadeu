package aula03;

import javax.swing.JOptionPane;

public class Exe01_CondicionalSimples01 {

	public static void main(String[] args) {

		/* EXERC�CIO 01
		 * 
		 * 1) Construir um algoritmo que leia dois valores num�ricos inteiros e efetue a adi��o; 
		 * caso o resultado seja maior que 10, apresent�-lo.
		 * 
		 */
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		
		int z = x + y;
		
		if(z > 10) {
			
			JOptionPane.showMessageDialog(null, z);
			
		}

	}

}
