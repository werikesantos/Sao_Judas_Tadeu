package aula04;

import javax.swing.JOptionPane;

public class Exe04_ImprimirAteCem {

	public static void main(String[] args) {

		/* EXERC�CIO 1
		 * 1) Imprimir na tela todos os n�meros de 100 a 1 (contagem regressiva). 
		 *  
		 * 4) Ler v�rios n�meros e informar quantos n�meros entre 100 e 200
		 * foram digitados. Quando o valor 0 (zero) for lido o algoritmo dever� cessar
		 * sua execu��o.
		 * 
		 */
		
		int i;
		
		//LA�O 'while'
		JOptionPane.showMessageDialog(null, "La�o 'while'", "EXERC�CIO 1", JOptionPane.PLAIN_MESSAGE);
		
		i = 1;
		while(i <= 100) {
			
			System.out.println(i);
			
			i++; //i = i + 1;	
		}
		
		
		//LA�O 'do - while'
		i = 1;
		JOptionPane.showMessageDialog(null, "La�o 'do - while'", "EXERC�CIO 1", JOptionPane.PLAIN_MESSAGE);
		
		do{
			
			System.out.println(i);
			i++; //i = i +1;
			
		}while(i <= 100);
		
		
		//LA�O 'for' 
		JOptionPane.showMessageDialog(null, "La�o 'for'", "EXERC�CIO 1", JOptionPane.PLAIN_MESSAGE);
		for(i = 1; i <= 100; i++) {
			
			System.out.println(i);
			
		}
	}

}
