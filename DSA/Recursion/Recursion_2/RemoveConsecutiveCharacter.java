public class Solution {
    private static String Helper(String s,String Answer){
        if(s.length()==0)return " ";
        String shortAns=Helper(s.substring(1),Answer);
        if(shortAns.charAt(0)!=s.charAt(0))
            shortAns=s.charAt(0)+shortAns;
        return shortAns;
    }
	public static String removeConsecutiveDuplicates(String s) {
        if(s.length()<=1)return s;     
        return Helper(s,"");
	}
}