package basamak.toplam;

public class BasamakToplam {

    public static int sumDigit(int gelenSayi) {
        int sonuc = 0;
        while (gelenSayi > 0) {
            int kalan = gelenSayi % 10;
            gelenSayi = gelenSayi / 10;
            sonuc += kalan;

        }
        return sonuc;
    }

    public static void main(String[] args) {
        int sayi = 1578;
        int sonuc = sumDigit(sayi);
        System.out.println("sonuc =  " + sonuc);
    }

}
