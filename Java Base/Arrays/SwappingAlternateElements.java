package Arrays;
import java.util.Scanner;
public class SwappingAlternateElements {
    public static void swapAlternate(int arr[]) {
        if (arr.length <= 1)
            return;
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        /*
        		    /Swapping/
        			x = x + y;
        			y = x - y;
        			x = x - y;
        			System.out.p
        */
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        swapAlternate(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}


