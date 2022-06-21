package PATTERNS;
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),stars=1;
        for(int i=1;i<=n;i++){
            for(int spaces=n-i;spaces>0;spaces--){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            stars+=2;
            System.out.println();
        }
    }
}
