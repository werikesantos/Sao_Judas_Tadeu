package aula05_00;

public class CanetaMain {
	
	/* Problemas Propostos:
	 * 
	 * Kata
	 * 
	 * 1) Criar a classe Caneta com os atributos tipo e cor, ambos String. Fa�a o construtor que
	 * receba o tipo e a cor como par�metros, os m�todos de acesso e os modificadores. Crie uma
	 * classe CanetaMain com o m�todo main( ) que instancie um objeto Caneta e imprima seus atributos.
	 *
	 */
	
	public static void main(String[] args) {
		
		Caneta caneta0 = new Caneta("Hidrogr�fica","Vermelha");
		
		caneta0.imprimir();
		
		System.exit(0);
	}

}
