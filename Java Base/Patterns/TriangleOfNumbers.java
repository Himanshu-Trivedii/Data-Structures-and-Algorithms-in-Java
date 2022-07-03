package PATTERNS;
import java.util.Scanner;
public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),spaces=n-1,counter=2;
        for(int i=1;i<=n;i++)
        {
            for(int temp=0;temp<spaces;temp++){
                System.out.print(" ");
            }
            spaces--;
            for(int j=i,k=0;k<i;k++,j++){
                System.out.print(j);
            }
            if(i==1){
                System.out.println(); continue;
            }
            for(int j=counter,k=1;k<i;k++,j--){
                System.out.print(j);
            }
            counter+=2;
            System.out.println();
        }
    }
}


