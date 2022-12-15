
public class Solution {
	public static boolean checkSequence(String a, String b) {
		
        int firstIndex = -1;
		int temp = -1;
        for(int i=0;i<b.length();i++) {
            if(a.indexOf(b.charAt(i)) >= 0) {
                firstIndex = a.indexOf(b.charAt(i), temp+1);
                // System.out.println("firstIndex= " + firstIndex + " temp= " + temp);
            	if(firstIndex < 0) {
                    return false;
                }
            	temp = firstIndex;
            } else {
            	return false;
            }
        }
        return true;

	}
}