package materialAula04;

import javax.swing.*;

//O programa se encerrar� quando for digitado o n�mero -999, caso contr�rio ele apresentar� o triplo do n�mero digitado e repetir� toda a a��o.

public class Kata2
{
   public   static   void main(String args[])
   {
      int   i;
      do
      {  
         String sI = JOptionPane.showInputDialog(null, "Digite um n�mero diferente de -999", "Kata 2", JOptionPane.QUESTION_MESSAGE);
         i = Integer.parseInt(sI);
         JOptionPane.showMessageDialog(null, "O triplo de i:" + i + " �:" + (3*i), "Kata 2", JOptionPane.PLAIN_MESSAGE);
      }while(i != -999);
      System.exit(0);
   }
}