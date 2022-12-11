
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
          int n = str.length();
        int startIndex = 0;
        String ans = "";
        for(int i=0;i<=n;i++) {
        	if(i == n || str.charAt(i) == ' ') {
        		int endIndex = i - 1;
        		String reverseString = "";
        		for(int j = startIndex;j<=endIndex;j++) {
        			reverseString = str.charAt(j) + reverseString;
        		}
        		ans = ans + reverseString + " ";
        		startIndex = i+1;
        	}
        }
        return ans;
	}

}