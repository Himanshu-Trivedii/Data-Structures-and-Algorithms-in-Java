public class PairStar {
	private static String Helper(String s,String ans){
        if(s.length()==1)return ans+s.charAt(0);
        if(s.charAt(0)==s.charAt(1))
            ans+=s.charAt(0)+"*";
        else
            ans+=s.charAt(0);
        return Helper(s.substring(1),ans);
    }
	public static String addStars(String s) {
		return Helper(s,"");
	}
}
/*Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a
*/