package PATTERNS;
import java.util.Scanner;
public class ZerosAndStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=1,b=n;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                if(j==a)
                    System.out.print("*");
                else
                    System.out.print(0);
            }
            a++;
            System.out.print("*");
            for(int j=1;j<=n;j++){
                if(j==b)
                    System.out.print("*");
                else
                    System.out.print(0);
            }
            System.out.println();
            b--;
        }
    }
}
