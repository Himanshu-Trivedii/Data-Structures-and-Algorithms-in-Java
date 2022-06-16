package PATTERNS;
import java.util.Scanner;
public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(64+n-i+j));
            }
            System.out.println();
        }
    }
}
