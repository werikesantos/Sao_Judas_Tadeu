package dojo;

import javax.swing.JOptionPane;

public class Randori {

	public static void main(String[] args) {

		Randori randori = new Randori();
		
		randori.atividade3();
		
		randori.atividade4();
		
		randori.atividade5();
		
		System.exit(0);

	}
	
	/* ATIVIDADE 3
	 * 
	 * Crie um algoritmo para ler 2 n�meros inteiros e calcular a divis�o e o resto da divis�o deles. 
	 * N�o precisa testar a divis�o por zero, pois os alunos ainda n�o aprenderam desvio condicional.
	 * 
	 */
	
	public void atividade3() {
		
	int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
	int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
	
	int divisao = numero1 / numero2;
	int resto = numero1 % numero2;
	
	JOptionPane.showMessageDialog(null, "O resultado da divis�o �: " + divisao + "\nO resto da divis�o �: " + resto);
	
	}
	
	/* ATIVIDADE 4
	 * 
	 * Crie um algoritmo que leia um n�mero inteiro e calcule a sua raiz quadrada.
	 * 
	 */
	
	public void atividade4() {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		
		double raiz = Math.sqrt(numero1);
		
		JOptionPane.showMessageDialog(null, "A raiz quadrada do n�mero " + numero1 + " �: " + raiz);
	}
	
	/* ATIVIDADE 5
	 * 
	 * Para gerar o nome de usu�rio de rede de um novo empregado uma empresa usa o seguinte algoritmo: 
	 * pega as tr�s primeiras letras do nome e as tr�s �ltimas letras do sobrenome da pessoa os concatena. 
	 * Implemente este algoritmo, lendo o nome completo da pessoa e imprimindo o resultado.
	 * 
	 */
	
	public void atividade5() {

	String nome = JOptionPane.showInputDialog("Digite o nome completo do usu�rio:");
	
	String nomeUsr = nome.substring(0,3);
	String sobrenomeUsr = nome.substring(nome.length() - 3);
	
	String novoUsr = (nomeUsr + sobrenomeUsr);

	JOptionPane.showMessageDialog(null, "O nome de usu�rio de rede �: " + novoUsr);
	
	}
}
