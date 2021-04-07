
package hw2;

import java.util.Random;
import javax.swing.JOptionPane;

public class HW2 {

    public static void main(String[] args) {
      
        Random rnd=new Random();
        int n1,n2;
        n1=rnd.nextInt(10);
        n2=rnd.nextInt(10);
        if(n1>n2){
           String question = String.format("What is"+"%d - %d ?", n1,n2);
            String answer = JOptionPane.showInputDialog(null,question,"Soru", JOptionPane.QUESTION_MESSAGE);
            if(Integer.parseInt(answer) == (n1-n2))
                JOptionPane.showMessageDialog(null, "cevap doğru");
            else
                JOptionPane.showMessageDialog(null, "cevap yanlış");
        }
    else
            JOptionPane.showMessageDialog(null, "number1 number2den kucuk");
}
