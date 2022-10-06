// N-1 Rounds where n is size of array. last element is already Sorted
public class Solution {  
    public static void bubbleSort(int[] arr){
        if(arr.length<=1)return;
        int len=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j+1<len && arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }  
}