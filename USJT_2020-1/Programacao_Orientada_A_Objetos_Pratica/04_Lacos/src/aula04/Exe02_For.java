package aula04;

import javax.swing.JOptionPane;

public class Exe02_For {

	public static void main(String[] args) {

		// RESOLU��O DO EXERC�CIO PROPOSTO DO KATA 1, UTILIZANDO OS 3 LA�OS 'while','do-while' E 'for'

		// LA�O 'for'
		int i;
		
		JOptionPane.showMessageDialog(null, "Resultado do Quadrado de n�meros do 1 ao 20:", "Kata 1",JOptionPane.PLAIN_MESSAGE);
		
		for (i = 1; i <= 20; i++) { //i = i + 1
			
			JOptionPane.showMessageDialog(null, "N�mero: " + i + " ao quadrado � = " + (i * i), "Kata 1", JOptionPane.PLAIN_MESSAGE);
		
		}

		System.exit(0);

	}

}
