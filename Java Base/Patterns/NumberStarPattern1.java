package PATTERNS;
import java.util.Scanner;
public class NumberStarPattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=1;
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                if(j==k)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
            k++;
        }
    }
}
