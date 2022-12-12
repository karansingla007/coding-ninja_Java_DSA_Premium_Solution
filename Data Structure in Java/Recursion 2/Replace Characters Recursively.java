
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        if(input.length() == 0) {
            return input;
        }
        String smallOutput = replaceCharacter(input.substring(1), c1, c2);
        if(input.charAt(0) == c1) {
            // System.out.println(input);
            return c2 + smallOutput;
        } else {
            return input.charAt(0)+ smallOutput;
        }

	}
}