package aula02;

import javax.swing.JOptionPane;

public class exercicio_08 {

	public static void main(String[] args) {
			
		/* N�O FINALIZADO!!!
		 * EXERC�CIO 08 - FAZENDO!!!
		 * 
		 * Entrar com um n�mero e imprimir o logaritmo desse n�mero na base 10.
		 * 
		 */
		
		String sAngulo = JOptionPane.showInputDialog("Digite um angulo em graus:");
		
		double angulo = Double.parseDouble(sAngulo);

		double a = Math.toRadians(angulo);
		
		double seno = Math.sin(a);
		double cosseno = Math.cos(a);
		double tangente = Math.tan(a);
		
		JOptionPane.showMessageDialog(null, seno+"\n"+cosseno+"\n"+tangente);
	}

}
