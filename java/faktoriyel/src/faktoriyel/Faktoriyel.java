package faktoriyel;

public class Faktoriyel {

    static int [] dizi = {9,6,0,-72,23};
            
    
    public static int faktoriyel(int gelenSayi) {
        int sonuc = 1;
        for (int i = 1; i <= gelenSayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
    
    public static void bubblesort(){
        
        for(int i = 0;i < dizi.length;i++)
            for(int j = 0;j < dizi.length-1;j++){
                if(dizi[j]>dizi[j+1]){
                    int temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;        
                }
            }
        
        for(int  i = 0 ; i< dizi.length;i++){
            System.out.print(dizi[i] +" , ");
        }
           
    }
    
    public static void selectionsort(){
        
        for(int i = 0;i < dizi.length;i++){
            int enkucukindis = i;
            for(int j = i+1;j < dizi.length;j++){
                if (dizi[j] < dizi[enkucukindis]) {
                    enkucukindis  = j;
                }
                
            }
            int temp = dizi[i];
            dizi[i] = dizi[enkucukindis];
            dizi[enkucukindis] = temp;
            
        }
        
        for(int  i = 0 ; i< dizi.length;i++){
            System.out.print(dizi[i] +" , ");
        }
        
    }

    public static void main(String[] args) {
        int sayi = 6;
       // int sonuc = faktoriyel(sayi);
      //  System.out.printf("%d! = %d ", sayi, sonuc);
      //  bubblesort();
      selectionsort();
    }

}
