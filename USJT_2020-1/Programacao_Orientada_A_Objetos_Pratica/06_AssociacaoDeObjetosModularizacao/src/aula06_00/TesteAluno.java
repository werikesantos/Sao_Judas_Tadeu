package aula06_00;

import javax.swing.JOptionPane;

public class TesteAluno {
	
	// cadastrar um novo aluno no metodo main
	public static void main(String[] args) {
		
		/* Associa��o de Objetos - Modulariza��o
		 * 
		 * Exemplo Resolvido: Junto com seu professor, copie o c�digo, cole no JGrasp; 
		 * analise o c�digo e entenda-o, depois execute-o para ver os resultados.
		 * Ex1)
		 * a. Crie a Classe Turma, com atributos privados codigo, do tipo String, e ano, do tipo int. 
		 * Crie um construtor que receba par�metros para inicializar os atributos e os m�todos de acesso e m�todos modificadores.
		 * b. Altere a classe Aluno criada na semana passada para que tenha tamb�m um atributo privado turma do tipo Turma. 
		 * Altere o construtor para receber um par�metro que inicialize o novo atributo e crie o m�todo de acesso 
		 * e o modificador para este novo atributo.
		 * c. Crie m�todos getDados em ambas as classes que retornam strings com o valor dos atributos.
		 * d. Altere a classe TesteAluno feita na semana passada para tratar este o novo atributo da classe Aluno.
		 * 
		 */
		

		// coletando os dados do aluno a ser cadastrado
		
		String nome = JOptionPane.showInputDialog("Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		// pega o primeiro caracter da String e retorna como char
		char sexo = JOptionPane.showInputDialog("Sexo M/F").charAt(0);
		String codigo = JOptionPane.showInputDialog("Codigo da Turma");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano da Turma"));
		
		//cria a turma
		Turma turma = new Turma(codigo, ano);
		
		// cria um objeto aluno
		Aluno aluno = new Aluno(nome, idade, peso, sexo, turma);
		
		// nao precisa mais montar a string de saida, e so chamar o metodo getDados
		
		// mostra o aluno
		JOptionPane.showMessageDialog(null, aluno.getDados());
		
		// altera informacoes; nao precisa criar todas as variaveis novamente
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		// tem que digitar true ou false
		boolean formando = Boolean.parseBoolean(JOptionPane.showInputDialog("E' formando?true/false"));
		
		// muda usando os metodo modificadores
		aluno.setIdade(idade);
		aluno.setPeso(peso);
		aluno.setFormando(formando);
		
		// mostra novamente o cadastro do aluno
		
		// mostra o aluno
		JOptionPane.showMessageDialog(null, aluno.getDados());
		
		/* ANOTA��O:
		 * 
		 * Note que h� trechos com c�digo repetido foram substitu�dos pelos m�todos getDados.
		 * Este � um exemplo de modulariza��o. Outro exemplo � o pr�prio fato de separar o c�digo
		 * em 3 classes diferentes, cada uma com papeis distintos.
		 * 
		 */
		
	}
}