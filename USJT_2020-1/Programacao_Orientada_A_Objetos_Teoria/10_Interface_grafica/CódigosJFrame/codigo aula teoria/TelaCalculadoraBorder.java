import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalculadoraBorder extends JFrame implements ActionListener{

   private JButton botao; // botao
   private JTextField texto; //campo texto de uma linha
   private JLabel etiqueta; //etiqueta de nome do campo
   
   public TelaCalculadoraBorder(){
   //chamar construtor da superclasse e configurar o titulo
      super("Calculadora");
      //instanciar os widgets
      botao = new JButton("Soma");
      texto = new JTextField("0", 10);
      etiqueta = new JLabel("Valor: ");
      //pega o container (ou painel)
      Container caixa = getContentPane();
      //configura o gerenciador de layout
      caixa.setLayout(new BorderLayout());
      caixa.add(etiqueta, BorderLayout.WEST);
      caixa.add(texto, BorderLayout.CENTER);
      caixa.add(botao, BorderLayout.SOUTH);
      //registra este objeto como listener
      botao.addActionListener(this);
      //configura ajustes finais
      //configura o tamanho inicial da tela
      setSize(200,100);
      //encerra a aplicacao quando clica o xis
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //torna a janela visivel
      setVisible(true); 
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource()==botao){
         int valor = Integer.parseInt(texto.getText());
         valor+=10;
         texto.setText(""+valor);
      }
   }
}