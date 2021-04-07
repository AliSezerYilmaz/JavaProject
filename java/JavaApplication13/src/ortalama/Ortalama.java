
package ortalama;

import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {
        int vize,f;
        double ortalama;
        Scanner gir=new Scanner(System.in);
        System.out.println("vize notunu giriniz");
        vize=gir.nextInt();
        System.out.println("final notunu giriniz");
        f=gir.nextInt();
        ortalama=(vize*0.4)+(f*0.6);
        System.out.println("Ortalama = " +ortalama);
        if(ortalama>=84 && ortalama<=100)
            System.out.println("AA");
        else if(ortalama<=83 && ortalama>=77)
            System.out.println("AB");
        else if(ortalama<=76 && ortalama>=71)
            System.out.println("BA");
        else if(ortalama<=70 && ortalama>=66)
            System.out.println("BB");
        else if(ortalama<=65 && ortalama>=61)
            System.out.println("BC");
        else if(ortalama<=60 && ortalama>=56)
            System.out.println("CB");
        else if(ortalama<=55 && ortalama>=50)
            System.out.println("CC");
        else if(ortalama<=49 && ortalama>=46)
            System.out.println("CD");
        else if(ortalama<=45 && ortalama>=40)
            System.out.println("DC");
        else if(ortalama<=39 && ortalama>20
                =33)
            System.out.println("DD");
        else
            System.out.println("FF");
                    
}
