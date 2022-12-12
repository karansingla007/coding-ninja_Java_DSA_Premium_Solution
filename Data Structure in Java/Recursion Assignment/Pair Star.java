
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
        if(s.length() == 1) {
            return s;
        }
		String updatedStr = addStars(s.substring(1));
        // System.out.println("String = " + s);
        s = s.charAt(0) + updatedStr;
        if(s.length() >= 2 && s.charAt(0) == s.charAt(1)) {
            String updateVal = s.charAt(0) + "*" + s.charAt(1);
            // System.out.println("updated value = " + updateVal + s.substring(2));
            return updateVal + s.substring(2);
        } else {
            // System.out.println("updated value without = " + updatedStr);
            return s.charAt(0) + updatedStr;
        }
	}
}