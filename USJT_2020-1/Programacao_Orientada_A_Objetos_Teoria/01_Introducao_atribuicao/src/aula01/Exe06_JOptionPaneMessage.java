package aula01;

import javax.swing.JOptionPane;

public class Exe06_JOptionPaneMessage {

	public static void main(String[] args) {
		
		//MOSTRA UMA CAIXA DE DI�LOGO QUE COLETA DADOS
		String z = JOptionPane.showInputDialog("Digite seu nome:");
		
		//MOSTRANDO O CONTE�DO PELO 'JOptionPane'
		JOptionPane.showMessageDialog(null, "Resultado = " + z);

	}

}
