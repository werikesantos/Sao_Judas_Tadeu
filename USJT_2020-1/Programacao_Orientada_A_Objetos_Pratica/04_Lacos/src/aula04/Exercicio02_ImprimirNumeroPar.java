package aula04;

import javax.swing.JOptionPane;

public class Exercicio02_ImprimirNumeroPar {

	public static void main(String[] args) {
				
		/* EXERC�CIO 2
		 * 
		 * Imprimir na tela os 100 primeiros n�meros pares.
		 * 
		 */
		
		Exercicio02_ImprimirNumeroPar exercicio02_ImprimirNumeroPar = new Exercicio02_ImprimirNumeroPar();
		
		exercicio02_ImprimirNumeroPar._while_ImprimirNumeroPar();
		
		exercicio02_ImprimirNumeroPar._do_while_ImprimirNumeroPar();
		
		exercicio02_ImprimirNumeroPar._for_ImprimirNumeroPar();
		
		System.exit(0);
		
	}
	
	public void _while_ImprimirNumeroPar() {
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
	}
	
	public void _do_while_ImprimirNumeroPar() {
		
		//LA�O 'do - while'
		int i = 0;
		JOptionPane.showMessageDialog(null, "La�o 'do - while'", "EXERC�CIO 2", JOptionPane.PLAIN_MESSAGE);

		do {

			System.out.println(i * 2);
			i++; // i = i +1;

		} while (i <= 50);

	}
	
	public void _for_ImprimirNumeroPar() {
		
		// LA�O 'for'
		JOptionPane.showMessageDialog(null, "La�o 'for'", "EXERC�CIO 2", JOptionPane.PLAIN_MESSAGE);
		
		for (int i = 0; i <= 50; i++) {

			System.out.println(i * 2);

		}

	}

}
