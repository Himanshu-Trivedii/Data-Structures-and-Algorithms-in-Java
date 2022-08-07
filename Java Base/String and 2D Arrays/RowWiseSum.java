package String_and_2D_Arrays;
import java.util.Scanner;
public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
        int rows=mat.length;
        if(rows==0)
            return;
        int cols=mat[0].length;
        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<cols;j++){
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        rowWiseSum(arr);
    }
}
