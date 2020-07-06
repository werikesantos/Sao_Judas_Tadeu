package dojo;

import javax.swing.JOptionPane;

public class Kata {

	public static void main(String[] args) {

		Kata kata = new Kata();
		
		kata.atividade1();
		
		System.exit(0);
		
	}
	
	public void atividade1() {
		
		/* ATIVIDADE 1
		 * 
		 * O �ndice de massa corporal (IMC) � uma medida internacional usada para calcular 
		 * se uma pessoa est� no peso ideal adotado pela Organiza��o Mundial da Sa�de (OMS). 
		 * O IMC � determinado pela divis�o da massa do indiv�duo pelo quadrado se sua altura, 
		 * onde a massa est� em quilogramas e a altura est� em metros. A f�rmula � IMC = massa/altura 2. 
		 * 
		 * A seguinte tabela indica os resultados:
		 * 
		 * - IMC < 18,5 = Magreza;
		 * - IMC entre 18,5 e 25,0 (exclusive) = Saud�vel;
		 * - IMC entre 25,0 e 30,0 (exclusive) = Sobrepeso;
		 * - IMC entre 30,0 e 35,0 (exclusive) = Obesidade Grau I;
		 * - IMC entre 35,0 e 40,0 (exclusive) = Obesidade Grau II (severa);
		 * - IMC maior ou igual a 40,0 = Obesidade Grau III (m�rbida).
		 * Com este conhecimento, escreva um algoritmo, usando if-else if-else e operadores l�gicos (&&, ||, !) 
		 * para calcular o IMC de uma pessoa com base em seu peso e altura e escrever a 
		 * classifica��o correspondente � condi��o f�sica de uma pessoa.
		 * 
		 */
		
		float peso = Float.parseFloat((JOptionPane.showInputDialog("Digite o seu peso em quilogramas:")));
		float altura = Float.parseFloat((JOptionPane.showInputDialog("Digite a sua altura em metros:")));
		
		float imc = (peso / (altura * altura));
		
		if(imc < 18.5) {
			
			JOptionPane.showMessageDialog(null, String.format("Seu �ndice de massa corporal (IMC) �: %.2f \nIMC menor que 18.5 = Magreza",imc));
			
		}else if(imc >= 18.5 && imc < 25) {
			
			JOptionPane.showMessageDialog(null, String.format("Seu �ndice de massa corporal (IMC) �: %.2f \nIMC entre 18,5 e 25,0 = Saud�vel",imc));
			
		}else if(imc >= 25 && imc < 30){
			
			JOptionPane.showMessageDialog(null, String.format("Seu �ndice de massa corporal (IMC) �: %.2f \nIMC entre 25,0 e 30,0 = Sobrepeso",imc));
			
		}else if(imc >= 30 && imc < 35) {
			
			JOptionPane.showMessageDialog(null, String.format("Seu �ndice de massa corporal (IMC) �: %.2f \nIMC entre 30,0 e 35,0 = Obesidade Grau I",imc));
			
		}else if(imc >= 35 && imc < 40) {
			
			JOptionPane.showMessageDialog(null, String.format("Seu �ndice de massa corporal (IMC) �: %.2f \nIMC entre 35,0 e 40,0 = Obesidade Grau II (severa)",imc));
			
		}else {
			
			JOptionPane.showMessageDialog(null, String.format("Seu �ndice de massa corporal (IMC) �: %.2f \nIMC maior ou igual a 40,0 = Obesidade Grau III (m�rbida)",imc));
			
		}

	}
	
}
