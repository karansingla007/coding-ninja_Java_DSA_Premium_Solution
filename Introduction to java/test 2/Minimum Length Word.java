
public class Solution {
	
	public static String minLengthWord(String str){
		
		// Write your code here
        int n = str.length();
		int startIndex = 0;
		int endIndex = 0;
		String ans = "";
		int max = Integer.MIN_VALUE;
		for(int i=0;i<=n;i++) {
			if(i == n || str.charAt(i) == ' ' ) {
				endIndex = i - 1;
				
				if(startIndex - endIndex > max) {
					max = startIndex - endIndex;
					ans = str.substring(startIndex, endIndex + 1);
				}
				
				startIndex = i + 1;
			}
		}
		return ans;

	}
}