package aula01;

import javax.swing.JOptionPane;

public class Exe11_ConverterCaracter {

	public static void main(String[] args) {

		//PEGANDO UM CARACTER NA STRING:
		char caracter = JOptionPane.showInputDialog("Digite uma palavra:").charAt(0); 
		//.charAt(1) DENTRO DO PAR�NTESE, COLOQUE A POSI��O DO CARACTER QUE DESEJA PEGAR.
								
		//MOSTRANDO O RESULTADO:
		JOptionPane.showMessageDialog(null, "O primeiro Caracter: \n( " + caracter + " )");

	}

}
