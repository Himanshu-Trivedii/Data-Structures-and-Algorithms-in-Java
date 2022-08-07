package String_and_2D_Arrays;

import java.util.Scanner;

public class WavePrint {
    public static void wavePrint(int mat[][]){
        if(mat.length==0)
            return;
        int rows=mat.length,cols=mat[0].length;
        boolean isTop=true;
        for(int i=0;i<cols;i++){
            if(isTop){
                // From Top to Bottom
                for(int j=0;j<rows;j++){
                    System.out.print(mat[j][i]+" ");
                }
                isTop=false;
            }
            else{
                // From Bottom to Top
                for(int j=rows-1;j>=0;j--){
                    System.out.print(mat[j][i]+" ");
                }
                isTop=true;
            }
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
        wavePrint(arr);
    }
}
