/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

import java.util.Scanner;

/**
 *
 * @author Ali Sezer
 */
public class JavaApplication57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("1811012019 - Fatih Sultan Mehmet Yiğit \n");

        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen Görev Sayısını Giriniz");
        int g = giris.nextInt();
        if (g <= 0) {
            System.out.println("Gorev sayısı sıfır olamaz");

        } else {
            System.out.println("ABC degerleri icin space tusuna sonraki P degeri icin entera basiniz\n");
            System.out.println("\t\t\t A B C \n");
            int[][] alloc = new int[g][3];
            for (int b = 0; b < g; b++) {
                System.out.println("lutfen P" + b + " degerini giriniz");
                for (int i = 0; i < 3; i++) {
                    alloc[b][i] = giris.nextInt();  //kullanıcıdan atanan değerleri alıyoruz
                }
            }
            System.out.println("ABC degerleri icin space tusuna sonraki P degeri icin enter basiniz\n");
            int[][] max = new int[g][3];
            System.out.println("\t\t\t A B C \n");
            for (int a = 0; a < g; a++) {
                System.out.println("Lutfen P" + a + " max değeriniz girin");
                for (int j = 0; j < 3; j++) {
                    max[a][j] = giris.nextInt();  //kullanıcıdan maximum değeri alıyoruz 
                }
            }
            int[] toplam = new int[3];
            System.out.println("\t\t\t  A  B C");
            System.out.println("toplam kaynakları giriniz");  //kullanılanları bulmak için toplam kaynak sayısını alıyoruz
            toplam[0] = giris.nextByte();
            toplam[1] = giris.nextByte();
            toplam[2] = giris.nextByte();
            System.out.println("");
            int[] kullan = new int[3];
            kullan[0] = 0;
            kullan[1] = 0;
            kullan[2] = 0;
            for (int n = 0; n < g; n++) {
                kullan[0] = alloc[n][0] + kullan[0];
            }
            for (int n = 0; n < g; n++) {
                kullan[1] = alloc[n][1] + kullan[1];
            }
            for (int n = 0; n < g; n++) {
                kullan[2] = alloc[n][2] + kullan[2];
            }

            kullan[0] = toplam[0] - kullan[0];
            kullan[1] = toplam[1] - kullan[1];
            kullan[2] = toplam[2] - kullan[2];
            System.out.println("\t\t\t\t         A B C ");
            System.out.println("kullanilabilir kaynak sayilari          :" + kullan[0] + " " + kullan[1] + " " + kullan[2]);
            // kullanýlabilir kaynak sayýsýný bulup ekrana yazdýrýyoruz
            int[] son = new int[g];

            int[] cevap = new int[g];

            int index = 0;

            for (int k = 0; k < g; k++) {
                son[k] = 0; //soradan durum kontrolü yapabilmmek için son deðerlerinin hepsini 0 yapýyoruz
            }
            int gerek[][] = new int[g][3];

            for (int t = 0; t < g; t++) {
                for (int e = 0; e < 3; e++) {
                    gerek[t][e] = max[t][e] - alloc[t][e];	//ihtiyacý bulmak için maksimum deðerden atanan deðeri çýkarýyoruz
                }
            }
            int y = 0;
            for (int k = 0; k < g; k++) {
                for (int i = 0; i < g; i++) {
                    if (son[i] == 0) {

                        int flag = 0;
                        for (int j = 0; j < 3; j++) {
                            if (gerek[i][j] > kullan[j]) {
                                flag = 1;
                                break;
                            }
                        }

                        if (flag == 0) {
                            cevap[index++] = i;
                            for (y = 0; y < 3; y++) {
                                kullan[y] += alloc[i][y];
                            son[i] = 1;
                            }
                            
                        }
                    }
                }
            }
            //gereklilikleri kontrol edip güvenli çalýþma sýrasýný tespit ettiðimiz kýsým
            System.out.println("Takip edilmesi gereken guvenli sira nedir?\n");
            int[] safe = new int[g];
            for (int c = 0; c < g; c++) {
                System.out.println((c + 1) + "P");
                safe[c] = giris.nextInt();

            }
            int sayac = 0;

            for (int v = 0; v < g; v++) {
                if (cevap[v] == safe[v]) {
                    sayac++;
                }
            }
            if (sayac == g) {
                System.out.println("Takip edilmesi gereken sirayi dogru girdiniz");

            } else {
                System.out.println("Takip edilmesi gereken sirayi yanlis girdiniz");
                System.out.println("Takip edilmesi gerekn guvenli sira:");

                for (int b = 0; b < g; b++) 
                    System.out.println("P -> " + cevap[b]);
                
              

            }
    }
    
}}
