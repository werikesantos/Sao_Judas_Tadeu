package aula01;

public class Exe04_Concatenacao {

	public static void main(String[] args) {
		
		//CONCATENA��O DE STRING
		int g = 10;
		String x = "Bom";
		
		x = x + " Dia"; //O CONTE�DO DE 'x' AGORA � "Bom Dia"
		
		x = x + ", " + g; //AGORA 'x' VALE "Bom Dia, 10"
		
		//MOSTRANDO O RESULTADO NO CONSOLE
		System.out.println(x);

	}

}
