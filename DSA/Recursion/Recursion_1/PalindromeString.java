package Recursion_1;

public class PalindromeString {
    public static boolean isStringPalindrome(String input) {
        if(input.length()<=1)return true;
        if(input.charAt(0)!=input.charAt(input.length()-1))
            return false;
        return isStringPalindrome(input.substring(1,input.length()-1)) ;

    }
}
