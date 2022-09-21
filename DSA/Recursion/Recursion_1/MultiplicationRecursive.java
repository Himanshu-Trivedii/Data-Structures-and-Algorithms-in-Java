package Recursion_1;

public class MultiplicationRecursive {
    public static int multiplyTwoIntegers(int m, int n){
        if(m<=0)
            return 0;
        return n+(multiplyTwoIntegers(m-1,n));

    }
}
