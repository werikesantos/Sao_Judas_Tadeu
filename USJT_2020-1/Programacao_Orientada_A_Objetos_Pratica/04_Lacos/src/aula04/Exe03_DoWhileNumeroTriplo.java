package aula04;

import javax.swing.JOptionPane;

public class Exe03_DoWhileNumeroTriplo {

	public static void main(String[] args) {

		//O PROGRAMA SE ENCERRAR� QUANDO FOR DIGITADO O N�MERO -999, CASO CONTR�RIO ELE APRESENTAR� O TRIPLO DO N�MERO DIGITADO E REPETIR� TODA A A��O.
		
		//'do - while'
		int i;
		
		do {
			
			String numero = JOptionPane.showInputDialog(null, "Digite um n�mero desde que n�o seja -999", "KATA 2", JOptionPane.QUESTION_MESSAGE);
			
			i = Integer.parseInt(numero);
			
			JOptionPane.showMessageDialog(null, "O triplo de " + i + " � = " + (3 * i), "Kata 2", JOptionPane.PLAIN_MESSAGE);
			
		}while(i != -999);
		
		System.exit(0);
	}

}
