
package javaapplication47;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JavaApplication47 {
   static int kuvvetHesapla(int sayi,int kuvveti){
       System.out.println("Öğrenci numarasını girin:");

        Scanner mysrc = new Scanner(System.in);
        String OgrNo = mysrc.nextLine();
        mysrc.close();

        try {
            File f = new File("ogrenciler.txt");

            if (f.exists()) {
                boolean found = false;
                Scanner sc = new Scanner(f);

                while (sc.hasNextLine()) {
                    String[] Ogr = sc.nextLine().split(";");

                    if (Ogr[1].equals(OgrNo)) {
                        System.out.println("Sözel Puan: " + Ogr[3]);
                        found = true;
                        break;
                    }
                }

                sc.close();

                if (!found) {
                    System.out.println("Öğrenci bulunamadı.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    
    

