package Recursion_1;

public class SumOfArray {
    private static int Helper(int arr[],int index){
        if(index<0)
            return 0;
        return arr[index]+Helper(arr,--index);
    }
    public static int sum(int input[]) {
        return Helper(input,input.length-1);
    }
}
