package aula02;

import javax.swing.JOptionPane;

public class exercicio_01 {

	public static void main(String[] args) {
		
		/* EXERCICIO 01
		 * 
		 *  Crie um algoritmo para calcular o número de dias aproximado que você viveu, com base em sua idade.
		 *
		 */
		
		//Solicitando dados ao usuario
		String sAno = JOptionPane.showInputDialog("Digite o ano do seu nascimento:");
		
		//Convertendo valores
		int ano = Integer.parseInt(sAno);
		
		//Realizando uma operação
		int diasDeVida = ((2020-ano) * 365);
		
		//Exibindo resultado ao usurario
		JOptionPane.showMessageDialog(null, "O número de dias aproximado que você viveu: " + diasDeVida);
		
	}

}
