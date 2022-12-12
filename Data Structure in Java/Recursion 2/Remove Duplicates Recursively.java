public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        // System.out.println("input string = " + s);
        if(s.length() == 1) {
            return s;
        }
        String smallOutput = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0) == s.charAt(1)) {
            // System.out.println("equl char = " + s);
            // System.out.println("equl char = " + s.substring(1));
            return smallOutput;
        } else {
            // System.out.println("s = " + s);
            // System.out.println("smallOutput = " + smallOutput);
            return s.charAt(0) + smallOutput;
        }
	}

}