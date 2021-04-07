
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class soru1 {

    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            String istenilenNo = scn.next();
            String veri = null;
            File myObj = new File("D:/ogrenciler.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                veri = soru1.isNumara(data, istenilenNo);
                if (veri != null) {
                    break;
                }
            }
            myReader.close();
            if (veri == null) {
                System.out.println("Bu öğrenci bulunamadı");
            } else {
                char[] sonListe = veri.toCharArray();
                String cikti = "";
                int sayac = 0;
                for (int i = 0; i < sonListe.length; i++) {
                    if (sonListe[i] == ';') {
                        sayac++;
                        if (sayac == 3) {
                            for (int j = i + 1; j < sonListe.length; j++) {
                                cikti += String.valueOf(sonListe[j]);
                            }
                        }
                    }
                }
                System.out.println(cikti);
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static String isNumara(String data, String istenilenOgrNo) {
        char[] liste = data.toCharArray();
        String ogrNo = "";
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] == ';') {
                for (int j = i + 1; i < liste.length; j++) {
                    if (liste[j] == ';') {
                        break;
                    }
                    ogrNo += String.valueOf(liste[j]);
                }
                break;
            }
        }
        if (ogrNo.equals(istenilenOgrNo)) {
            return data;
        } else {
            return null;
        }
    }

}