package aula07_02;

import java.util.ArrayList;

public class BlocoDeNotas {

	private ArrayList<String> notas;
	
	//CONTRUTOR
	public BlocoDeNotas() {
		
		setNotas(new ArrayList<>());//<> COLOCAR DENTRO A CLASSE QUE VAI PERCORRER
		
	}
	
	
	//M�TODO QUE (ADICIONA) NA VARI�VEL 'AMIGO' DO CONSTRUTOR
	public void inserir() {
			
		
			
	}

	//M�TODO (BUSCAR)
	private int buscar(String nome) {
		
		return buscar(nome);
	}

	//M�TODO QUE (REMOVE) NA VARI�VEL 'AMIGO' DO CONSTRUTOR
	public boolean remover(String nome) {
			
		int posicao = buscar(nome);
			
		if (posicao >= 0) {
				
			//.remove(posicao);NOME DA CLASSE
			return true;
				
		} else {
				
			return false;
		}
			
	}
	
	//M�TODO QUE IMPRIMI DADOS PASSADOS PARA AS VARI�VEIS
	public String toString() {
		
		return "[Nome: " + nome + "] [Sexo: " + sexo + "] [Idade: " + idade + "]\n[Mensagem: " + mensagem + "]";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	//GETTER E SETTER
	public ArrayList<String> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<String> notas) {
		this.notas = notas;
	}
			
	
}
