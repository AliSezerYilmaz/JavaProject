
package javaapplication45;

import java.util.Random;
import java.util.Scanner;


public class Soru2 {

    
    public static void main(String[] args) {
       Random rnd=new Random();
       String yeni;
       String kontrol="e";
       int gelen;
       int sonuc;
       Scanner scn=new Scanner(System.in);
       int birincisayi,ikincisayi;
       boolean a=true;
       do{
       birincisayi=rnd.nextInt(4)+2;
       ikincisayi=rnd.nextInt(3)+2;
       sonuc = (int) Math.pow(birincisayi,ikincisayi);
           System.out.println(birincisayi+" sayisinin "+ikincisayi+". kuvveti nedir? ");
           gelen=scn.nextInt();
           if(sonuc==gelen){
               System.out.println("Tebrikler Bildiniz");
           }
           else{
               System.out.println("Üzgünüm Bilemediniz");
           }
           System.out.println("Tekrar Oynamak İster misiniz?(e/E) ");
           yeni=scn.next();
           if(yeni.equalsIgnoreCase(kontrol)){
           a=false;
           }
           else{
           break;
           }
           
       }while(a==false);
        
    }  
}
