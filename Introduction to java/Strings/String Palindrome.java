public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int n = str.length();
        for(int i=0;i<n/2;i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
	}

}