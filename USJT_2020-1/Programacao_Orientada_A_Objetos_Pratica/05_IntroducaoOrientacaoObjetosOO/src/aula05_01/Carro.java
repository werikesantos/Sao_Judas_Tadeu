package aula05_01;

public class Carro {
	
	private String marca;
	private String modelo;
	private String cor;
	private int anoDeFabricacao;
	private double preco;
	private boolean zero;
	
	//==============# CONSTRUTOR #===================
	public Carro(String marca,String modelo,String cor,int anoDeFabricacao,double preco,boolean zero) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.preco = preco;
		this.zero = zero;
	}
	
	//===============# M�TODOS #=====================
	//M�todo IMPRIMIR
	public void imprimir() {
		System.out.println("======$-CARROS_�_VENDA-$=======\n"+"Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nCor: "+getCor()+"\nAno: "+getAnoDeFabricacao()+"\nPre�o: R$ "+getPreco()+"\n");
	}
	
	//M�todo Status
	public void status() {
		
		if(zero == true) {
			System.out.println("O carro � novo!\n===============================\n");
		}else {
			System.out.println("O carro � usado!\n===============================\n");
		}
	}
	
	//===============# SETTER_GETTER #===============
	//Acessor MARCA
	public String getMarca() {
		return this.marca;
	}
	
	//Modificador MARCA
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//===============================================
	//Acessor MODELO
	public String getModelo() {
		return this.modelo;
	}
	
	//Modificador MODELO
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//===============================================
	//Acessor COR
	public String getCor() {
		return this.cor;
	}
	
	//Modificador COR
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//===============================================
	//Acessor ANO DE FABRICA��O
	public int getAnoDeFabricacao() {
		return this.anoDeFabricacao;
	}
	
	//Modificador ANO DE FABRICA��O
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	
	//===============================================
	//Acesor PRE�O
	public double getPreco() {
		return this.preco;
	}
	
	//Modificador PRE�O
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//===============================================
	//Acesso ZERO
	public boolean getZero() {
		return this.zero;
	}
	
	//Modificador ZERO
	public void setZero(boolean zero) {
		this.zero = zero;			
	}
	
}
