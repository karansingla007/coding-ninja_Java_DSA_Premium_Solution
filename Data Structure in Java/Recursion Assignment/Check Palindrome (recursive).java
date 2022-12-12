
public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        // System.out.println("input = " + input);
        if(input.length() <= 1) {
            return true;
        }
        int n = input.length();
        
        if(input.charAt(0) != (input.charAt(n - 1))) {
            return false;
        }
        boolean result = isStringPalindrome(input.substring(1, n-1));
        return result;
	}
}
