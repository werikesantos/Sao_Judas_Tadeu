package exemploPOO2;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 1) Crie um algoritmo que leia tr�s palavras, separadamente, e as apresenta na tela na ordem
		 * contr�ria em que foram digitadas, separadas por espa�o.
		 * 
		 */
		
		Atividade atividade1 = new Atividade();
		atividade1.ordemContraria();
		
		/*
		 * 2) Crie um algoritmo que leia um n�mero inteiro, armazene-o em uma vari�vel do tipo int e
		 * depois escreva na tela: �O valor do n�mero digitado �: � e o valor do n�mero.
		 * 
		 */
	
		Atividade atividade2 = new Atividade();		
		atividade2.imprimir1();
		
		/*
		 * 3) Crie um algoritmo que leia 3 n�meros que representem uma data, respectivamente dia,
		 * m�s e ano. Depois imprima a data usando o formato dia/m�s/ano.
		 * 
		 */
		
		Atividade atividade3 = new Atividade();		
		atividade3.data();
		
		/*
		 * 4) Solicite ao usu�rio que digite seu peso no formato real. Depois imprima �O peso 
		 * informado foi � + peso + � kg.�.
		 * 
		 */
		
		Atividade atividade4 = new Atividade();	
		atividade4.seuPeso();
		
		/*
		 * 5) Ler dez caracteres e imprimir a palavra formada por eles.
		 * 
		 */
		
		Atividade atividade5 = new Atividade();		
		atividade5.imprimirPalavra();
		
		/*
		 * 6) Leia 4 n�meros inteiros, representando milhar, centena, dezena e unidade. Use o tipo
		 * caractere para garantir que n�o seja digitado mais de um n�mero por vez. Depois concatene
		 * estes caracteres armazenando-os em uma String (lembre-se de que o jeito mais f�cil de
		 * transformar algo em String � concatenando-o com uma String vazia ��). Imprima o resultado.
		 * 
		 */
		
		Atividade atividade6 = new Atividade();		
		atividade6.imprimir2();
	}
}
