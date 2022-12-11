import java.util.*;
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        HashMap<String, Integer> mp  = new HashMap();
		String ans = "";
		for(int i=0;i<str.length();i++) {
			String value = str.substring(i, i+1);
			if(mp.containsKey(value)) {
				int count = mp.get(value);
				mp.put(value, ++count);
			} else {
				mp.put(value, 0);	
			}
		}
		int max = -1;
		for (Map.Entry<String, Integer> e : mp.entrySet()) {
			if(e.getValue() > max) {
				max = e.getValue();
				ans = e.getKey();
			}
		}
		return ans.charAt(0);
	}

}