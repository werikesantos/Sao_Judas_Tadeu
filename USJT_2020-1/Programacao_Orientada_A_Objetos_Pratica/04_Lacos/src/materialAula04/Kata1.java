package materialAula04;

import javax.swing.*;

//Resolu��o do exerc�cio proposto no Kata 1, utilizando os 3 la�os while, do-while e for

public class Kata1 {
	public static void main(String args[]) {
		
		int i;

		JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20 com o la�o while", "Kata 1",
				JOptionPane.PLAIN_MESSAGE);
		i = 1;
		while (i <= 20) {
			JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20: para i:" + i + " o quadrado de i �:" + (i * i),
					"Kata 1", JOptionPane.PLAIN_MESSAGE);
			i = i + 1;
		}

		JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20 com o la�o do-while", "Kata 1",
				JOptionPane.PLAIN_MESSAGE);
		i = 1;
		do {
			JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20: para i:" + i + " o quadrado de i �:" + (i * i),
					"Kata 1", JOptionPane.PLAIN_MESSAGE);
			i = i + 1;
		} while (i <= 20);

		JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20 com o la�o for", "Kata 1", JOptionPane.PLAIN_MESSAGE);
		for (i = 1; i <= 20; i = i + 1) {
			JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20: para i:" + i + " o quadrado de i �:" + (i * i),
					"Kata 1", JOptionPane.PLAIN_MESSAGE);
		}

		System.exit(0);
	}
}