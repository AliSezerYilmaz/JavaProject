
package javaapplication21;


public class JavaApplication21 {


    
    public static void main(String[] args) {
        String sifre="";
        int rakam,secim;
        char karakter = 0;
        for(int i = 0; i<8;i++){
            secim =1+ (int)(Math.random()*3);
        if (secim==1){
            karakter = (char)(97 +(Math.random()*26));
            sifre+=karakter;
        }
            else if (secim==2){
            karakter = (char)(65 +(Math.random()*26));
            sifre+=karakter;
            }
            else{
            rakam = (int)(Math.random()*10);
            sifre+=rakam;
            
            }
        
        }
        System.out.println(sifre);
                
    }
    
}
