package exercicioComplementarCondicionadorDeAr;

//ESSA � UMA CLASSE APENAS PARA TESTE!!!!
//FAVOR ANALISAR A CLASSE 'Usuario.java' REFERENTE AOS PROCESSOS DAS DEMAIS CLASSES!!!


public class Teste {

	public static void main(String[] args) {
		
		//CRIANDO UM OBJETO COM O VALOR INICIAL DE (20) ESTABELECIDO NA CLASSE 'Termostato > temperatura (20)'
		//LIGANDO CONDICIONADOR DE AR
		CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();
		
		//SE EXCLUIR A LINHA DE BAIXO, O CONDICIONADOR DE AR SER� DESLIGADO!!!
		condicionadorDeAr.ligar();
		
		
		if(condicionadorDeAr.getLigado() == true) {
			
			//OBJETO CRIADO!
			Termostato termostato = new Termostato();
				
			//OBJETO CRIADO COM O VALOR DE (20), BASTA PASSAR O OBJETO PARA O M�TODO 'condicionadorDeAr.aumentarTemperatura' ONDE A VARI�VEL SER� MANIPULADA/PROCESSADA.
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			
			//AP�S A MANIPULA��O DA VARI�VEL, BASTA PEGAR O NOVO VALOR ATRIBU�DO A VARI�VEL 'Termostato > temperatura (20)'
			termostato.getTemperatura();	
			
			//PEGANDO O NOVO VALOR ATRIBU�DO NA CLASSE Termostato > temperatura (21) E MANDANDO PARA SER TRATADO NA CLASSE 'condicionadorDeAr'
			condicionadorDeAr.aumentarTemperatura(termostato);
			//AP�S A MANIPULA��O DA VARI�VEL, BASTA PEGAR O NOVO VALOR ATRIBU�DO A VARI�VEL 'Termostato > temperatura (21)'
			termostato.getTemperatura();	
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();	
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			//condicionadorDeAr.aumentarTemperatura(termostato);
			//termostato.getTemperatura();
			
			//condicionadorDeAr.aumentarTemperatura(termostato);
			//termostato.getTemperatura();
			
			
			
			//REDUZINDO TEMPERATURA	- FUNCIONANDO!!!!!
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.reduzirTemperatura(termostato);
			termostato.getTemperatura();
			
			//condicionadorDeAr.reduzirTemperatura(termostato);
			//termostato.getTemperatura();
			
			//condicionadorDeAr.reduzirTemperatura(termostato);
			//termostato.getTemperatura();
			
			//condicionadorDeAr.reduzirTemperatura(termostato);
			//termostato.getTemperatura();
			
			//IMPRIMIR DADOS
			System.out.println(condicionadorDeAr.imprimirTemperatura(termostato));
			
			
		}else if(condicionadorDeAr.getLigado() == false) {
			
			System.out.println("Condicionador de AR est� desligado!!!");
			
		}
	}

}
