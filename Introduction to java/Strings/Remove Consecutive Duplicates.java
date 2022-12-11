
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
       StringBuffer strbfr = new StringBuffer(str);
		 
	        for(int i=0;i<strbfr.length()-1;i++) {
	        	for(int j=i+1;j<strbfr.length();j++) {
	        		if(strbfr.charAt(i) == strbfr.charAt(j)) {
	        			strbfr = strbfr.replace(j, j+1, "");
                        j--;
//	        			System.out.println(strbfr);
	        			// break;
	        		} else {
                        break;
                    }
	        	}
	        }
	        str = strbfr.toString();
	        return str;
	}

}