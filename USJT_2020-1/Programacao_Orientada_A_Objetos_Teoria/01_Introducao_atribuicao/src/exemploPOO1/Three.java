package exemploPOO1;

import javax.swing.JOptionPane;

public class Three {
	
	private int dia;
	private int mes;
	private int ano;
	
	//CONSTRUTOR
	public Three() {
				
			
				
	}
		
	//M�TODO: LEIA 3 N�MEROS QUE REPRESENTA O DIA, M�S E ANO.
	public void data() {
		
		setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:")));
		setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s:")));
		setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:")));
		
		JOptionPane.showMessageDialog(null, (getDia() + "/" + getMes() + "/" + getAno() + "."));
				
	}
	
	//GETTER AND SETTER
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
