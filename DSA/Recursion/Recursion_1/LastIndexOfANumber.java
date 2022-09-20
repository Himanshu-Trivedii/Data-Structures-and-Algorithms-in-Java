package Recursion_1;

public class LastIndexOfANumber {
    private static int Helper(int input[],int x,int index){
        if(index<0)return -1;
        if(input[index]==x)return index;
        return Helper(input,x,--index);
    }
    public static int lastIndex(int input[], int x) {
        return Helper(input,x,input.length-1);
    }
}
