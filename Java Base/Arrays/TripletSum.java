package Arrays;
import java.util.Scanner;
public class TripletSum {
    public static int findTriplet(int[] arr, int x) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                        count++;
                }

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
        System.out.print(findTriplet(arr,Sum));
    }
}
