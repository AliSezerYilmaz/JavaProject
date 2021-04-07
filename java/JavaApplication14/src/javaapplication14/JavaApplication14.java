package javaapplication14;

public class JavaApplication14 {

    public static int usAL(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        return sonuc;

    }

    public static void main(String[] args) {
        int taban = 5, us = 3;
        int sonuc = usAL(taban, us);
        System.out.printf("%d üssü %d = %d  ", taban, us, sonuc);

    }

}
