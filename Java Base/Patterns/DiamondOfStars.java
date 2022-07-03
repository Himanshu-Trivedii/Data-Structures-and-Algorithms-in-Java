package PATTERNS;
import java.util.Scanner;
public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),spaces=n/2,counter1=1,counter2=n-2; boolean isIncreasing=true;
        for(int i=1;i<=n;i++){
            if(isIncreasing)
            {
                for(int temp=spaces;temp>0;temp--){
                    System.out.print(" ");
                }
                spaces--;
                for(int k=1;k<=counter1;k++){
                    System.out.print("*");
                }
                counter1+=2;
                if(spaces==-1){
                    isIncreasing=false;spaces=1;
                }

            }
            else{
                for(int temp=spaces;temp>0;temp--){
                    System.out.print(" ");
                }
                spaces++;
                for(int j=0;j<counter2;j++){
                    System.out.print("*");
                }
                counter2-=2;
                if(counter2<0)
                    return;
            }
            System.out.println();
        }
    }
}
