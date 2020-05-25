package materialAula07;

//Esta classe modela o cliente que ir� fazer compras no "emporium".

public class Cliente {
	
	// atributos: armazenam os dados de um objeto, ap�s este ser instanciado.
	
	private String nome;
	private String cpf;

	/* m�todo construtor: usado para inicializar os atributos,
	 * quando um objeto cliente � criado (instanciado). Notar que o construtor
	 * faz chamada interna de dois m�todos modificadores.
	 */
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	// m�todos de acesso: usados para retornar o valor de um atributo.
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	// m�todos modificadores: usados para alterar o valor de um atributo, depois que o objeto foi criado (instanciado).
	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}