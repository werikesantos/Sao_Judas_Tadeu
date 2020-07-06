package dojo;

import javax.swing.JOptionPane;

public class Randori {

	public static void main(String[] args) {

		Randori randori = new Randori();
		
		randori.atividade2();
		
		randori.atividade3();
		
		randori.atividade4Aninhado();
		
		randori.atividade4SemAninhar();
		
		System.exit(0);
		
	}
		
	public void atividade2() {
		
		/* ATIVIDADE 2
		 * 
		 * Entrar com um n�mero e imprimi-lo caso seja maior que 20 (n�o fa�a nada se n�o for).
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso em quilogramas:"));
		
		if(numero > 20) {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado � maior que 20:\n" + numero);
			
		}
	}
	
	public void atividade3() {
		
		/* ATIVIDADE 3
		 * 
		 * Ler um n�mero e imprimir se ele � par ou �mpar.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		int impar = numero % 2;
		
		if(impar > 0) {
			
			JOptionPane.showMessageDialog(null, String.format("O n�mero %d � �mpar.",numero));
			
		}else {
			
			JOptionPane.showMessageDialog(null, String.format("O n�mero %d � par.",numero));
			
		}
		
	}
	
	public void atividade4Aninhado() {
		
		/* ATIVIDADE 4 - ANINHADO
		 * 
		 * Escreva um algoritmo que leia 3 n�meros inteiros e diga qual � o maior. 
		 * Resolva usando if-else aninhados. Se houver tempo, resolva novamente com if-else if.
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			JOptionPane.showMessageDialog(null, String.format("O n�mero %d � maior.",numero1));
			
		}else {
			
			if((numero2 > numero1) && (numero2 > numero3)) {
				
				JOptionPane.showMessageDialog(null, String.format("O n�mero %d � maior.",numero2));
				
			}else {
				
				JOptionPane.showMessageDialog(null, String.format("O n�mero %d � maior.",numero3));
				
			}
		}
	}
	
	public void atividade4SemAninhar() {
		
		/* ATIVIDADE 4 - SEM ANINHAR
		 * 
		 * Escreva um algoritmo que leia 3 n�meros inteiros e diga qual � o maior. 
		 * Resolva usando if-else aninhados. (Se houver tempo, resolva novamente com if-else if.)
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			JOptionPane.showMessageDialog(null, String.format("O n�mero %d � maior.",numero1));
			
		}else if((numero2 > numero1) && (numero2 > numero3)) {
				
				JOptionPane.showMessageDialog(null, String.format("O n�mero %d � maior.",numero2));
				
			}else {
				
				JOptionPane.showMessageDialog(null, String.format("O n�mero %d � maior.",numero3));
				
			}		
	}

}
