package exemploPOO1;

import javax.swing.JOptionPane;

public class Five {
	
	private char caracter;
	
	//CONSTRUTOR
	public Five() {
					
					
						
	}
		
	//M�TODO: LER CARACTER E IMPRIMIR A PALAVRA FORMADA.
	public void imprimirPalavra() {
		
		JOptionPane.showInternalMessageDialog(null,"Ser� aceito somente caracteres!", "ATEN��O!!!", 0, null);
		
		setCaracter(JOptionPane.showInputDialog("Digite dez caracteres, para formar uma palavra:").charAt(0));
		String palavra = Character.toString(getCaracter());
			
		for(int i = 0; i <= 8 ; i++) {
						
			setCaracter(JOptionPane.showInputDialog("Digite dez caracteres, para formar uma palavra:").charAt(0));
			palavra = palavra + Character.toString(getCaracter());
			
		}
			
		JOptionPane.showMessageDialog(null, "A palavra formada �: \n" + palavra);	
		
	}
	
	//GETTER AND SETTER
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
}
