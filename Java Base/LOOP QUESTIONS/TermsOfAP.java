package Loop_Questions;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1,j=1;j<=n;i++){
            int  ans=((3*i)+2);
            if(ans%4!=0){
                j++;
                System.out.println(ans);
            }
        }
}}
