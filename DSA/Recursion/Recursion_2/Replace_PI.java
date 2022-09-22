package Recursion_1;

public class Replace_PI {
    private static String Helper(String input,String Answer){
        if(input.length()==0)return Answer;
        if(input.length()>=2 && input.charAt(0)=='p'&& input.charAt(1)=='i' ){
            Answer+="3.14";
            return Helper(input.substring(2),Answer);
        }
        else
            Answer+=input.charAt(0);
        return Helper(input.substring(1),Answer);
    }
    public static String replace(String input){
        return Helper(input,"");
    }
}
