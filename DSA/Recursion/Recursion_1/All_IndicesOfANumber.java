package Recursion_1;
import java.util.ArrayList;
public class All_IndicesOfANumber {
    private static ArrayList<Integer>Helper(int[] input,int x,ArrayList<Integer>list,int index){
        if(index>=input.length)return list;
        if(input[index]==x)list.add(index);
        return Helper(input,x,list,++index);
    }
    public static int[] allIndexes(int input[], int x) {
        ArrayList<Integer> list=new ArrayList<>();
        list=Helper(input,x,list,0);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
