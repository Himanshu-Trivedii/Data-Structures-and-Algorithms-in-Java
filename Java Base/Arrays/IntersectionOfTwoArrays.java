package Arrays;
public class IntersectionOfTwoArrays {
    public static void intersections(int arr1[], int arr2[]) {
        if(arr1.length ==0 || arr2.length==0)
            return;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr2[j]+" ");arr1[i]=arr2[j]=Integer.MIN_VALUE;break;
                }
            }
        }
    }
    public static void main(String[] args) {
        intersections(new int[]{1,2,3,5,4},new int[]{4,3,9,8,7});
    }
}
