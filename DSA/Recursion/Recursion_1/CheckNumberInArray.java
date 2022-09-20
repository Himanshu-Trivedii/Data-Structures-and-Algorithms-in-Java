package Recursion_1;

public class CheckNumberInArray {
    private static boolean Helper(int input[], int x,int index){
        if(index<0)return false;
        if(input[index]==x)return true;
        return Helper(input,x,--index);
    }
    public static boolean checkNumber(int input[], int x) {
        return Helper(input,x,input.length-1);
    }
}
