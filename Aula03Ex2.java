import javax.swing.JOptionPane;

public class Aula03Ex2 {
   public static void main (String arg[]){
      int n1, n2, n3;
      n1 = Integer.parseInt(JOptionPane.showInputDialog ("digite primeiro numero:"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog ("digite segundo numero:"));
      n3 = n1 + n2;
      if (n3 <= 20){
         n3 = n3 - 5;
         JOptionPane.showMessageDialog (null, n3);
      }
      else{
         JOptionPane.showMessageDialog (null, "e maio que 20");
      }      
   }
}