package aula04;

import javax.swing.JOptionPane;

public class Exe06_ForAteZero {

	public static void main(String[] args) {

		/* FOR
		 * 
		 * for(para): � dividido em 3 partes(A; B; C)
		 * 
		 * A) declara��o da vari�vel 
		 * B) condi��o l�gica de parada
		 * C) incremento da vari�vel contadora.
		 * 
		 */
		
		for (int i = 10; i >= 0; i--) {
			
			JOptionPane.showMessageDialog(null, i);
			
		}

	}

}
