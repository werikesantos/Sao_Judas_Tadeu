package aula02;

import javax.swing.JOptionPane;

public class Exe12_Substring {

	public static void main(String[] args) {
			
		/* EXERC�CIO 12
		 * 
		 * Entre com uma data em uma vari�vel do tipo String no formato dd/mm/aa e imprimir
		 * dia, m�s e ano separados.
		 * 
		 */
		
		String sData = JOptionPane.showInputDialog("Digite o dia, m�s e ano seguindo o exemplo:\n(dd/mm/aaaa)");
		
		String dia = (sData.substring(0,2));
		String mes = (sData.substring(3,5));
		String ano = (sData.substring(6,10));

		JOptionPane.showMessageDialog(null, "Dia: "+dia+"\nM�s: "+mes+"\nAno: "+ano);

	}

}
