package PATTERNS;
import java.util.Scanner;
public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j>0;j--){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
    }
}
