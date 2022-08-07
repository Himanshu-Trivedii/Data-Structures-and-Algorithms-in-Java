package String_and_2D_Arrays;

import java.util.Scanner;

public class LargestRowOrColumn {

        public static void findLargest(int mat[][]){
            if(mat.length==0){
                System.out.println("row 0 "+Integer.MIN_VALUE);return;
            }
            int rows=mat.length,cols=mat[0].length;
            int maxRowIndex=0,MaxRowSum=0;
            int maxColIndex=0,MaxColSum=0;
            for(int i=0;i<rows;i++){
                int tempRowSum=0;
                for(int j=0;j<cols;j++){
                    tempRowSum+=mat[i][j];
                }
                if(tempRowSum>MaxRowSum){
                    MaxRowSum=tempRowSum;maxRowIndex=i;
                }
            }
            for(int i=0;i<cols;i++){
                int tempColSum=0;
                for(int k=0;k<rows;k++){
                    tempColSum+=mat[k][i];
                }

                if(tempColSum>MaxColSum){
                    MaxColSum=tempColSum;maxColIndex=i;
                }
            }


            if(MaxColSum>MaxRowSum)
                System.out.println("column "+ maxColIndex+" "+MaxColSum);
            else
                System.out.println("row "+ maxRowIndex+" "+MaxRowSum);


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
        findLargest(arr);
    }
}
