package dojo;

import javax.swing.JOptionPane;

public class ListaExtra {

	public static void main(String[] args) {
		
		ListaExtra listaExtra = new ListaExtra();
		
		listaExtra.atividade1();
		
		listaExtra.atividade2();
		
		listaExtra.atividade3();
		
		listaExtra.atividade4();
		
		listaExtra.atividade5();
	
		listaExtra.atividade6();
		
		System.exit(0);
		
	}
	
	public void atividade1() {
		
		/* ATIVIDADE 1
		 * 
		 * Construir um algoritmo que leia tr�s n�meros e imprima se eles podem ou n�o ser lados de um tri�ngulo. 
		 * Lembrando que, para ser um tri�ngulo, a soma de dois lados quaisquer deve ser sempre maior que o lado que ficou de fora da soma.
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		
		int dado1 = numero1 + numero2;
		int dado2 = numero2 + numero3;
		int dado3 = numero1 + numero3;
		
		if(dado1 > numero3) {
			
			JOptionPane.showMessageDialog(null, String.format("A soma do primeiro e segundo n�mero � igual a %d.\nQue � maior que o terceiro n�mero digitado %d.\nNeste caso, pode ser um tri�ngulo.", dado1, numero3));
			
		}else if(dado2 > numero1) {
			
			JOptionPane.showMessageDialog(null, String.format("A soma do segundo e terceiro n�mero � igual a %d.\nQue � maior que o primeiro n�mero digitado %d.\nNeste caso, pode ser um tri�ngulo.", dado2, numero1));
			
		}else if(dado3 > numero2) {
			
			JOptionPane.showMessageDialog(null, String.format("A soma do primeiro e terceiro n�mero � igual a %d.\nQue � maior que o segundo n�mero digitado %d.\nNeste caso, pode ser um tri�ngulo.", dado3, numero2));
			
		}
	}
	
	public void atividade2() {
		
		/* ATIVIDADE 2
		 * 
		 * Construir um algoritmo que leia tr�s n�meros que representam os lados de um tri�ngulo
		 * e que imprima se o tri�ngulo � equil�tero (tr�s lados iguais), 
		 * is�sceles (dois lados iguais) ou escaleno (tr�s lados diferentes). 
		 * Antes, n�o se esque�a de testar se os tr�s lados realmente formam um tri�ngulo. 
		 * 
		 * Informe o usu�rio caso n�o formem.
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		
		if(numero1 == numero2 && numero2 == numero3 && numero1 == numero3) {
			
			JOptionPane.showMessageDialog(null, String.format("� um tri�ngulo equil�tero (TR�S lados IGUAIS.)\n%d\n%d\n%d", numero1,numero2,numero3));
			
		}else if((numero1 == numero2) || (numero2 == numero3) || (numero3 == numero1)) {
			
			JOptionPane.showMessageDialog(null, String.format("� um tri�ngulo is�sceles (DOIS lados IGUAIS.)\n%d\n%d\n%d", numero1,numero2,numero3));
			
		}else if(numero1 != numero2){
			
			JOptionPane.showMessageDialog(null, String.format("� um tri�ngulo escaleno (TR�S LADOS DIFERENTES.)\n%d\n%d\n%d", numero1,numero2,numero3));
			
		}else {
			
			JOptionPane.showMessageDialog(null, "N�o formou um tri�ngulo!");
			
		}
		
	}
	
	public void atividade3() {
		
		/* ATIVIDADE 3
		 * 
		 * Entrar com um verbo no infinitivo e imprimir se o verbo � da 1� conjuga��o (terminados em ar), 
		 * da 2� conjuga��o (terminados em er), da 3� conjuga��o (terminados em ir), se n�o est� no infinitivo (n�o termina em r) 
		 * ou se provavelmente nem � verbo no infinitivo (termina em or ou em ur).
		 * 
		 */
		
		String verbo = JOptionPane.showInputDialog("Digite um VERBO no INFINITIVO:");
		
		String infinitivo = verbo.substring(verbo.length() - 2);
		
		if(infinitivo.equalsIgnoreCase("ar")) {
			
			JOptionPane.showMessageDialog(null, "Verbo da 1� conjuga��o (terminado em ar):\nVerbo digitado: " + verbo + "\nInfinitivo: " + infinitivo);
			
		}else if(infinitivo.equalsIgnoreCase("er")) {
			
			JOptionPane.showMessageDialog(null, "Verbo da 2� conjuga��o (terminado em er):\nVerbo digitado: " + verbo + "\nInfinitivo: " + infinitivo);
			
		}else if(infinitivo.equalsIgnoreCase("ir")) {
			
			JOptionPane.showMessageDialog(null, "Verbo da 3� conjuga��o (terminado em ir):\nVerbo digitado: " + verbo + "\nInfinitivo: " + infinitivo);
			
		}else if((infinitivo.equalsIgnoreCase("or")) || (infinitivo.equals("ur"))) {
			
			JOptionPane.showMessageDialog(null, "N�o � verbo no infinitivo (terminados em 'or' ou em 'ur'):\nVerbo digitado: " + verbo + "\nInfinitivo: -" );
			
		}else {
			
			JOptionPane.showMessageDialog(null, "N�o � um verbo no infinitivo (n�o termina em 'r')." );
			
		}
	}
	
