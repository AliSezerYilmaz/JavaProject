
package helloworld;

import java.util.Scanner;

public class HelloWorld {

   
    public static void main(String[] args) {
     
        Scanner scn=new Scanner(System.in);
        int s1,s2;
        System.out.println("1. sayıyı gir");
        s1=scn.nextInt();
        System.out.println("2. sayıyı gir");
        s2=scn.nextInt();
        if(s1>s2)
            System.out.println("Sayi 1 buyuk");
        else if(s2>s1)
            System.out.println("Sayi 2 buyuk");
        else
            System.out.println("sayilar eşit");
       }
    
}
