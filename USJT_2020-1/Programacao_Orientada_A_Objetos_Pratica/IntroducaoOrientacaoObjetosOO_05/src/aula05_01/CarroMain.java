package aula05_01;

public class CarroMain {
	
	/* Randori
	 * 
	 * 2) Criar a classe Carro com os atributos marca, modelo e cor, todos String. E tamb�m um
	 * atributo anoDeFabricacao, do tipo int, um atributo pre�o, do tipo double e outro do tipo
	 * boolean chamado zero (que indica se o carro � zero ou usado). Fa�a o construtor que receba
	 * todos os par�metros para se instanciar um carro, os m�todos de acesso e os modificadores.
	 * Crie uma classe CarroMain com o m�todo main que instancie um objeto Carro e imprima seus atributos.
	 * 
	 */
	
	public static void main(String[] args) {

		Carro carro = new Carro("Hyundai","HB20","Prata",2020,70.999,true);
		
		carro.imprimir();
		
		carro.status();
		
		//===========================================================================
		
		Carro carro0 = new Carro("Toyota","Corolla","Azul",2020,102.990,false);
		
		carro0.imprimir();
		
		carro0.status();

		
		System.exit(0);
	}

}
