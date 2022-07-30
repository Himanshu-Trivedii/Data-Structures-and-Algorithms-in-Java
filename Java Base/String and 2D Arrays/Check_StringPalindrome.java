package String_and_2D_Arrays;
import java.util.Scanner;
public class Check_StringPalindrome {
    public static boolean isPalindrome(String str) {
        if(str.length()<=1)
            return true;
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println( isPalindrome(s)) ;
    }
}
