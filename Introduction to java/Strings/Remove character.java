
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        String chs = "" + ch;
		return str.replaceAll(chs, "");
	}

}