import java.util.Scanner;
public class soru1 {
    public static void main(String[] args) {
    int gelen;
        System.out.println("Lütfen işlem yapmak isediğiniz sayıyı giriniz");
    Scanner gr=new Scanner(System.in);
    gelen =gr.nextInt();
    System.out.println(cozum(gelen));

    }   static int cozum(int x){
        if (x==0)
            return 0;
        else{
             return cozum(x-1)+(x*x);
    }


    }
}
