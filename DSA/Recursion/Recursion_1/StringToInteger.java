package Recursion_1;

public class StringToInteger {
    private static int Helper(String input,int Answer){
        if(input.length()==0)
            return Answer;
        Answer=Answer*10+(input.charAt(0)-'0');
        return Helper(input.substring(1),Answer);
    }
    public static int convertStringToInt(String input){
        return Helper(input,0);
    }
}
