package exercicioComplementarCondicionadorDeAr;

public class Usuario {

	public static void main(String[] args) {

		//1 - AUMENTAR A TEMPERATURA PARA 30 GRAUS (RECEBER MENSAGEM DE ERRO)
		
		//CRIANDO UM OBJETO COM O VALOR INICIAL DE (20) ESTABELECIDO NA CLASSE 'Termostato > temperatura (20)'
		//LIGANDO CONDICIONADOR DE AR
		CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();
				
		//SE EXCLUIR A LINHA DE BAIXO, O CONDICIONADOR DE AR SER� DESLIGADO!!!
		condicionadorDeAr.ligar();
		
		//COLOCAR DENTRO DESSE 'if' O QUE DESEJA FAZER!
		if(condicionadorDeAr.getLigado() == true) {
		
			//OBJETO CRIADO!
			Termostato termostato = new Termostato();
			
			//MANDANDO O OBJETO CRIADO 'termostato' PARA A CLASSE 'CondicionadorDeAr', ONDE SER� MANIPULADO SEUS ATRIBUTOS.
			condicionadorDeAr.aumentarTemperatura(termostato);
			
			//AP�S A MANIPULA��O DO OBJETO, BASTA PEGAR O NOVO VALOR ATRIBU�DO A VARI�VEL 'Termostato > temperatura (20)'
			termostato.getTemperatura();
			
			//REPETINDO O PROCESSO AT� TENTAR CHEGAR NA TEMPERATURA 30 E APRESENTAR ERRO.
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
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			condicionadorDeAr.aumentarTemperatura(termostato);
			termostato.getTemperatura();
			
			
			//REDUZIR A TEMPERATURA PARA 10 GRAUS (RECEBER MENSAGEM DE ERRO)
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
			
						
			//AUMENTAR A TEMPERATURA PARA 25 GRAUS E IMPRIMIR A TEMPERATURA.
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
			
			
			//IMPRIMIR A TEMPERATURA
			System.out.println(condicionadorDeAr.imprimirTemperatura(termostato));
			
			
		}else if(condicionadorDeAr.getLigado() == false) {
			
			System.out.println("Condicionador de AR est� desligado!!!");
			
		}

	}

}