	public void atividade4() {
		
		/* ATIVIDADE 4
		 * 
		 * Ajude a universidade a montar as divis�es do laborat�rio de programa��o. 
		 * Para isso, escreva um algoritmo que leia o nome do aluno e diga em qual divis�o ele est� respeitando a regra abaixo:
		 * - alunos cujo nome come�a com as letras de A a K est�o na D1;
		 * - alunos cujo nome come�a com as letras de L a N est�o na D2;
		 * - alunos cujo nome come�a com as letras de O a Z est�o na D3.
		 * Dica: use o m�todo charAt(posi��o).
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		
		String letra = nome.substring(0,1);
				
		if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F") || letra.equalsIgnoreCase("G") || letra.equalsIgnoreCase("H") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("J") || letra.equalsIgnoreCase("K")) {
			
			JOptionPane.showMessageDialog(null, "Laborat�rio: D1\nNome: " + nome + "\nLetra inicial: " + letra);
			
		}else if(letra.equalsIgnoreCase("L") || letra.equalsIgnoreCase("M") || letra.equalsIgnoreCase("N")) {
			
			JOptionPane.showMessageDialog(null, "Laborat�rio: D2\nNome: " + nome + "\nLetra inicial: " + letra);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Laborat�rio: D3\nNome: " + nome + "\nLetra inicial: " + letra);
			
		}
	
	}
	
	public void atividade5() {
		
		/* ATIVIDADE 5 - N�O FINALIZADO
		 * 
		 * Ler tr�s n�meros e armazen�-los em tr�s vari�veis com os seguintes nomes, de acordo com seus valores relativos: 
		 * maior, intermedi�rio e menor (suponha n�meros diferentes).
		 * 
		 */
		
		int maior;
		int intermediario;
		int menor;
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro n�mero:", "SOMENTE N�MEROS ALEAT�RIOS", JOptionPane.INFORMATION_MESSAGE));	
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo n�mero:", "SOMENTE N�MEROS ALEAT�RIOS", JOptionPane.INFORMATION_MESSAGE));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro n�mero:", "SOMENTE N�MEROS ALEAT�RIOS", JOptionPane.INFORMATION_MESSAGE));
		
		if((numero1 > numero2 && numero1 > numero3) && (numero2 < numero1 && numero2 > numero3) && (numero3 < numero1 && numero3 < numero2)) {

			maior = numero1;
			intermediario = numero2;
			menor = numero3;
			
			JOptionPane.showMessageDialog(null, "1� = "+numero1+"\n2� = "+numero2+"\n3� = "+numero3+"\n=========\nO PRIMEIRO n�mero digitado � o MAIOR de todos:\n" + maior + "\nO SEGUNDO n�mero digitado � o INTERMEDI�RIO:\n" + intermediario + "\nO TERCEIRO n�mero digitado � o MENOR de todos:\n" + menor);
			
			
		}else if((numero2 > numero1 && numero2 > numero3) && (numero3 < numero2 && numero3 > numero1) && (numero1 < numero2 && numero1 < numero3)) {
			
			maior = numero2;
			intermediario = numero3;
			menor = numero1;
			
			JOptionPane.showMessageDialog(null, "1� = "+numero1+"\n2� = "+numero2+"\n3� = "+numero3+"\n=========\nO SEGUNDO n�mero digitado � o MAIOR de todos:\n" + maior + "\nO TERCEIRO n�mero digitado � o INTERMEDI�RIO:\n" + intermediario + "\nO PRIMEIRO n�mero digitado � o MENOR de todos:\n" + menor);
			
		}else if((numero3 > numero1 && numero3 > numero2) && (numero1 > numero2 && numero1 < numero3) && (numero2 < numero1 && numero2 < numero3)) {
			
			maior = numero3;
			intermediario = numero1;
			menor = numero2;
			
			JOptionPane.showMessageDialog(null, "1� = "+numero1+"\n2� = "+numero2+"\n3� = "+numero3+"\n=========\nO TERCEIRO n�mero digitado � o MAIOR de todos:\n" + maior + "\nO PRIMEIRO n�mero digitado � o INTERMEDI�RIO:\n" + intermediario + "\nO SEGUNDO n�mero digitado � o MENOR de todos:\n" + menor);
			
		}
	}
	
	public void atividade6() {
		
		/* ATIVIDADE 6
		 * 
		 * Ler cinco n�meros e identificar o maior e o menor de todos (N�O suponha n�meros diferentes).
		 * 
		 */
		
		int maior = 0;
		int menor = 0;
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto n�mero:"));
		int n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quinto n�mero:"));
		
		//ACHANDO O 'MAIOR' N�MERO
		if((n1 > n2) && (n1 > n3) && (n1 > n4) && (n1 > n5)) {

			maior = n1;
			
		}else if((n2 > n1) && (n2 > n3) && (n2 > n4) && (n2 > n5)) {
			
			maior = n2;
			
		}else if((n3 > n1) && (n3 > n2) && (n3 > n4) && (n3 > n5)) {
		
			maior = n3;
			
		}else if((n4 > n1) && (n4 > n2) && (n4 > n3) && (n4 > n5)) {
			
			maior = n4;
	
		}else if((n5 > n1) && (n5 > n2) && (n5 > n3) && (n5 > n4)) {
			
			maior = n5;
			
		}
		
		//ACHANDO O 'MENOR' N�MERO
		if((n1 < n2) && (n1 < n3) && (n1 < n4) && (n1 < n5)) {
			
			menor = n1;
			
		}else if((n2 < n1) && (n2 < n3) && (n2 < n4) && (n2 < n5)) {
			
			menor = n2;
			
		}else if((n3 < n1) && (n3 < n2) && (n3 < n4) && (n3 < n5)) {
			
			menor = n3;
			
		}else if((n4 < n1) && (n4 < n2) && (n4 < n3) && (n4 < n5)) {
			
			menor = n4;
			
		}else if((n5 < n1) && (n5 < n2) && (n5 < n3) && (n5 < n4)) {
			
			menor = n5;
			
		}
		
		//IMPRIMINDO SOMENTO O MAIOR E MENOR N�MERO!
		JOptionPane.showMessageDialog(null, "O MAIOR n�mero de todos os que foram digitados:\n" + maior + "\nO MENOR n�mero de todos os que foram digitados:\n" + menor);
		
	}
	

}
