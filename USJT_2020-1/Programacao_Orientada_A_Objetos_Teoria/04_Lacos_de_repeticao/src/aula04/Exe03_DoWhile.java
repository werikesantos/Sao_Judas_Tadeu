package aula04;

import javax.swing.JOptionPane;

public class Exe03_DoWhile {

	public static void main(String[] args) {
		
		//TEM QUE DECLACAR A VARI�VEL ANTES POIS O 'while' SOLICITA
		int x;
		
		//'do' PEDE PARA (FAZER) ESTA A��O.
		do {
			
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero maior que zero:"));
		
		//'while' (ENQUANTO) A VARI�VEL 'x' FOR MENOR QUE ZERO (0)
		}while (x >= 0); //OBS: DENTRO DA CONDI��O 'while' EXE:.(x < 0), PODEMOS PERCEBER QUE QUE A VARI�VEL PRECISA OBTER UM VALOR, ONDE � DECLARADO NO 'do'.

	}

}
