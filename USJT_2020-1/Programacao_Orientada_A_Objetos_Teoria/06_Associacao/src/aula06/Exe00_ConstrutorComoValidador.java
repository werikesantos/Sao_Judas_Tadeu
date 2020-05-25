package aula06;

public class Exe00_ConstrutorComoValidador {

		/* ANOTA��O:
		 * 
		 * COMO UTILIZAR O CONSTRUTOR COMO UM VALIDADOR DE DADOS!
		 * 
		 * SEGUE O EXEMPLO ABAIXO:
		 * 
		 */

		private String nome;
		private int idade;
		
		//CONSTRUTOR VALIDADOR DE DADOS!
		public Exe00_ConstrutorComoValidador(String nome, int idade) {
			
			//EST� � A FORMA PARA VALIDAR OS DADOS PASSADOS PELO M�TODO 'SET'
			setNome(nome);
			setIdade(idade);
		}
		
		//M�TODO ALTERADOR
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		//M�TODO DE MODIFICADOR
		public String getNome() {
			return this.nome;
		}
		
		//M�TODO ALTERADOR
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		//M�TODO DE MODIFICADOR
		public int getIdade() {
			return this.idade;
		}

}
