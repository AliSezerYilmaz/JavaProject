package javaapplication20;

public class JavaApplication20 {

    public static String decToHex(int sayi) {
        String sonuc = "";
        while (sayi > 0) {
            int kalan = sayi % 16;
            sayi = sayi / 16;
            if (kalan <= 9) {
                sonuc = kalan + sonuc;
            } else if (kalan == 10) {
                sonuc = "A" + sonuc;
            } else if (kalan == 11) {
                sonuc = "B" + sonuc;
            } else if (kalan == 12) {
                sonuc = "C" + sonuc;
            } else if (kalan == 13) {
                sonuc = "D" + sonuc;
            } else if (kalan == 14) {
                sonuc = "E" + sonuc;
            } else if (kalan == 15) {
                sonuc = "F" + sonuc;
            }

        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(decToHex(1578)); 

    }

}
