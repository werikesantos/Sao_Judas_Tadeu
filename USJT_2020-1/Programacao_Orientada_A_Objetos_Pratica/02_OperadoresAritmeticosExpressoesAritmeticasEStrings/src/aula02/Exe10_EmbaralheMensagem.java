package aula02;

import javax.swing.JOptionPane;

public class Exe10_EmbaralheMensagem {

	public static void main(String[] args) {

		/* EXERC�CIO 10
		 * 
		 * Crie um algoritmo que embaralhe mensagens fazendo o seguinte: leia tr�s frases, separe cada uma delas ao meio. 
		 * Ent�o junte nesta ordem: primeira metade da segunda, segunda metade da terceira, 
		 * segunda metade da segunda, primeira metade da primeira, primeira metade da terceira, segunda metade da primeira. 
		 * Concatene ent�o as tr�s frases originais e imprima o resultado. 
		 * Na linha de baixo, escreva a frase embaralhada e compare o resultado.
		 * 
		 */
		
		String frase1 = "Ol�, Mundo!";
		String frase2 = "N�o importa o que as pessoas pensam. Se voc� acredita que vale a pena, lute por isso.";
		String frase3 = "Posso n�o ser a melhor pessoa do mundo, mas todos os dias luto para me superar!";
		
		//int dado = frase1.length();
		//System.out.println(dado);
		
		String f1 = frase1.substring(0,5);
		String f2 = frase1.substring(6,11);
		
		//int dado = frase2.length();
		//System.out.println(dado);
		
		String f21 = frase2.substring(0,42);
		String f22 = frase2.substring(43,85);
		
		//int dado = frase3.length();
		//System.out.println(dado);
		
		String f31 = frase3.substring(0,39);
		String f32 = frase3.substring(40,79);
		
		System.out.println(f21 + "" + f32 + "" + f22 + "" + f1 + "" + f31 + "" + f2 + "" + frase1 + "" + frase2 + "" + frase3);
	}

}
