package Recursion_1;

public class GeometricSum {
    private static double Helper(int k,double sum){
        if(k<0)return sum;
        sum+=(double)(1/Math.pow(2,k));
        return Helper(--k,sum);
    }
    public static double findGeometricSum(int k){
        return Helper(k,0);
    }
}
