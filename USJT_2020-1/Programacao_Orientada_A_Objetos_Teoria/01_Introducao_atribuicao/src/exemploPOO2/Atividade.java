package exemploPOO2;

import javax.swing.JOptionPane;

public class Atividade {
	
	//ATIVIDADE 01
	private String palavra1;
	private String palavra2;
	private String palavra3;
	
	//CONSTRUTOR
	public Atividade() {
		
		
		
	}
	
	//M�TODO: "APRESENTA NA TELA NA ORDEM CONTR�RIA EM QUE FORAM DIGITADAS"
	public void ordemContraria() {
		
		setPalavra1(JOptionPane.showInputDialog("Digite a primeira palavra:"));
		setPalavra2(JOptionPane.showInputDialog("Digite a segunda palavra:"));
		setPalavra3(JOptionPane.showInputDialog("Digite a terceira palavra:"));
		
		JOptionPane.showMessageDialog(null, getPalavra3() + " " + getPalavra2() + " " + getPalavra1());
		
	}

	//GETTER AND SETTER
	public String getPalavra1() {
		return palavra1;
	}
	public void setPalavra1(String palavra1) {
		this.palavra1 = palavra1;
	}
	public String getPalavra2() {
		return palavra2;
	}
	public void setPalavra2(String palavra2) {
		this.palavra2 = palavra2;
	}
	public String getPalavra3() {
		return palavra3;
	}
	public void setPalavra3(String palavra3) {
		this.palavra3 = palavra3;
	}
	
	
	//ATIVIDADE 02
	int numero;
	
	//M�TODO: LEIA UM N�MERO INTEIRO E IMPRIMA: �O valor do n�mero digitado �: � 
	public void imprimir1() {
		
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro:")));
		
		JOptionPane.showMessageDialog(null, "O valor do n�mero digitado �: \n" + getNumero());
		
	}
	
	//GETTER AND SETTER
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	//ATIVIDADE 03
	private int dia;
	private int mes;
	private int ano;
		
	//M�TODO: LEIA 3 N�MEROS QUE REPRESENTA O DIA, M�S E ANO.
	public void data() {
		
		setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:")));
		setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s:")));
		setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:")));
		
		JOptionPane.showMessageDialog(null, (getDia() + "/" + getMes() + "/" + getAno() + "."));
				
	}
	
	//GETTER AND SETTER
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	//ATIVIDADE 04
	private double peso;
	
	//M�TODO: 
	public void seuPeso() {
		
		setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso")));
		
		JOptionPane.showMessageDialog(null, "O peso informado foi " + getPeso() + " kg.");
	
	}
	
	//GETTER AND SETTER	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//ATIVIDADE 05
	private char caracter;
		
	//M�TODO: LER CARACTER E IMPRIMIR A PALAVRA FORMADA.
	public void imprimirPalavra() {
		
		JOptionPane.showInternalMessageDialog(null,"Ser� aceito somente caracteres!", "ATEN��O!!!", 0, null);
		
		setCaracter(JOptionPane.showInputDialog("Digite dez caracteres, para formar uma palavra:").charAt(0));
		String palavra = Character.toString(getCaracter());
			
		for(int i = 0; i <= 8 ; i++) {
						
			setCaracter(JOptionPane.showInputDialog("Digite dez caracteres, para formar uma palavra:").charAt(0));
			palavra = palavra + Character.toString(getCaracter());
			
		}
			
		JOptionPane.showMessageDialog(null, "A palavra formada �: \n" + palavra);	
		
	}
	
	//GETTER AND SETTER
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	
	
	//ATIVIDADE 06
	int numeros;
	
	public void imprimir2() {
		
		setNumeros(JOptionPane.showInputDialog("Digite um n�mero:").charAt(0));
		String concatenar = Character.toString(getNumeros());
		
		for(int i = 0; i <= 2 ; i++) {
			
			setNumeros(JOptionPane.showInputDialog("Digite um n�mero:").charAt(0));
			concatenar = concatenar + Character.toString(getNumeros());
			
		}
		
		JOptionPane.showMessageDialog(null, "Numera��o formada: \n" + concatenar);
		
	}

	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
}
