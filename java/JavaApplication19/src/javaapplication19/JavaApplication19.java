package javaapplication19;

public class JavaApplication19 {

    public static int topla(int a, int b) {

        return a + b;
    }

    public static int topla(int a, int b, int c) {

        return a + b + c;
    }

    public static double topla(double a, int b) {

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(topla(2, 3));
        System.out.println(topla(2, 3, 4));
        System.out.println(topla(5.0, 6));

    }

}
