package aula07;

import javax.swing.JOptionPane;

public class Exe00_ArrayList {

	public static void main(String[] args) {
		//DEFININDO A VARI�VEL QUE SER� UTILIZADA
		int entrada;
		
		//CRIANDO VETOR DE 4 POSI��ES
		int[] vetor = new int[4];
		
		//CRIANDO LA�O DE REPETI��O
		for(int i = 0; i < vetor.length; i++) { //vetor.length = RETORNA O TAMANHO DO VETOR DEFINIDO!
			
			//ENTRADA DE DADOS DO USU�RIO
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"� n�mero:"));//ENVIANDO DADOS PELO JOPTION
			vetor[i] = entrada; //JOGANDO A VARIAVEL DENTRO DO VETOR[i]
			
			System.out.println(vetor[i]);// IMPRIMINDO NO CONSOLE
			
		}
		
		System.out.println("Os valores armazenados dentro do vetor s�o:");
		for (int i = 0; i < vetor.length; i++) {//SOLICITANDO A IMPRESS�O DE TODOS OS VALORES DENTRO DO VETOR[i]
			
			System.out.println(vetor[i]);
			
		}
		
		//IMPRIMINDO UMA POSI��O ESPECIFICA DO VETOR
		System.out.println("Resultado do valor localizado dentro do vetor na posi��o (2):\n"+vetor[2]);
	}

}
