package aula03;

import javax.swing.JOptionPane;

public class Exe04_ {

	public static void main(String[] args) {

		/* AINDA N�O FINALIZADO!!!
		 * 
		 * EXERC�CIO 4
		 * 
		 * 4) Ler tr�s n�meros e escrev�-los em ordem crescente (suponha n�meros diferentes).
		 * 
		 */

		String numeros = JOptionPane.showInputDialog(null, "Digite tr�s n�meros:");
		//String y = JOptionPane.showInputDialog(null, "2� Digite um n�mero:");
		//String z = JOptionPane.showInputDialog(null, "3� Digite um n�mero:");

		int x = Integer.parseInt((numeros.substring(0,1)));
		int y = Integer.parseInt((numeros.substring(1,2)));
		int z = Integer.parseInt((numeros.substring(2,3)));
		
		if ((x < y) && (y < z)) {
			
			JOptionPane.showMessageDialog(null, x +"-"+ y +"-"+z);
	
		}else if ((z < x) && (x < y)){
			
			JOptionPane.showMessageDialog(null, z +"-"+ x +"-"+y);
			
		}
		
		
	}

}
