package String_and_2D_Arrays;

import java.util.Scanner;

public class CompressTheString {
    public static String getCompressedString(String str) {
        if(str.length()<=1)
            return str;
        int count=1;
        String ans="";
        for(int i=0;i<str.length()-1;i++)
        {
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;i++;
            }
            if(count>1){
                ans+=str.charAt(i);
                ans+=count;
                count=1;
            }
            else
                ans+=str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println( getCompressedString(s)) ;
    }
}
