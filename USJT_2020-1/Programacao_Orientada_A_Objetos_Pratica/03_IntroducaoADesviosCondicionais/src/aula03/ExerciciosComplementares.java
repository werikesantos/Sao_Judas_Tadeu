package aula03;

import javax.swing.JOptionPane;

public class ExerciciosComplementares {

	public static void main(String[] args) {
			
		ExerciciosComplementares exerciciosComplementares = new ExerciciosComplementares();
		
		exerciciosComplementares.atividade5();
		
		exerciciosComplementares.atividade6();
		
		exerciciosComplementares.atividade7();
		
		exerciciosComplementares.atividade8();
		
		exerciciosComplementares.atividade9();
		
		exerciciosComplementares.atividade10();
		
		exerciciosComplementares.atividade11();
		
		exerciciosComplementares.atividade12();
		
		exerciciosComplementares.atividade13();
		
		exerciciosComplementares.atividade14();
		
		exerciciosComplementares.atividade15();
		
		exerciciosComplementares.atividade16();
		
		exerciciosComplementares.atividade17();
		
		exerciciosComplementares.atividade18();
		
		exerciciosComplementares.atividade19();

		exerciciosComplementares.atividade20();
		
		exerciciosComplementares.atividade21();
		
		exerciciosComplementares.atividade22();
		
		exerciciosComplementares.atividade23();
		
		exerciciosComplementares.atividade24();
	
		System.exit(0);
	}
	
	public void atividade5() {
		
		/* ATIVIDADE 5
		 * 
		 * Construir um algoritmo que indique se o n�mero digitado est� compreendido entre 20 e 90 ou n�o.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero n�mero:"));
		
		if((numero >= 20) && (numero <= 90)) {
			
			JOptionPane.showMessageDialog(null, "Est� contido entre 20 e 90:\n" + numero);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "N�O est� contido entre 20 e 90!\n" + numero);
			
		}
		
	}
	
	public void atividade6() {
		
		/* ATIVIDADE 6
		 * 
		 * Entrar com um n�mero e imprimir uma das mensagens: maior do que 20, igual a 20 ou menor do que 20.
		 * 
		 */
		
		int maior;
		int igual;
		int menor;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero n�mero:"));
		
		if(numero > 20) {
			
			maior = numero;
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado � MAIOR que 20.\n" + maior);
			
		}else if(numero == 20) {
			
			igual = numero;
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado � IGUAL a 20.\n" + igual);
			
		}else if(numero < 20) {
			
			menor = numero;
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado � MENOR que 20.\n" + menor);
			
		}
	}
	
	public void atividade7() {
		
		/* ATIVIDADE 7
		 * 
		 * Entrar com o nome, sexo e idade de uma pessoa. 
		 * Se a pessoa for do sexo feminino e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. 
		 * Caso contr�rio, imprimir nome e a mensagem: N�O ACEITA. (Considerar f ou F.)
		 * 
		 */
	
		String nome = JOptionPane.showInputDialog("Digite o seu nome:");
		String sexo = Character.toString(JOptionPane.showInputDialog("Digite o seu sexo: M/F").charAt(0));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		if((sexo.equalsIgnoreCase("F")) && (idade > 25)) {
			
			System.out.println("Nome: "+nome+"\n===========\n"+"ACEITA!");
			
		}else {
			
			System.out.println("Nome: "+nome+"\n===========\n"+"N�O ACEITA!");
			
		}
	}
	
	public void atividade8() {
		
		/* ATIVIDADE 8
		 * 
		 * Entrar com dois n�meros e imprimir o maior n�mero (suponha n�meros diferentes).
		 * 
		 */
		
		int maior = 0;
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		
		//ACHAR O MAIOR N�MERO
		if(numero1 > numero2) {
			
			maior = numero1;
			
		}else if(numero2 > numero1) {
			
			maior = numero2;
			
		}
		
		JOptionPane.showMessageDialog(null, "Os n�meros digitados foram: " + numero1 + " - " + numero2 +"\nO n�mero maior �: " + maior);
		
	}
	
