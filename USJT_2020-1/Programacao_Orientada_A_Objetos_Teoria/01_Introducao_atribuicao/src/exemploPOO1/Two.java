package exemploPOO1;

import javax.swing.JOptionPane;

public class Two {

	int numero;

	//CONSTRUTOR
	public Two() {
		
		
		
	}
	
	//M�TODO: LEIA UM N�MERO INTEIRO E IMPRIMA: �O valor do n�mero digitado �: � 
	public void imprimir() {
		
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro:")));
		
		JOptionPane.showMessageDialog(null, "O valor do n�mero digitado �: \n" + getNumero());
		
	}
	
	//GETTER AND SETTER
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
}
