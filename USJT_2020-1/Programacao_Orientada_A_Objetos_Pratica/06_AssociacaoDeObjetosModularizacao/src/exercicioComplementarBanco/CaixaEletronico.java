package exercicioComplementarBanco;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		/*
		 * e) Para testar fa�a uma classe CaixaEletronico, que ir� conter o m�todo main. 
		 * No main instancie um cliente com os seguintes dados:
		 * 
		 * Nome: Ademar Apior
		 * CPF: 123231518-12
		 * Conta Corrente: 1234 D�gito: 4
		 * Agencia: 7890 D�gito: 5
		 * Saldo Inicial: 150.00
		 * Opera��es:
		 * - sacar 140.0 (sucesso)
		 * - consultar saldo (resultado � 10.0)
		 * - sacar 200.0 (falha)
		 * - consultar saldo (resultado � 10.0)
		 * - depositar 25.45 (sucesso)
		 * - imprimir saldo (al�m dos dados de cliente, conta e agencia, o saldo deve ser 35.45)
		 * 
		 */
		
		Agencia agencia = new Agencia("Bradesco ",7890, 5);
		
		ContaCorrente contaCorrente = new ContaCorrente(1234, 4, agencia, 150);
		
		Cliente cliente = new Cliente("Ademar Apior", "123231518-12", contaCorrente);
		
		System.out.println("Cliente: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + "\nConta Corrente: " + contaCorrente.getNumero() + " D�gito: " + contaCorrente.getDigito() + "\nAgencia: " + agencia.getNumero() + " D�gito: " + agencia.getDigito() + "\n\n*Opera��es*\nSaldo Inicial: " + contaCorrente.getSaldo());
		
		//M�TODO DE SAQUE DE DINHEIRO
		System.out.println(contaCorrente.sacar(140));
		//M�TODO DE CONSULTAR O SALDO EM CONTA
		System.out.println("Consultar Saldo: R$" + contaCorrente.consultarSaldo());		
		//M�TODO DE SAQUE DE DINHEIRO COM ERRO!
		System.out.println(contaCorrente.sacar(200));
		//M�TODO DE SAQUE DE DINHEIRO COM ERRO!
		System.out.println("Consultar Saldo: R$" + contaCorrente.consultarSaldo());	
		//M�TODO DE DEPOSITO
		System.out.println(contaCorrente.depositar(25.45));
		System.out.println("Consultar Saldo: R$" + contaCorrente.consultarSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		ContaCorrente contaCorrente = new ContaCorrente();
		
		/*
		contaCorrente.depositar(10.0);
		contaCorrente.depositar(30.0);
		contaCorrente.depositar(10.0);
		
		System.out.println(contaCorrente.getSaldo());
		
		
		
		System.out.println(contaCorrente.getSaldo());
		
		contaCorrente.imprimirSaldo();
		
		JOptionPane.showMessageDialog(null, contaCorrente.consultarSaldo());
			
		
		
		System.out.println(contaCorrente.getNumero());
		
		int digitos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 4 n�meros"));
		
		if(digitos > 0) {
			
			contaCorrente.setDigito(digitos);
			System.out.println(contaCorrente.getDigito());
			
		}else {
			
			System.out.println("Digite apenas n�meros POSITIVOS!!!");
			
		}
		
		*/
	}
	

}