	public void atividade9() {
		
		/* ATIVIDADE 9
		 * 
		 * Entrar com um n�mero e imprimir uma das mensagens: � m�ltiplo de 3 ou n�o �.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		int multiplo = numero % 3;
		
		if(multiplo == 0) {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nEle � m�ltiplo de 3");
			
		}
		
		JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nN�O � m�ltiplo de 3");
		
	}
	
	public void atividade10() {
		
		/* ATIVIDADE 10
		 * 
		 * Entrar com um n�mero e informar se ele � ou n�o divis�vel por 5.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		int divisivel = numero % 5;
		
		if(divisivel == 0) {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nEle � divis�vel por 5.");
			
		}
		
		JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nN�O � divis�vel por 5.");
	}
	
	public void atividade11() {
		
		/* ATIVIDADE 11
		 * 
		 * Entrar com um n�mero e informar se ele � divis�vel por 3 e por 7.
		 * 
		 * EXEMPLOS: 
		 * 
		 * 21 - 42 - 63...n (21+21=42 - 42+21=63 - 63+21=84...n...)
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		int divisivel3 = numero % 3;
		int divisivel7 = numero % 7;
		
		if((divisivel3 == 0) && (divisivel7 == 0)) {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nEle � divis�vel por 3 e 7.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nN�O � divis�vel por 3 e 7.");
			
		}
		
	}
	
	public void atividade12() {
		
		/* ATIVIDADE 12
		 * 
		 * Entrar com um n�mero e informar se ele � divis�vel por 10, por 5, por 2 ou se n�o � divis�vel por nenhum destes.
		 * 
		 * 10 - 20 - 30...n (Qualquer n�mero divis�vel por 10, � divis�vel por 5 e 2.)
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		int divisivel10 = numero % 10;
		int divisivel5 = numero % 5;
		int divisivel2 = numero % 2;
		
		if((divisivel10 == 0) && (divisivel5 == 0) && (divisivel2 == 0)) {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nEle � divis�vel por 10, por 5, e por 2.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nN�O � divis�vel por 10, por 5, e por 2.");
			
		}
		
	}
	
	public void atividade13() {
		
		/* ATIVIDADE 13
		 * 
		 * Ler um n�mero inteiro de 3 casas decimais e imprimir se o algarismo da casa das dezenas � par ou �mpar.
		 * 
		 */
		
		String numero = JOptionPane.showInputDialog("Digite um n�mero inteiro de 3 casas decimais:");
		
		int dezena = (Integer.parseInt(numero.substring(1,2)) % 2);
		
		if(dezena == 0) {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nO algarismo da casa das dezenas, � um n�mero PAR.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O n�mero digitado foi: " + numero + "\nO algarismo da casa das dezenas, � um n�mero �MPAR.");
			
		}
	}
	
	public void atividade14() {
		
		/* ATIVIDADE 14
		 * 
		 * Ler um n�mero inteiro de 4 casas e imprimir se � ou n�o m�ltiplo de quatro 
		 * o n�mero formado pelos algarismos que est�o nas casas das unidades de milhar e das centenas.
		 * 
		 */
		
		String numero = JOptionPane.showInputDialog("Digite n�meros de tipos inteiros, com 4 casas decimais:");
		
		int unidade = (Integer.parseInt(numero.substring(3,4)) % 4);
		int centena = (Integer.parseInt(numero.substring(1,2)) % 4);
		int milhar = (Integer.parseInt(numero.substring(0,1)) % 4);
		
		if((unidade == 0) && (centena == 0) && (milhar == 0)) {
			
			JOptionPane.showMessageDialog(null, "Os n�meros digitados foram: " + numero + "\nOs algarismos das casas das UNIDADES, CENTENA e MILHAR, S�O n�meros M�LTIPLOS de 4.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Os n�meros digitados foram: " + numero + "\nOs algarismos das casas das UNIDADES, CENTENAS e MILHAR, N�O S�O N�MEROS M�LTIPLOS de 4.");
			
		}
		
	}
	
	public void atividade15() {
		
		/* ATIVIDADE 15
		 * 
		 * Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. 
		 * N�o se esque�a de verificar se o ano de nascimento � um ano v�lido.
		 * 
		 */
		
		int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano nascimento:"));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		
		int idade = anoAtual - nascimento;
		
		if(nascimento < anoAtual && idade > 10) {
	
			JOptionPane.showMessageDialog(null, "Voc� tem " +idade+ " anos de idade.");
		
		}else{
		
			JOptionPane.showMessageDialog(null, "Voc� tem menos de 10 anos, e n�o poder� concluir seu cadastro!");
			
		}
		
	}
	
