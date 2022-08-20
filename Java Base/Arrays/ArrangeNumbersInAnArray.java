package Arrays;

import java.util.Scanner;

public class ArrangeNumbersInAnArray {
    public static void arrange(int[] arr, int n) {
        if(arr.length<=1)
            return;
        boolean flag=true;
        for(int i=0,j=0,k=arr.length-1;i<arr.length && j<=k;i++){
            if(flag)
            {arr[j]=i+1;j++;flag=false;}
            else
            {arr[k]=i+1;k--;flag=true;}
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=0;
        arrange(arr,size);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
