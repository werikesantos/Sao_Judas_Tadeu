package aula07_00;

public class TesteEmporium {

	public static void main(String[] args) {
		
		//CRIAR OBJETO CARRINHO
		Carrinho carrinho = new Carrinho();
		
		//M�TODO COLOCAR PRODUTO NO CARRINHO
		carrinho.colocarProdutoNoCarrinho("carne", 40.50, 1.0);
		carrinho.colocarProdutoNoCarrinho("arroz", 10.00, 1.0);
		carrinho.colocarProdutoNoCarrinho("feij�o", 12.00, 1.0);
		carrinho.colocarProdutoNoCarrinho("macarr�o", 05.00, 1.0);

	}

}
