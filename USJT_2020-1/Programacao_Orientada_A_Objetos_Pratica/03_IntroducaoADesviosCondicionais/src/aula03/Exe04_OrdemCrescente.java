package aula03;

import javax.swing.JOptionPane;

public class Exe04_OrdemCrescente {

	public static void main(String[] args) {

		/* EXERC�CIO 4
		 * 
		 * 4) Ler tr�s n�meros e escrev�-los em ordem crescente (suponha n�meros diferentes).
		 * 
		 */
		
		int maior = 0;
		int intermediario = 0;
		int menor = 0;
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		
		//ACHANDO O MAIOR N�MERO
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			maior = numero1;
			
		}else if((numero2 > numero1) && (numero2 > numero3)) {
			
			maior =  numero2;
			
		}else if((numero3 > numero1) && (numero3 > numero2)) {
			
			maior =  numero3;
			
		}
				
		//ACHANDO O N�MERO INTERMEDI�RIO
		if((numero1 > numero2) && (numero1 < numero3)) {
			
			intermediario = numero1;
			
		}else if((numero2 < numero1) && (numero2 > numero3)) {
			
			intermediario = numero2;
			
		}else if((numero3 > numero1) && (numero3 < numero2)) {
			
			intermediario = numero3;

		}
		
		//ACHANDO O MENOR N�MERO
		if((numero1 < numero2) && (numero1 < numero3)) {
			
			menor = numero1;

		}else if((numero2 < numero1) && (numero2 < numero3)) {
			
			menor = numero2;
			
		}else if((numero3 < numero1) && (numero3 < numero2)) {
			
			menor = numero3;
			
		}
		
		JOptionPane.showMessageDialog(null, "Os n�meros digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nOrdem CRESCENTE:\n" +menor+" - "+intermediario+" - "+maior);
		
	}

}
