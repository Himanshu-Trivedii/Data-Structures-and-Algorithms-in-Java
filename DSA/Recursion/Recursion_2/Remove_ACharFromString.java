package Recursion_1;

public class Remove_ACharFromString {
    private static String Helper(String input,String UpdatedString){
        if(input.length()==0)return UpdatedString;
        if(input.charAt(0)!='x')UpdatedString+=input.charAt(0);
        return Helper(input.substring(1),UpdatedString);
    }
    public static String removeX(String input){
        return Helper(input,"");
    }
}
