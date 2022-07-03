package Loop_Questions;
import java.util.Scanner;
public class Nth_FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t1=0,t2=1,t3=t1+t2;
        while(n!=0){
            t1=t2;t2=t3;t3=t1+t2;
            n--;
        }
        System.out.println(t1);
    }
}
