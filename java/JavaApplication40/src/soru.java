import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dolunay
 */
public class soru {
    
    public static void main(String[] args) {
        Random rnd= new Random();
        Scanner scn=new Scanner(System.in);
        int[] sayilar=new int[6];           //her kolonda 6 sayı olduğu için 6 elemanlı bir dizi oluşturuluyor.
        
        int sayi,ysayi,eleman,kolon,kontrol;
        
        System.out.print("Oynamak istediğiniz kolon sayısını giriniz:");
        kolon=scn.nextInt();
        
        if(0<kolon && kolon<9){                  //girilen kolon sayısı 0 ile 9 arasında ise buraya giriyor.
            
            for (int p = 0; p < kolon; p++) {   //kolon sayısı kadar döngü döndürülüyor.
            int sayac1=0,sayac2=0,sayac3=0,sayac4=0,sayac5=0,tekadet=0,ciftadet=0;
            
            for (int i = 0; i < 6; i++) {       //her kolonda 6 sayı olduğundan döngü 6 defa dönüyor.
            
            sayi=1+rnd.nextInt(4);              //sayı aralıklarına sırasıyla 1'den 5'e kadar numara verdim.Burada 1'den 5'e kadar sayı tutuyor.
            int tekrar1=0,tekrar2=0,tekrar3=0,tekrar4=0,tekrar5=0;
            
            if(sayi==1){                         //eğer sayı 1 ise bu aralığa giriyor.
                if(sayac1<2){                   //eğer 1-10 aralığında 2den az sayı varsa buraya giriyor.
                    ysayi=1+rnd.nextInt(9);    //1-10 arasında rastgele sayı tutuluyor
                    for (int j = 0; j <i; j++) {
                            if(sayilar[j]==ysayi)  //Burada tutulan sayının o kolonda daha önce olup olmadığına bakılıyor.
                                tekrar1++;         //Eğer daha önce kullanıldıysa tekrar1 sayacı arttırılıyor.
                            
                        }
                        if(tekrar1==1){             //Eğer tekrar sayısı 1 ise döngü i 1 azalıyor döngü tekrar çalışıyor.
                            i--;
                        }
                        else{
                            if(ysayi%2==0){              //sayı çift ise buraya giriyor.
                                if(ciftadet<3){          //eğer kolondaki çift sayı sayısı 3 den az ise sayı tanımlanıyor ve sayaclar arttılıyor.
                                 sayilar[i]=ysayi;
                                 sayac1++; 
                                 ciftadet++;
                                }
                                else                    //eğer kolondaki çift sayı sayısı 3 ise i 1 azaltılıyor ve döngü tekrar başlatılıyor.
                                    i--;
                            }
                            else{                       //sayı çift değil yani tek ise buraya giriyor.
                                if(tekadet<3){          //eğer kolondaki tek sayı sayısı 3 den az ise sayı tanımlanıyor ve sayaclar arttılıyor.
                                 sayilar[i]=ysayi;      
                                 sayac1++;
                                 tekadet++;
                                }
                                else{                   ////eğer kolondaki tek sayı sayısı 3 ise i 1 azaltılıyor ve döngü tekrar başlatılıyor.
                                    i--;
                                }
                            }
                                
                            
                        } 
                }
                else         //1-10 aralığında iki sayı varsa i 1 azalıyor ve döngü tekrar çalıştırıloyor.
                    i--;
                }
            
            else if(sayi==2){               //eğer sayı 2 ise bu aralığa giriyor ve işlemler yapılıyor.
                if(sayac2<2){
                    ysayi=11+rnd.nextInt(9);
                    for (int j = 0; j <i; j++) {
                            if(sayilar[j]==ysayi)
                                tekrar2++;
                        }
                        if(tekrar2==1){
                            i--;
                        }
                        else{ 
                            if(ysayi%2==0){
                                if(ciftadet<3){
                                 sayilar[i]=ysayi;
                                 sayac2++;
                                 ciftadet++;
                                }
                                else
                                    i--;
                            }
                            else{
                                if(tekadet<3){
                                 sayilar[i]=ysayi;
                                 sayac2++;
                                 tekadet++;
                                }
                                else{
                                    i--;
                                }
                            }
                        } 
                }
                else
                    i--;
                }
            else if(sayi==3){               //eğer sayı 3 ise bu aralığa giriyor ve işlemler yapılıyor.
                if(sayac3<2){
                    ysayi=21+rnd.nextInt(9);
                    for (int j = 0; j <i; j++) {
                            if(sayilar[j]==ysayi)
                                tekrar3++;
                        }
                        if(tekrar3==1){
                            i--;
                        }
                        else{ 
                            if(ysayi%2==0){
                                if(ciftadet<3){
                                 sayilar[i]=ysayi;
                                 sayac3++;
                                 ciftadet++;
                                }
                                else
                                    i--;
                            }
                            else{
                                if(tekadet<3){
                                 sayilar[i]=ysayi;
                                 sayac3++;
                                 tekadet++;
                                }
                                else{
                                    i--;
                                }
                            }
                        } 
                }
                else
                    i--;
                }
            
            else if(sayi==4){                   //eğer sayı 4 ise bu aralığa giriyor ve işlemler yapılıyor.
                if(sayac4<2){
                    ysayi=31+rnd.nextInt(9);
                    for (int j = 0; j <i; j++) {
                            if(sayilar[j]==ysayi)
                                tekrar4++;
                        }
                        if(tekrar4==1){
                            i--;
                        }
                        else{ 
                            if(ysayi%2==0){
                                if(ciftadet<3){
                                 sayilar[i]=ysayi;
                                 sayac4++;
                                 ciftadet++;
                                }
                                else
                                    i--;
                            }
                            else{
                                if(tekadet<3){
                                 sayilar[i]=ysayi;
                                 sayac4++;
                                 tekadet++;
                                }
                                else{
                                    i--;
                                }
                            }
                        } 
                }
                else
                    i--;
                }
            else if(sayi==5){                       //eğer sayı 5 ise bu aralığa giriyor ve işlemler yapılıyor.
                if(sayac5<2){
                    ysayi=41+rnd.nextInt(9);
                    for (int j = 0; j <i; j++) {
                            if(sayilar[j]==ysayi)
                                tekrar5++;
                        }
                        if(tekrar5==1){
                            i--;
                        }
                        else{ 
                            if(ysayi%2==0){
                                if(ciftadet<3){
                                 sayilar[i]=ysayi;
                                 sayac5++;
                                 ciftadet++;
                                }
                                else
                                    i--;
                            }
                            else{
                                if(tekadet<3){
                                 sayilar[i]=ysayi;
                                 sayac5++;
                                 tekadet++;
                                }
                                else{
                                    i--;
                                }
                            }
                        } 
                }
                else
                    i--;
                }
            }
            for (int z = 0; z < sayilar.length-1; z++) {
            for (int x = 0; x < sayilar.length-z-1 ; x++) {
                if(sayilar[x] > sayilar[x+1]){                  //oluşturulan kolon küçükten büyüğe sıralanıyor.
                    eleman = sayilar[x];
                    sayilar[x] = sayilar[x+1];
                    sayilar[x+1] = eleman;
                    }
                }
            }
            System.out.println("Kolon "+(p+1)+" Sayıları:");
        for (int k = 0; k <sayilar.length; k++) {
            System.out.print(sayilar[k]);
            if(k!=sayilar.length-1)                             //oluşturulan kolon ekrana yazdırılıyor.
                System.out.print("-");
        }
            System.out.println();
            
        }
        }
        else 
            //girilen kolon sayısı 0 ile 9 arasında değilse buraya giriyor.
            System.out.println("Yanlış kolon sayısı girdiniz.");
        
                
                    
         
            
        }
}


