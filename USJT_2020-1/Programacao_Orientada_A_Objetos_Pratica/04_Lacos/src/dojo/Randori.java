package dojo;

import javax.swing.JOptionPane;

public class Randori {

	public static void main(String[] args) {
		
		/* ATIVIDADE 3
		 * 
		 * Entrar com inteiros enquanto forem maiores que zero e imprimir quantos n�meros foram digitados.
		 * 
		 */
		
		Randori randori1 = new Randori();
		
		randori1._while_atividade3();
		
		randori1._do_while_atividade3();
		
		randori1._for_atividade3();
		
		
		/* ATIVIDADE 4
		 * 
		 * Fa�a um algoritmo que mostre na tela a tabuada de um n�mero qualquer digitado pelo usu�rio.
		 * 
		 */
		
		Randori randori2 = new Randori();
		
		randori2._while_atividade4();
		
		randori2._do_while_atividade4();
		
		randori2._for_atividade4();
		
		
		/* ATIVIDADE 5
		 * 
		 * Dado um pa�s A, com 5 milh�es de habitantes e taxa de natalidade de 3% ao ano, e um pa�s B, com 7 milh�es de habitantes 
		 * e taxa de natalidade de 2% ano, calcule e imprima o tempo necess�rio, em anos, para que a popula��o do pa�s A ultrapasse a do pa�s B.
		 * 
		 */
		
		Randori randori3 = new Randori();
		
		randori3._do_while_atividade5();
		
		
		System.exit(0);
		
	}

	//M�TODO: CONTAR N�MEROS DIGITADOS - 'while'
	public void _while_atividade3() {

		int a = 1;
		
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:", "Digite 0 (zero) para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));	
		
		while(b > 0) {
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
			
			a++;
			
		}
		
		System.out.println(a + " n�meros foram digitados!");
		
	}
	
	//M�TODO: CONTAR N�MEROS DIGITADOS - 'do_while'
	public void _do_while_atividade3() {
		
		int a = 0;
		int b = 0;
		
		do {
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:", "Digite 0 (zero) para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));	

			a++;
			
			
		}while(b > 0);
		
		System.out.println(a + " n�meros foram digitados!");
		
	}
	
	//M�TODO: CONTAR N�MEROS DIGITADOS - 'for'
	public void _for_atividade3() {
		
		int a;
		int b = 0;
		
		for(a = 1; a > 0; b++) {
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
	
		}
		
		System.out.println(b + " n�meros foram digitados!");
		
	}
	
	//M�TODO: TABUADA - 'while'
	public void _while_atividade4() {

		int a;
		int b = 0;
		int tabuada = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
		
		while(b <= 10) {
			
			tabuada = a * b;
			
			System.out.println(tabuada);
			
			b++;
			
		}
		
		System.out.println("\nTabuada do n�mero: " + a);
		
	}
	
	//M�TODO: TABUADA - 'do_while'
	public void _do_while_atividade4() {
		
		int b = 0;
		int tabuada = 0;
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
		
		do {
				
			tabuada = a * b;
			
			System.out.println(tabuada);
			
			b++;
			
		}while(b <= 10);
		
		System.out.println("\nTabuada do n�mero: " + a);
		
	}
	
	//M�TODO: TABUADA - 'for'
	public void _for_atividade4() {
		
		int tabuada = 0;
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero:"));
		
		for(int b = 0; b <= 10; b++) {
			
			tabuada = a * b;
			
			System.out.println(tabuada);
			
		}
		
		System.out.println("\nTabuada do n�mero: " + a);
		
	}
	
	//M�TODO: NATALIDADE DE UM PA�S - 'while'
	public void _do_while_atividade5() {
		
		double a = 5000000, b = 7000000;

		int ano = 0;

		do {

		a = a + (a * 0.03); 

		b = b + (b * 0.02);
		
		ano++;

		}while (a <= b);

		JOptionPane.showMessageDialog(null, ano + " Anos");
		
	}
	
}
