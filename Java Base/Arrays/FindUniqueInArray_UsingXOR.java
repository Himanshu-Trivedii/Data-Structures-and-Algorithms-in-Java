package Arrays;

import java.util.Scanner;

public class FindUniqueInArray_UsingXOR {
    public static int findUnique(int[] arr){
    /*
       XOR of a number with itself cancels out the number or gives 0 to be precise.
       Hence, if we XOR each element in the array
       with each other then the duplicates would be canceled out giving us the remaining unique number
       And Hence we return the Unique Element
    */
        int XorSum=0;
        for(int i:arr)
            XorSum^=i;
        return XorSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.print(findUnique(arr));
    }
}
