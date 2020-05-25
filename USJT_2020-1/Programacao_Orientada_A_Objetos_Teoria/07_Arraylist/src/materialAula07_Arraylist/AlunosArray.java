package materialAula07_Arraylist;

import java.util.ArrayList;

public class AlunosArray {
	
	private ArrayList<Alunos> alunosArray;
	
	//CONSTRUTOR
	public AlunosArray()
	{
		alunosArray = new ArrayList<>();
	}
	
	//M�TODO INSERIR
	public void inserir(Alunos alunos)
	{
		alunosArray.add(alunos);
	}
	
	public void remover(String nome)
		{ 
			int posicao = buscarAlunos(nome);
			if(posicao >= 0) {
				alunosArray.remove(posicao);
		}
	}
/*	public void atualizar(String nome, String novoNome)
	{ int posicao = buscarAlunos(nome);
		if(posicao >= 0) {
			Alunos alunos;
			alunos.setNome(novoNome);
			alunosArray.set(posicao, alunos.setNome(novoNome));
		}
	}*/
	
	public int buscarAlunos(String nome)
	{
		for(int i = 0; i < alunosArray.size(); i++)
		{
			Alunos alunos = alunosArray.get(i);
			String nomes = alunos.getNome();
			if(nome.equalsIgnoreCase(nomes))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void listarAlunos()
	{
		for(int i = 0; i <alunosArray.size(); i++)
		{
			Alunos alunos = alunosArray.get(i);
			System.out.println("Nome: "+alunos.getNome()+"\nIdade: "+alunos.getIdade()+"\nRa: "+alunos.getRA());
		}
	}
}
