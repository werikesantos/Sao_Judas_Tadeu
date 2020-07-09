package dojo;

import javax.swing.JOptionPane;

public class Kata {

	public static void main(String[] args) {
		
		/* ATIVIDADE 1
		 * 
		 * Imprimir na tela os quadrados dos n�meros inteiros de 1 a 20.
		 * 
		 */
		
		Kata kata1 = new Kata();
		
		kata1._while_atividade1();
		
		kata1.do_while_atividade1();
		
		kata1._for_atividade1();
		
		
		/* ATIVIDADE 2
		 * 
		 * Entrar com n�meros e imprimir o triplo de cada n�mero. O algoritmo acaba quando entrar o n�mero -999.
		 * 
		 */
		
		Kata kata2 = new Kata();
		
		kata2._while_ImprimirTriplo();
		
		kata2.do_while_ImprimirTriplo();
		
		kata2._for_ImprimirTriplo();
		
		
		System.exit(0);
		
	}
	
	
	//M�TODO: O QUADRADO DE N�MEROS INTEIROS DO 1 AO 20 - 'while'
	public void _while_atividade1() {
			
		int a = 1;
		int quadrado = 0;
		
		while(a <= 20) {
			
			quadrado = a * a;
			
			System.out.println(quadrado);
			
			a++;
			
		}
	}
	
	//M�TODO: O QUADRADO DE N�MEROS INTEIROS DO 1 AO 20 - 'do_while'
	public void do_while_atividade1() {
		
		int a = 1;
		int quadrado = 0;
		
		do {
			
			quadrado = a * a;
			
			System.out.println(quadrado);
			
			a++;
			
		}while(a <= 20);
		
	}
	
	//M�TODO: O QUADRADO DE N�MEROS INTEIROS DO 1 AO 20 - 'for'
	public void _for_atividade1() {
		
		int quadrado;
		
		for(int a = 1; a <= 20; a++){
			
			quadrado = a * a;
			
			System.out.println(quadrado);
			
		}
		
	}
	
	//M�TODO: O TRIPLO DE N�MEROS INTEIROS - 'while'
	public void _while_ImprimirTriplo() {
	
		int a;
		int triplo;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:", "Digite -999 para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));
		
		while(a != -999) {
			
			triplo = a * 3;
			
			JOptionPane.showMessageDialog(null, "O triplo do n�mero digitado �: " + triplo);
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
			
		}
	}
	
	//M�TODO: O TRIPLO DE N�MEROS INTEIROS - 'do_while'
	public void do_while_ImprimirTriplo() {
		
		int a;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:", "Digite -999 para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));
		
		if(a != -999) {
			
			do {
				
				JOptionPane.showMessageDialog(null, "O triplo do n�mero digitado �: " + a * 3);
				
				a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:", "Digite -999 para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));		
			
			}while(a != -999);
		
		}
		
		JOptionPane.showMessageDialog(null, "Programa Finalizado!");
		
	}
	
	//M�TODO: O TRIPLO DE N�MEROS INTEIROS - 'for'
	public void _for_ImprimirTriplo() {

		for(int a = 0; a != -999;) {
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:", "Digite -999 para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));
			
			JOptionPane.showMessageDialog(null, "O triplo do n�mero digitado �: " + a * 3);
				
		}
		
	}
	
}
