
package javaapplication25;


public class JavaApplication25 {
    public static boolean isPalindrome(String gelen){
    return gelen.equals(new StringBuilder(gelen).reverse().toString());
    }
    public static void main(String[] args) {
        
        System.out.println(isPalindrome("iki"));
    }
    
}
