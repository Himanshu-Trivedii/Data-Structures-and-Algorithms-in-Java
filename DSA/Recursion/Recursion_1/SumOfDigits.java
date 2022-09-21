package Recursion_1;

public class SumOfDigits {
    private static int Helper(int input,int sum){
        if(input==0)return sum;
        sum+=input%10;
        return Helper(input/10,sum);
    }
    public static int sumOfDigits(int input){
        return Helper(input,0);
    }
}
