import java.io.*;
import java.util.*; 
class Soru1 {
    public static void main(String[] args) {
        System.out.println("Öğrenci numarasını girin:"); 
        Scanner mysrc = new Scanner(System.in);
        String OgrNo = mysrc.nextLine();
        mysrc.close();
        try {
            File f = new File("D:\\ogrenciler.txt");
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
    }
}
