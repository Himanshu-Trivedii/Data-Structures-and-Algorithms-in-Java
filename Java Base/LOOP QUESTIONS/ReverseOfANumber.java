package Loop_Questions;
import java.util.Scanner;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),rev=0;
        while(n!=0){
            int temp=n%10;
            rev=(rev*10)+temp;
            n/=10;
        }
        System.out.println(rev);
    }
}
