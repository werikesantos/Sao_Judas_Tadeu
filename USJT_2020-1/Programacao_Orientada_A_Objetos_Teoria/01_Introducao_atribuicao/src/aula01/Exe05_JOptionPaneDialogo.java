package aula01;

//IMPORTANDO A CLASE RESPONS�VEL PELO M�TODO 'JOptionPane'
import javax.swing.JOptionPane;

public class Exe05_JOptionPaneDialogo {

	public static void main(String[] args) {
		
		//MOSTRA UMA CAIXA DE DI�LOGO QUE COLETA DADOS COM 'JOptionPane'
		String z = JOptionPane.showInputDialog("Digite seu nome:");
		
		//MOSTRANDO O CONTE�DO GUARDADO NA CAIXA DE DI�LOGO NO CONSOLE:
		System.out.println(z);
		
	}

}
