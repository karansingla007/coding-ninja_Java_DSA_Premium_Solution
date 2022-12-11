import java.util.*;
public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
      String ans = "", temp = "";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(temp == "" || !temp.equals(str.substring(i, i+1))) {
				if(!temp.equals(str.substring(i, i+1)) && temp != "" && count > 1) {
					ans = ans + count;	
				}
				temp = str.substring(i, i+1);
				ans = ans + temp;
				
				count = 0;
			}
			if(temp.equals(str.substring(i, i+1))) {
				count++;
			}
		}
		if(count > 1) {
		ans = ans + count;
		}
		// System.out.print("output = ");
		// System.out.print(ans);
        return ans;
	}

}