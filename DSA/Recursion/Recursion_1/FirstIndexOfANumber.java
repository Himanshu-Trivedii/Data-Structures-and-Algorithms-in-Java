package Recursion_1;

public class FirstIndexOfANumber {
    private static int Helper(int input[],int x,int index){
        if(index>=input.length)return -1;
        if(input[index]==x)return index;
        return Helper(input,x,++index);
    }
    public static int firstIndex(int input[], int x) {
        return Helper(input,x,0);
    }
}
