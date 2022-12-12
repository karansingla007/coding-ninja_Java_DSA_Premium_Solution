
public class solution {

	// Return the changed string
	public static String removeX(String input){
        // System.out.println("input = " + input);
        if(input.length() == 0) {
            return input;
        }
        
		String temp = removeX(input.substring(1));
        if(input.charAt(0) == 'x') {
			// System.out.println("return x = " + input.substring(1));
            return temp;
        } else {
            // System.out.println("return without x = " + input.charAt(0) + temp);
            return input.charAt(0) + temp;
        }
	}
}