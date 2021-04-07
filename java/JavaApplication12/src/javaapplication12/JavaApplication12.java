
package javaapplication12;

import java.util.Random;


public class JavaApplication12 {

 
    public static void main(String[] args) {
       Random rnd=new Random();
       int sayi1,sayi2;
       sayi1=rnd.nextInt(10);
       sayi2=rnd.nextInt(10);
        if(sayi1<sayi2)
            System.out.println("Sayı 1");
        else if(sayi1>sayi2)
            System.out.println("Sayı 2 ");
        else
            System.out.println("eşit");
    }
    
}
