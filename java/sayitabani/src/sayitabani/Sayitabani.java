package sayitabani;

public class Sayitabani {

    public static String decToBin(int gelenSayi) {
        String sonuc = "";
        while (gelenSayi > 0) {
            int kalan = gelenSayi % 2;
            gelenSayi = gelenSayi / 2;
            sonuc = kalan + sonuc;
        }
        return sonuc;

    }

    public static void main(String[] args) {
        int sayi = 15;
        String sonuc = decToBin(sayi);
        System.out.println("sonuc = " + sonuc);
    }

}
