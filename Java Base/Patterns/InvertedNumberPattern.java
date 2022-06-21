package PATTERNS;
import java.util.Scanner;
public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),temp=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<temp;j++){
                System.out.print(temp);
            }
            temp--;
            System.out.println();
        }
    }
}
