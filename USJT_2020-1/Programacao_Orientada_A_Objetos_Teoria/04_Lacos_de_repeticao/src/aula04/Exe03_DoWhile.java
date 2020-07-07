package aula04;

import javax.swing.JOptionPane;

public class Exe03_DoWhile {

	public static void main(String[] args) {
		
		/* O loop do while ( faz enquanto ), primeiro executa o c�digo que est� dentro do
		 * loop e depois testa condi��o l�gica; se for verdadeira, executa novamente e
		 * testa de novo; se for verdadeira, executa de novo; e assim sucessivamente at�
		 * que a condi��o se torne falsa.
		 * 
		 ****USANDO QUANDO SE QUER QUE O C�DIGO QUE EST� NO LOOP SEJA EXECUTADO PELO MENOS UMA VEZ. 
		 * 
		 * Ex: para validar uma entrada de dados, ler valores at� que o
		 * usu�rio digite um n�mero maior ou igual a 0 para evitar uma raiz quadrada de
		 * n�mero negativo.
		 * 
		 */
		
		//TEM QUE DECLACAR A VARI�VEL ANTES POIS O 'while' SOLICITA
		int x;
		
		//'do' PEDE PARA (FAZER) ESTA A��O.
		do {
			
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero maior que zero:"));
		
		//'while' (ENQUANTO) A VARI�VEL 'x' FOR MENOR QUE ZERO (0)
		}while (x >= 0); //OBS: DENTRO DA CONDI��O 'while' EXE:.(x < 0), PODEMOS PERCEBER QUE QUE A VARI�VEL PRECISA OBTER UM VALOR, ONDE � DECLARADO NO 'do'.

	}

}
