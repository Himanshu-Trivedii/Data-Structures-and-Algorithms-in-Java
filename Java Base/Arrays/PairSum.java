package Arrays;

import java.util.Scanner;

public class PairSum {
    public static int pairSum(int arr[], int x) {
        int size=arr.length,count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==x)
                    ++count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int Sum=sc.nextInt();
        System.out.print(pairSum(arr,Sum));

    }
}
