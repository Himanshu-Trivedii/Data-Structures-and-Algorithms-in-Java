package Recursion_1;

public class ReplaceCharacterRecursively {
    private static String Helper(String input,String Answer,char c1,char c2){
        if(input.length()==0)return Answer;
        if(input.charAt(0)==c1)
            Answer+=c2;
        else
            Answer+=input.charAt(0);
        return Helper(input.substring(1),Answer,c1,c2);
    }
    public static String replaceCharacter(String input,char c1, char c2) {
        return Helper(input,"",c1,c2);
    }
}
/*							OTHER APPROACH
 if(input.length()==0)
            return "";
        char c;
        if(input.charAt(0)==c1)
            c=c2;
        else
            c=input.charAt(0);
        String smallAnswer=replaceCharacter(input.substring(1),c1,c2);
        return c+smallAnswer;
*/