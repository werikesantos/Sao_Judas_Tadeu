package exemploPOO1;

import javax.swing.JOptionPane;

public class Six {
	
	int numeros;
	
	//CONSTRUTOR
	public Six() {
						
						
							
	}
	
	public void imprimir() {
		
		setNumeros(JOptionPane.showInputDialog("Digite um n�mero:").charAt(0));	
		
		String dado = Character.toString(getNumeros());
		
		if(dado.length() == 1) {
			
			String concatenar = Character.toString(getNumeros());
			
			for(int i = 0; i <= 2 ; i++) {
				
				setNumeros(JOptionPane.showInputDialog("Digite um n�mero:").charAt(0));
							
				concatenar = concatenar + Character.toString(getNumeros());
				
				JOptionPane.showMessageDialog(null, "Numera��o formada: \n" + concatenar);
			
			}
			
		}
		
		
	}


	
	/*
	 * numero = JOptionPane.showInputDialog("Digite um n�mero:");
	
	int soma1 = numero.length();
	
	if(soma1 == 1) {
		
		System.out.println(soma1);
	}else{
		System.out.println("Ser� aceito somente 1 n�mero!");
	}
	 */
	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
}
