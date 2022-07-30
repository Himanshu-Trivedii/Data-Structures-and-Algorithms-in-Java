package String_and_2D_Arrays;
import java.util.Scanner;
public class CountWordsInAString {
    public static int countWords(String str) {
        int count=1;
        if(str.length()==0)
            return 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                count++;
        }
        return count;
    }
// In case of multiple spaces use a boolean flag to check whether last character was a " " or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println( countWords(s)) ;
    }
}
