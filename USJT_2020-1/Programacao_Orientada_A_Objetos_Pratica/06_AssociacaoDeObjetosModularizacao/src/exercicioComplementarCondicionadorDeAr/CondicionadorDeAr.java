package exercicioComplementarCondicionadorDeAr;

public class CondicionadorDeAr {
	
	private Termostato termostato;
	private boolean ligado;
	
	//CONSTRUTOR
	public CondicionadorDeAr() {
		
		Termostato termostato = new Termostato();
		this.ligado = false;
		
	}

	//M�TODO "LIGAR"
	public boolean ligar() {
		
	 String sinal = "";
	
	 this.ligado = true;
	 
	  if(ligado == true) {
		  
	      sinal = "O Condicionador de Ar est� ligado!!!\n";
	      System.out.println(sinal);

	  }
		
		return this.ligado;
		
	}
	
	//M�TODO "DESLIGAR"
	public boolean desligar() {
			
		String sinal = "";
		
		 this.ligado = false;
		 
		  if(ligado == false) {
			  
		     sinal = "N�O";
		     System.out.println(sinal);

		  }		
		  
		  return this.ligado;
	}
	
	//M�TODO "AUMENTAR" TEMPERATURA                  VOLTAR PARA AJUSTAR!!!!!!!!!!!!
	public void aumentarTemperatura(Termostato termostato) {
		
		/*
		 * Crie um m�todo aumentarTemperatura, que aumenta a temperatura do termostato 
		 * em um grau cada vez que � chamado at� o limite de 28 graus.
		 * 
		 */
		
		if(termostato.getTemperatura() <= 28) {
			
			int temperatura = termostato.getTemperatura();
			
			temperatura++;
			
			System.out.println("Temperatura AUMENTADA: " + termostato.getTemperatura() + " Graus");
			
			termostato.setTemperatura(temperatura);	
			
		}else {
			
			System.out.println("Temperatura M�XIMA!");
			
		}
		
	}
		
	//M�TODO "REDUZIR" TEMPERATURA VOLTAR PARA AJUSTAR - TESTADO E FUNCIONANDO!!!!!!!!!!!
	public void reduzirTemperatura(Termostato termostato) {
			
		/*
		 * Crie um m�todo reduzirTemperatura que reduz a temperatura em um grau cada vez que � chamado at� o limite de 15 graus.
		 * 
		 */
		
		if(termostato.getTemperatura() > 15) {
			
			int temperatura = termostato.getTemperatura();
			
			temperatura--;
			
			termostato.setTemperatura(temperatura);
			
			System.out.println("Temperatura REDUZIDA: " + termostato.getTemperatura() + " Graus");
						
		}else {
			
			System.out.println("Temperatura M�XIMA!");
			
		}	
			
	}
	
	//M�TODO "IMPRIMIR" TEMPERATURA - TESTADO E FUNCIONANDO!!!!!!!!!!!
	public String imprimirTemperatura(Termostato termostato) {
				
		/*
		 * Crie um m�todo imprimirTemperatura que imprime a temperatura atual.
		 * 
		 */
		
		int term = termostato.getTemperatura();
		
		term--;
		
		return "\n*****************************\n==== CONDICIONADOR DE AR ====\n========== RESUMO ===========\n\nLIGADO: " + ligado + "\nTEMPERATURA ATUAL: "+ term +" Graus\n\n*****************************\n";
				
	}

	//GETTER
	public Termostato getTermostato() {
		return termostato;
	}

	public boolean getLigado() {
		return ligado;
	}
}
