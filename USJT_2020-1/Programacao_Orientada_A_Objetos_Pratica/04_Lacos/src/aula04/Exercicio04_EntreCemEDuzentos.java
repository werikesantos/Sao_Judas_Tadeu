package aula04;

import javax.swing.JOptionPane;

public class Exercicio04_EntreCemEDuzentos {

	public static void main(String[] args) {

		/* EXERC�CIO 4
		 * 
		 * Ler v�rios n�meros e informar quantos n�meros entre 100 e 200 foram digitados. 
		 * Quando o valor 0 (zero) for lido o algoritmo dever� cessar sua execu��o.
		 * 
		 */
		
		Exercicio04_EntreCemEDuzentos exercicio04_EntreCemEDuzentos = new Exercicio04_EntreCemEDuzentos();
		
		exercicio04_EntreCemEDuzentos._while_EntreCemEDuzentos();

	}
	
	public void _while_EntreCemEDuzentos() {
		
		int a = 0;
		int b = 1;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
		
		while(a > 0) {
			
			if((a >= 100) && (a <= 200)) {
				
				//VARI�VEL CONTADORA DE PROCESSOS
				b++;
				
				a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));

			}
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
			
		}

		JOptionPane.showMessageDialog(null, "Total de vezes em que n�meros entre 100 e 200 foram digitados:\n " + b);
		
	}

}
