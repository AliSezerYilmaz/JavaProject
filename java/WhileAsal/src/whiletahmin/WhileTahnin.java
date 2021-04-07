
package whiletahmin;

import java.util.Random;
import java.util.Scanner;


public class WhileTahnin {

 
    public static void main(String[] args) {
        Random rnd=new Random();
        Scanner scn=new Scanner(System.in);
                int tekrar = 0,sayi,tahmin;
                sayi=rnd.nextInt(100);
              tahmin=-1;
        while(sayi !=tahmin){
            System.out.println("Tahmininiz: ");
            tahmin=scn.nextInt();
            tekrar++;       
        
            if(tahmin>sayi)
                System.out.println("Daha aşağı");
            else if(tahmin<sayi)
                System.out.println("Daha yukarı");
            else
                System.out.println("tebrikler " + tekrar + ". denemdede buldun");
        }
    }
    
}
