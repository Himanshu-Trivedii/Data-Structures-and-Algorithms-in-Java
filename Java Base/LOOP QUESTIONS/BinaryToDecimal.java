package Loop_Questions;
import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ans=0,counter=0;
        while(n!=0){
            int temp=n%10;
            ans+=Math.pow(2,counter)*temp;
            counter++;
            n/=10;
        }
        System.out.println(ans);

    }
}
