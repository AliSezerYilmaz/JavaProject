
package javaapplication18;


public class JavaApplication18 {
     public static int toplamBul(int s1, int s2) {
       if(s1>s2){
       return -1;
       else{
               int sonuc=0;
               for(int i=s1;i<=s2;i++)
                   sonuc+=i;
              return sonuc; }
       }
        }
        

    }
   
    public static void main(String[] args) {
        System.out.println("sonuc= "+toplamBul(5,2));

       
    }
    
}
