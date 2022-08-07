package String_and_2D_Arrays;

import java.util.Scanner;

public class HighestOccouringCharacter {
    public static char highestOccuringChar(String str) {
        // There are 256 characters with 0 to 255 ASCII Values
        int[] arr=new int[256];
        for(int i=0;i<str.length();i++){
            ++arr[(int)(str.charAt(i))];
        }
        int max=Integer.MIN_VALUE,maxIndex=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                maxIndex=i;
            }

        }
        return (char)(maxIndex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println( highestOccuringChar(s)) ;
    }
}
