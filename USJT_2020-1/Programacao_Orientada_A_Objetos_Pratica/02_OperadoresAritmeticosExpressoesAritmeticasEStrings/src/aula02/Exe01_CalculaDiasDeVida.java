package aula02;

import javax.swing.JOptionPane;

public class Exe01_CalculaDiasDeVida {

	public static void main(String[] args) {
		
		/* EXERC�CIO 01
		 * 
		 *  Crie um algoritmo para calcular o n�mero de dias aproximado que voc� viveu, com base em sua idade.
		 *
		 */
		
		//Solicitando dados ao usuario
		String sAno = JOptionPane.showInputDialog("Digite o ano do seu nascimento:");
		
		//Convertendo valores
		int ano = Integer.parseInt(sAno);
		
		//Realizando uma operação
		int diasDeVida = ((2020-ano) * 365);
		
		//Exibindo resultado ao usurario
		JOptionPane.showMessageDialog(null, "O n�mero de dias aproximado que voc� viveu: " + diasDeVida);
		
	}

}
