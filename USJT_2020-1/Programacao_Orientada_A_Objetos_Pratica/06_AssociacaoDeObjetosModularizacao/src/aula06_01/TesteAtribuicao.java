package aula06_01;

import javax.swing.JOptionPane;

public class TesteAtribuicao {

	public static void main(String[] args) {
			
		//SOLICITANDO DADOS
		String nomeProfessor;
		nomeProfessor = JOptionPane.showInputDialog(null, "Digite o nome:","CADASTRO DE PROFESSOR",JOptionPane.PLAIN_MESSAGE);
		int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade:","CADASTRO DE PROFESSOR",JOptionPane.PLAIN_MESSAGE));
		String nomeDisciplina = JOptionPane.showInputDialog(null, "Mat�ria:","CADASTRO DE DISCIPLINA",JOptionPane.PLAIN_MESSAGE);
		boolean praticaDisciplina = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "true OR false","MAT�RIA PR�TICA:",JOptionPane.PLAIN_MESSAGE));
		
		//INST�NCIA DE PROFESSOR
		Professor professor = new Professor(nomeProfessor, idadeProfessor);
		
		//INST�NCIA DE DISCIPLINA
		Disciplina disciplina = new Disciplina(nomeDisciplina, praticaDisciplina);
		
		//INST�NCIA ATRIBUI��O
		Atribuicao atribuicao = new Atribuicao(professor, disciplina);
		
		//IMPRIMINDO DADOS PELA CLASSE 'Atribuicao'
		atribuicao.getDados();
	
	}

}
