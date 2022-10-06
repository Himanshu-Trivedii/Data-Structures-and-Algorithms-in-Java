public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	// T.C O(n)
        //  S.C O(1)
        if(arr.length<=1)return;
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                arr[counter++]=arr[i];
        }
        while(counter<arr.length)
            arr[counter++]=0;
    }

}