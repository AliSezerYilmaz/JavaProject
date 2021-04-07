import java.util.Random;
import java.util.Scanner;
public class soru2 {
      public static int[] sirala(int[] dizi){ 
        int n = dizi.length; 
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++) {
                if (dizi[j] > dizi[j+1]) 
                { 
                    int temp = dizi[j]; 
                    dizi[j] = dizi[j+1]; 
                    dizi[j+1] = temp; 
                } 
            }
        }
        return dizi;
    }
    public static boolean kontrolDogrumu(int[] kolon){
       int sayac = 0;
       for(int i=0;i<5;i++){
           if(sayac >2){
               return true;
           }
           sayac = 0;
           for(int k=0;k<kolon.length;k++){
               switch(i){
                   case 0:
                       if(kolon[k]>=1 && kolon[k]<=10){
                           sayac++;
                       }
                       break;
                    case 1:
                       if(kolon[k]>=11 && kolon[k]<=20){
                           sayac++;
                       }
                       break;
                    case 2:
                       if(kolon[k]>=21 && kolon[k]<=30){
                           sayac++;
                       }
                       break;
                    case 3:
                       if(kolon[k]>=31 && kolon[k]<=40){
                           sayac++;
                       }
                       break;
                    case 4:
                       if(kolon[k]>=41 && kolon[k]<=49){
                           sayac++;
                       }
                       break;
               }
           }
       }
       return false;
   }
    
    public static void main(String[] args) {
        int l=2;
        int[] tek=new int [25]; 
        int[] cift=new int [25];
           for (int j = 0; j < 25; j++) {
            tek[j]=2*j+1;
        }
           for(int c=0 ;c<25;c++){
               cift[c]=l;
              l=l+2;
          }  
        int teksize = tek.length;
        int ciftsize = cift.length; 
        int kolonSayisi = 0; 
        int[] kolon = {0,0,0,0,0,0}; 
        boolean kolonKontrol = true; 
        boolean kolonSayisiKontrolu = true;
        while(kolonSayisiKontrolu){
            kolonSayisiKontrolu = false;
            System.out.println("Kaç kolon oynamak istersiniz?");
            Scanner s = new Scanner(System.in);
            kolonSayisi = s.nextInt();
            if(kolonSayisi<1 || kolonSayisi>8){
                System.out.println("Lütfen 1 ile 8 arasında bir değer girin");
                kolonSayisiKontrolu = true;
            }
        }
        for(int i=0;i<kolonSayisi;i++){
            kolonKontrol = true; 
            while(kolonKontrol){
                kolonKontrol = false;
                for(int j=0;j<3;j++){
                Random tra = new Random();
                Random cra = new Random();
                int rand_int1 = tra.nextInt(teksize);
                int rand_int2 = cra.nextInt(ciftsize);
                kolon[j] = tek[rand_int1];
                kolon[j+3] = cift[rand_int2];
                for(int a=rand_int1;a<teksize-1;a++){
                    tek[a] = tek[a+1];
                }
                teksize--;
                for(int b=rand_int2;b<ciftsize-1;b++){
                    cift[b] = cift[b+1]; 
                }
                ciftsize--;
                }
            if(kontrolDogrumu(kolon)){
                kolonKontrol = true;
                for(int p=0;p<6;p++){
                    if(kolon[p] % 2 == 0){
                        cift[ciftsize] = kolon[p];
                        ciftsize++;
                    }
                    if(kolon[p] % 2 == 1){
                        tek[teksize] = kolon[p];
                        teksize++;
                    }
            }
            }
            }
            kolon = sirala(kolon);
             System.out.println("KOLON " + (i+1));
       for(int a=0;a<kolon.length;a++){
           System.out.print(kolon[a] + " ");
       }
       System.out.println("");
            
        } System.out.println("");
    }
}

