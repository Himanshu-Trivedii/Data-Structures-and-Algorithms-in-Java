package Loop_Questions;
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println(0);
        for(int i=1;i<n;i++){
            if(i*i==n){
                System.out.println(i);return;
            }
            if(i*i>n){
                System.out.println(i-1);return;
            }
        }
    }
}
