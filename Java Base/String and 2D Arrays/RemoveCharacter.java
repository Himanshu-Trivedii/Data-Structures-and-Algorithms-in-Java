package String_and_2D_Arrays;

import java.util.Scanner;

public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        if(str.length()==0)
            return "";
        String ans="";
        for(char c:str.toCharArray()){
            if(c==ch)
                continue;
            ans+=c;
        }
        return ans;
    }

    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String s1=sc.nextLine();
            char c=s1.charAt(0);
            System.out.println( removeAllOccurrencesOfChar(s,c)) ;

    }
}
