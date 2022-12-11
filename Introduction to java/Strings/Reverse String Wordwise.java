public class Solution {

    
	public static String reverseWordWise(String str) {
		// Write your code here
      	String ansStr = "";
		int n = str.length();
		int endWordIndex = n - 1;
		 for(int i=n - 1;i>=0;i--) {
	            if(str.charAt(i) == ' ' || i == 0) {
	            	int startWordIndex = i == 0 ? i : i + 1;
	            	String reverseString = str.substring(startWordIndex, endWordIndex + 1);
//	            	System.out.println(reverseString);
	            	ansStr = ansStr + reverseString + " ";
	            	endWordIndex = i-1;
	            }
	        }
		 // System.out.print(ansStr);
		 return ansStr;
	}
}