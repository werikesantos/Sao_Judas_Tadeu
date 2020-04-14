package aula07_00;

//Esta classe modela um produto a ser comprado no "emporium".

public class Produto {
	
	// atributos: vari�veis que armazenam os dados de um objeto, ap�s este ser instanciado.
	
	private String nome;
	private double precoUnitario; // em reais
	private double quantidade; // em quilogramas

	/* m�todo construtor: usado para inicializar os atributos,
	 * quando um objeto cliente � criado (instanciado). Notar que o construtor
	 * faz chamada interna de dois m�todos modificadores.
	 */
	
	public Produto(String nome, double precoUnitario, double quantidade) {
		this.nome = nome;
		setPrecoUnitario(precoUnitario);
		setQuantidade(quantidade);
	}

	// m�todos de acesso: usados para retornar o valor de um atributo.
	public String getNome() {
		return nome;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public double getQuantidade() {
		return quantidade;
	}

	// m�todos modificadores: usados para alterar o valor de um atributo, depois que o objeto foi criado (instanciado).
	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public void setPrecoUnitario(double novoPreco) {
		if (novoPreco <= 0) {
			precoUnitario = 1.0;
		} else {
			precoUnitario = novoPreco;
		}

	}

	public void setQuantidade(double novaQuantidade) {
		if (quantidade < 0) {
			quantidade = 1.0;
		} else {
			quantidade = novaQuantidade;
		}
	}

	// outros m�todos

	// O m�todo abaixo retorna uma String, que cont�m os valores dos atributos do objeto, mais a quantidade vezes o pre�o unit�rio.
	public String gastoComProduto() {
		return String.format("%16s R$%14.2f %10.2f R$%14.2f\n", nome, precoUnitario, quantidade,
				quantidade * precoUnitario);
		/*
		 * "Produto: " + nome + "   " + "Pre�o Unit�rio: R$ " + precoUnitario +
		 * " / kg   " + "Quantidade: " + quantidade + " kg   " + "Total: R$ " +
		 * quantidade*precoUnitario + "\n";
		 */
	}
}