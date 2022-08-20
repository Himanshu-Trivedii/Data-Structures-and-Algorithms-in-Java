package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicatesInArray {
    public static void duplicateNumber(int arr[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int element : arr)
            if( ! set.add(element))
                System.out.print(element+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        duplicateNumber(arr);
    }

}
