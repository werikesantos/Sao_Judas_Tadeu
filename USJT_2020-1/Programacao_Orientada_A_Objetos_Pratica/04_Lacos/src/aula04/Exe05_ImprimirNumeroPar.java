package aula04;

import javax.swing.JOptionPane;

public class Exe05_ImprimirNumeroPar {

	public static void main(String[] args) {
		
		
		/* EXERC�CIO 2
		 * 
		 * 2) Imprimir na tela os 100 primeiros n�meros pares. Exerc�cios intermedi�rios:
		 * valor 0,5 ponto Resolva os exerc�cios desta se��o para conquistar mais 0,5 ponto
		 * 
		 */

		int i;

		// LA�O 'while'
		JOptionPane.showMessageDialog(null, "La�o 'while'", "EXERC�CIO 2", JOptionPane.PLAIN_MESSAGE);

		i = 0;
		while (i <= 50) {
			
			//NESTA LINHA 'SOMENTE' IMPRIME O RESULTADO DE UMA OPERA��O!
			System.out.println(i * 2);
			
			//NESTA LINHA � SOMADO +1 NA VARI�VEL. SOMENTE AQUI � ACRESCENTADO UMA SOMA +1.
			i++;
			
		}

		
		//LA�O 'do - while'
		i = 0;
		JOptionPane.showMessageDialog(null, "La�o 'do - while'", "EXERC�CIO 2", JOptionPane.PLAIN_MESSAGE);

		do {

			System.out.println(i * 2);
			i++; // i = i +1;

		} while (i <= 50);

		
		// LA�O 'for'd
		JOptionPane.showMessageDialog(null, "La�o 'for'", "EXERC�CIO 2", JOptionPane.PLAIN_MESSAGE);
		for (i = 0; i <= 50; i++) {

			System.out.println(i * 2);

		}

	}

}
