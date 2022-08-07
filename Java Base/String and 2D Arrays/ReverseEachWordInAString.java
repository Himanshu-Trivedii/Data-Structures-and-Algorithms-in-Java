package String_and_2D_Arrays;

import java.util.Scanner;

public class ReverseEachWordInAString {
    public static String reverse(String str){
        String ans="";
        for(int j=str.length()-1;j>=0;j--){
            ans+=str.charAt(j);
        }
        return ans;
    }
    public static String reverseEachWord(String str) {
        if(str.length()<=1)
            return str;
        String []splittedString = str.split(" ");
        String ans="";
        for(int i=0;i<splittedString.length;i++){
            ans+=reverse(splittedString[i])+" ";
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println( reverseEachWord(s)) ;
    }
}
