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
		
		exercicio04_EntreCemEDuzentos._do_while_EntreCemEDuzentos();
		
		exercicio04_EntreCemEDuzentos._for_EntreCemEDuzentos();
	
	}
	
	public void _while_EntreCemEDuzentos() {
		
		int a;
		int b = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
		
		while(a != 0) {
			
			if((a >= 100) && (a <= 200)) {
				
				//VARI�VEL CONTADORA DE PROCESSOS
				b++;

			}
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
			
		}

		JOptionPane.showMessageDialog(null, "Total de vezes em que n�meros entre 100 e 200 foram digitados:\n " + b);
		
	}
	
	public void _do_while_EntreCemEDuzentos() {

		int a;
		int b = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:", "Digite zero (0) para finalizar!", JOptionPane.PLAIN_MESSAGE));
		
		if(a != 0) {
			
			do {
			
				if((a >= 100) && (a <= 200)) {
				
					b++;
				
				}
			
				a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));		
			
			}while(a > 0);
		
			JOptionPane.showMessageDialog(null, "Total de vezes em que n�meros entre 100 e 200 foram digitados:\n" + b);
		
		}
		
			JOptionPane.showMessageDialog(null, "O Processo � finalizado ao digitar o n�mero zero (0)!");
	
	}
	
	public void _for_EntreCemEDuzentos() {
		
		int b = 0;
		int c;
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:", "Digite zero (0) para finalizar!", JOptionPane.PLAIN_MESSAGE));
		
		for(c = 1; a != 0; c++) {
			
			if((a >= 100) && (a <= 200)) {
				
				//VARI�VEL CONTADORA DE PROCESSOS
				b++;

			}
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
			
		}
		
		System.out.println("Foram digitados um total de " + c +" n�meros." + "\nTotal de vezes em que n�meros entre 100 e 200 foram digitados:\n" + b);
		
	}

}
