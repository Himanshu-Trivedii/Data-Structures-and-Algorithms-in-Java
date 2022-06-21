package PATTERNS;
import java.util.Scanner;
public class MirrorNumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int spaces=n-i;spaces>0;spaces--)
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
