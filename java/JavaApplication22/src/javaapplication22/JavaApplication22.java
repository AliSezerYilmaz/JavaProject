/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Ali Sezer
 */
public class JavaApplication22 {

    public static void method1(int i,int x) {
for (int j = 1; j <= i; j++) {
 System.out.println(x);
 x *= 2;
 }
}

    public static void main(String[] args) {
 int i = 1;
double a=2.7;
while (i <= 2) {
 method1(i,(int)a);
 i++;
 }
}
    
}
