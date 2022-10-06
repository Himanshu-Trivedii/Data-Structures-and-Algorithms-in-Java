public class Solution { 
    public static int binarySearch(int[] arr, int x) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x)return mid;
            if(arr[mid]<x){start=mid+1;continue;}
            if(arr[mid]>x){end=mid-1;continue;}
        }
        return -1;
    }
}