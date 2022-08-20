package Arrays;

import java.util.Scanner;

public class Sort_0_1 {
    public static void sortZeroesAndOne(int[] arr) {
        if(arr.length<=1)
            return;
        int count=0;
        for(int i:arr)
            if(i==0)count++;
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        sortZeroesAndOne(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
