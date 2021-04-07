
package switchcase;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SwitchCaase {

  
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi;
        System.out.println("sayi girin");
       sayi=scn.nextInt();
       switch(sayi){
           case 0;
               System.out.println("sıfır");
             break;
           case 1;
               System.out.println("bir");
               break;
           case 2;
                System.out.println("iki");
                break;    
           default;
                System.out.println("sıfır ile üç arasında değil");
                        
       }
       //break ve default unutma
        
    }
