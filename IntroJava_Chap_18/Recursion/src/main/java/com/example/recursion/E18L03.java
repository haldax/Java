//Recursive palindrome
package com.example.recursion;

public class E18L03 {
    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is moon a palindrome? " + isPalindrome("a"));
    }
    public static boolean isPalindrome(String s){
        if (s.length() <= 1)
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        else
            return isPalindrome(s.substring(1,s.length()-1));
    }
}
