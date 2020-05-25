package aula07;

import java.util.ArrayList;

public class Exe01_ArrayList {

	public static void main(String[] args) {

		//INSTANCIANDO UMA CLASSE DO PACOTE 'java.util' O ARRAYLIST
		ArrayList<String> texto = new ArrayList<String>();
		ArrayList<Integer> numero = new ArrayList<Integer>();
		
		//ADICIONAR TEXTO ARRAYLIST
		System.out.println("Adicionando dados no ArrayList 'texto':");
		texto.add("palavra 1");
		texto.add("palavra 2");
		texto.add("palavra 3");
		texto.add("palavra 4\n");
		
		//MOSTRANDO TODOS OS DADOS CONTIDOS NO ARRAYLIST TEXTO
		String s; //PARA TEXTO
		
		for(int i = 0; i < texto.size(); i++) {//texto.size() = RETORNA O TAMANHO TOTAL
			
			s = texto.get(i);
			System.out.println(s);
			
		}
		
		//ADICIONAR N�MERO ARRAYLIST
		System.out.println("Adicionando n�meros no ArrayList 'numero':");
		numero.add(12);
		numero.add(10);
		numero.add(04);
		numero.add(59);
		
		//MOSTRANDO TODOS OS DADOS CONTIDOS NO ARRAYLIST N�MERO
		Integer r; //PARA N�MERO
		
		for (int i = 0; i < numero.size(); i++) {
			r = numero.get(i);
			System.out.println(r);
		}
		
		//REMOVENDO DADOS NO ARRAYLIST
		System.out.println("\nRemovendo dados no ArrayList na posi��o (1):\n* palavra 2\n* 4\nEXCLU�DO COM SUCESSO!");
		texto.remove(1);
		numero.remove(1);
		
		//CONSULTANDO O ARRAYLIST
		System.out.println("\nConsultando os novos valores RECOLOCADOS na posi��o (1) do ArrayList:");
		System.out.println(texto.get(1));
		System.out.println(numero.get(1));
		
		//SABER O TAMANHO DO ARRAYLIST
		System.out.println("\nImprimindo o tamanho do ArrayList:");
		System.out.println(texto.size());
		System.out.println(numero.size());
	
	}

}
