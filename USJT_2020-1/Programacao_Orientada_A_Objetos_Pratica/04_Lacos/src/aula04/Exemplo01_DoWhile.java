package aula04;

import javax.swing.JOptionPane;

public class Exemplo01_DoWhile {

	public static void main(String[] args) {

		// RESOLU��O DO EXERC�CIO PROPOSTO DO KATA 1, UTILIZANDO OS 3 LA�OS 'while','do-while' E 'for'

		// LA�O 'do - while'
		int i = 1;
		
		JOptionPane.showMessageDialog(null, "Resultado do Quadrado de n�meros do 1 ao 20:", "Kata 1",JOptionPane.PLAIN_MESSAGE);
		
		do {
			
			JOptionPane.showMessageDialog(null, "N�mero: " + i + " ao quadrado � = " + (i * i), "Kata 1", JOptionPane.PLAIN_MESSAGE);
			
			i = i + 1;
			
		} while (i <= 20);

	}

}
