package aula03;

//propositalmente sem acentos 
import javax.swing.JOptionPane;

public class Exe00_CreditoFuncionario {

	public static void main(String[] args) {
		
		/* Problema Resolvido:
		 * 
		 * A prefeitura de Rio dos Grilos abriu uma linha de cr�dito para os funcion�rios. 
		 * O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. 
		 * Fazer um algoritmo que permita entrar com o sal�rio bruto e o valor da presta��o e informar se o empr�stimo
		 * pode ou n�o ser concedido.
		 */
		
		//LER OS VALORES DO SAL�RIO E DO EMPRESTIMO
		String sSalario = JOptionPane.showInputDialog("Digite o valor do salario: ");
		String sPrestacao = JOptionPane.showInputDialog("Digite o valor da prestacao: ");
		
		//CONVERTER PARA REAL
		Double salario = Double.parseDouble(sSalario);
		Double prestacao = Double.parseDouble(sPrestacao);
		
		//CALCULAR RELA��O ENTRE PRESTA��O E SAL�RIO E IMPRIMIR
		Double relacao = 100.0 * prestacao / salario;
		JOptionPane.showMessageDialog(null, "Relacao entre parcela e sal�rio: " + relacao + "%");
		
		//TESTAR A CONDI��O E INFORMAR O RESULTADO
		if (relacao > 30) {
			
			JOptionPane.showMessageDialog(null, "O valor de parcela excede 30% do" + " salario");
			JOptionPane.showMessageDialog(null, "Emprestimo negado.");
			
		}else
			
			JOptionPane.showMessageDialog(null, "Emprestimo concedido.");
	}

}