	public void atividade16() {
		
		/* ATIVIDADE 16
		 * 
		 * Crie um algoritmo que leia dois n�meros e imprimir uma mensagem dizendo se s�o iguais ou diferentes.
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		
		if(numero1 == numero2) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n " + numero1 + " - " + numero2 + "\nS�o n�meros IGUAIS!");
			
		}else if(!(numero1 == numero2)) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n " + numero1 + " - " + numero2 + "\nS�o n�meros DIFERENTES!");
			
		}
		
	}
	
	public void atividade17() {
		
		/* ATIVIDADE 17
		 * 
		 * Entrar com dois n�meros e imprimir o menor n�mero (suponha n�meros diferentes).
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		
		if(numero1 < numero2) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n " + numero1 + " - " + numero2 + "\nO PRIMEIRO n�mero digitado � o MENOR n�mero!");
			
		}else if(numero2 < numero1) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n " + numero1 + " - " + numero2 + "\nO SEGUNDO n�mero digitado � o MENOR n�mero!");
			
		}
		
		
	}
	
	public void atividade18() {
		
		/* ATIVIDADE 18
		 * 
		 * Entrar com dois n�meros e imprimi-los em ordem crescente (suponha n�meros diferentes).
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		
		if(numero1 < numero2) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n " + numero1 + " - " + numero2 + "\nOrdem CRESCENTE:\n" +numero1+" - "+numero2);
			
		}else if(numero2 < numero1) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + "\nOrdem CRESCENTE:\n" +numero2+" - "+numero1);
			
		}
	}
	
	public void atividade19() {
		
		/* ATIVIDADE 19
		 * 
		 * Entrar com dois n�meros e imprimi-los em ordem decrescente (suponha n�meros diferentes).
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		
		if(numero1 > numero2) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n " + numero1 + " - " + numero2 + "\nOrdem DECRESCENTE:\n" +numero1+" - "+numero2);
			
		}else if(numero2 > numero1) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + "\nOrdem DECRESCENTE:\n" +numero2+" - "+numero1);
			
		}
		
	}
	
	public void atividade20() {
		
		/* ATIVIDADE 20
		 * 
		 * Criar um algoritmo que deixe entrar com dois n�meros e imprimir o quadrado do menor n�mero e a 
		 * raiz quadrada do maior n�mero, se for poss�vel (suponha n�meros diferentes).
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		
		if(numero1 < numero2) {
			
			int menor = numero1 * numero1;
			double maior = Math.sqrt(numero2);
			
			JOptionPane.showMessageDialog(null, String.format("Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + "\nO QUADRADO do PRIMEIRO e MENOR n�mero � igual = " + menor+"\nA RAIZ QUADRADA do SEGUNDO e MAIOR n�mero � igual = %.2f",maior));
			
		}else if(numero2 < numero1) {
			
			int menor = numero2 * numero2;
			double maior = Math.sqrt(numero1);
			
			JOptionPane.showMessageDialog(null, String.format("Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + "\nO QUADRADO do SEGUNDO e MENOR n�mero � igual = " + menor + "\nA RAIZ QUADRADA do PRIMEIRO n�mero � igual = %.2f", maior));
			
		}
		
	}
	
	public void atividade21() {
		
		/* ATIVIDADE 21
		 * 
		 * Ler tr�s n�meros e escrever o maior n�mero (suponha n�meros diferentes).
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nO MAIOR n�mero � " +numero1);
			
		}else if((numero2 > numero1) && (numero2 > numero3)) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nO MAIOR n�mero � " +numero2);
			
		}else if((numero3 > numero1) && (numero3 > numero2)) {
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nO MAIOR n�mero � " +numero3);
			
		}
	
	}
	
	public void atividade22() {
		
		/* ATIVIDADE 22
		 * 
		 * Ler tr�s n�meros e armazenar o maior n�mero na vari�vel de nome maior (suponha n�meros diferentes).
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		
		int maior = 0;
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			maior = numero1;
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nO MAIOR n�mero � " +maior);
			
		}else if((numero2 > numero1) && (numero2 > numero3)) {
			
			maior = numero2;
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nO MAIOR n�mero � " +maior);
			
		}else if((numero3 > numero1) && (numero3 > numero2)) {
			
			maior = numero3;
			
			JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nO MAIOR n�mero � " +maior);
			
		}
		
	}
	
	public void atividade23() {
		
		/* ATIVIDADE 23
		 * 
		 * Ler tr�s n�meros e armazen�-los em tr�s vari�veis com os seguintes nomes, de acordo com seus valores relativos: 
		 * maior, intermedi�rio e menor (suponha n�meros diferentes).
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		
		int maior = 0;
		int intermediario = 0;
		int menor = 0;
		
		//ACHANDO O MAIOR N�MERO
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			maior = numero1;
			
		}else if((numero2 > numero1) && (numero2 > numero3)) {
			
			maior =  numero2;
			
		}else if((numero3 > numero1) && (numero3 > numero2)) {
			
			maior =  numero3;
			
		}
				
		//ACHANDO O N�MERO INTERMEDI�RIO
		if((numero1 > numero2) && (numero1 < numero3)) {
			
			intermediario = numero1;
			
		}else if((numero2 < numero1) && (numero2 > numero3)) {
			
			intermediario = numero2;
			
		}else if((numero3 > numero1) && (numero3 < numero2)) {
			
			intermediario = numero3;

		}
		
		//ACHANDO O MENOR N�MERO
		if((numero1 < numero2) && (numero1 < numero3)) {
			
			menor = numero1;

		}else if((numero2 < numero1) && (numero2 < numero3)) {
			
			menor = numero2;
			
		}else if((numero3 < numero1) && (numero3 < numero2)) {
			
			menor = numero3;
			
		}
		
		JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nO MAIOR n�mero �: " +maior+ "\nO n�mero INTERMEDI�RIO �: "+intermediario+"\nO MENOR n�mero �: "+menor);
		
	}
	
	public void atividade24() {
		
		/* ATIVIDADE 24
		 * 
		 * Ler cinco n�meros e identificar o maior e o menor de todos (N�O suponha n�meros diferentes).
		 * 
		 */
	
		int maior = 0;
		int menor = 0;
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero:"));
		int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto n�mero:"));
		int numero5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quinto n�mero:"));
		
		//ACHANDO O N�MERO MAIOR
		if((numero1 > numero2) && (numero1 > numero3) && (numero1 > numero4) && (numero1 > numero5)) {
			
			maior = numero1;
			
		}else if((numero2 > numero1) && (numero2 > numero3) && (numero2 > numero4) && (numero2 > numero5)) {
			
			maior = numero2;
			
		}else if((numero3 > numero1) && (numero3 > numero2) && (numero3 > numero4) && (numero3 > numero5)) {
			
			maior = numero3;
			
		}else if((numero4 > numero1) && (numero4 > numero2) && (numero4 > numero3) && (numero4 > numero5)) {
			
			maior = numero4;
			
		}else if((numero5 > numero1) && (numero5 > numero2) && (numero5 > numero3) && (numero5 > numero4)) {
			
			maior = numero5;
			
		}
		
		//ACHANDO O N�MERO MENOR
		if((numero1 < numero2) && (numero1 < numero3) && (numero1 < numero4) && (numero1 < numero5)) {
			
			menor = numero1;
			
		}else if((numero2 < numero1) && (numero2 < numero3) && (numero2 < numero4) && (numero2 < numero5)) {
			
			menor = numero2;
			
		}else if((numero3 < numero1) && (numero3 < numero2) && (numero3 < numero4) && (numero3 < numero5)) {
			
			menor = numero3;
			
		}else if((numero4 < numero1) && (numero4 < numero2) && (numero4 < numero3) && (numero4 < numero5)) {
			
			menor = numero4;
			
		}else if((numero5 < numero1) && (numero5 < numero2) && (numero5 < numero3) && (numero5 < numero4)) {
			
			menor = numero5;
			
		}
		
		JOptionPane.showMessageDialog(null, "Os n�mero digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + " - " + numero4 + " - " + numero5 + "\nO MAIOR n�mero �: " +maior+ "\nO MENOR n�mero �: "+menor);
	}

}
