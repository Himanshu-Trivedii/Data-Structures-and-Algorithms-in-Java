package Recursion_1;

public class CountZeros {
    private static int Helper(int input,int count){
        if(input==0)return count;
        if(input%10==0)count++;
        return Helper(input/10,count);
    }
    public static int countZerosRec(int input){
        if(input==0)return 1;
        return Helper(input,0);
    }
}
