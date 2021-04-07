
package javaapplication6;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication6 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random rnd=new Random();
        int a,b,c,d,x,e;
        a=rnd.nextInt(10);
        b=rnd.nextInt(10);
        c=10*a+b;
        JOptionPane.showMessageDialog(null,c);
            System.out.println("ilk basamagı gir");
        x=scn.nextInt();
            System.out.println("ikinci basamagı gir");
        e=scn.nextInt();
        d=10*x+e;
        if(d==c)
            System.out.println("10.000$ kazandın");
        else if((10*e+x)== (10*a+b))
            System.out.println("3.000$ kazandın");
        else if(a==x || a==e || b==x ||b==e)
            System.out.println("1.000$ kazandın");
        
        else
            System.out.println("kazanamadın");
    }
    // || veya demek && ve demek
    
}
