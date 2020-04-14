package aula07_00;

//Classe usada para modelar um carrinho de supermercado

import java.util.ArrayList; // importa a classe ArrayList

public class Carrinho {
	
	// atributos: vari�veis que armazenam os dados de um objeto, ap�s este ser instanciado.
	private ArrayList<Produto> produtosEscolhidos;

	/* m�todos construtores: usado para inicializar os atributos,
	 * quando um objeto cliente � criado (instanciado). Notar que o construtor
	 * faz chamada interna de dois m�todos modificadores.
	 * 
	 */
	
	public Carrinho() {
		produtosEscolhidos = new ArrayList<>();
	}

	// outros m�todos

	/*
	 * Este m�todo deve ser executado uma vez para cada produto colocado no
	 * carrinho. Para cada produto, escrever o nome (exemplo: "arroz"), o pre�o
	 * unit�rio por kg (em reais) e a quantidade de produto (em kg).
	 */

	public void colocarProdutoNoCarrinho(String nomeProduto, double precoProduto, double quantidadeProduto) {
		Produto novoProduto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
		produtosEscolhidos.add(novoProduto);
	}

	/*
	 * Este m�todo percorre a Lista de Produtos (usando um for-each), armazenada em
	 * um ArrayList. Colhe os valores dos atributos de cada objeto da lista e os
	 * concatena numa String (saida). Calcula tamb�m o total em reais gasto nas
	 * compras, concatenando-o na mesma String. Depois, retorna essa String.
	 */

	public String listaDeProdutos() {
		
		// monta o cabe�alho da tabela
		
		String saida = String.format("%16s %16s %10s %16s\n", "Produto", "Pre�o Unit�rio", "Quantidade", "Total");
		saida += String.format("%16s %16s %10s %16s\n", "----------------", "----------------", "----------",
				"----------------");
		double soma = 0.0;

		for (Produto produto : produtosEscolhidos) {
			saida += produto.gastoComProduto();
			soma += produto.getQuantidade() * produto.getPrecoUnitario();
		}
		if (pesoDoCarrinho() > 50.0) {
			soma *= 0.88;
			
			/*
			 * necessario transformar o % do 12% em token e depois trocar para % pq o % �
			 * confundido com token na hora da execu��o do c�digo
			 */
			
			saida += String.format("\n\nDesconto de 12%1s pois o peso � %-5.2f kg.", "%", pesoDoCarrinho());
		} else {
			saida += String.format("\n\nSem desconto de 12%1s pois o peso � %-5.2f kg.", "%", pesoDoCarrinho());
		}
		saida += String.format("\n\nTotal a Pagar: R$ %-14.2f", soma);

		return saida;

	}

	public void removerProdutoDoCarrinho(int posicao) {
		if (posicao >= 0 && posicao < produtosEscolhidos.size()) {
			produtosEscolhidos.remove(posicao);
		}
	}

	/*
	 * remove somente a primeira ocorr�ncia encontrada
	 */
	
	public void removerProdutoDoCarrinho(String nome) {
		removerProdutoDoCarrinho(busca(nome));
	}

	/*
	 * remove todas as ocorr�ncias encontradas
	 */
	
	public void removerVariosProdutosDoCarrinho(String nome) {
		int posicao = busca(nome);
		while (posicao >= 0) {
			removerProdutoDoCarrinho(busca(nome));
			posicao = busca(nome);
		}
	}

	/*
	 * remove todas as ocorr�ncias encontradas de modo mais eficiente
	 */
	
	public void removerVariosProdutosDoCarrinhoMaisEficiente(String nome) {
		for (int i = produtosEscolhidos.size() - 1; i >= 0; i--) {
			if (nome.equals(produtosEscolhidos.get(i).getNome())) {
				produtosEscolhidos.remove(i);
			}
		}
	}

	public int busca(String nome) {
		for (int i = 0; i < produtosEscolhidos.size(); i++) {
			if (nome.equals(produtosEscolhidos.get(i).getNome())) {
				return i;
			}
		}
		return -1; // se n�o encontrar
	}

	public double pesoDoCarrinho() {
		double peso = 0.0;

		for (Produto produto : produtosEscolhidos) {
			peso += produto.getQuantidade();

		}

		return peso;
	}
}