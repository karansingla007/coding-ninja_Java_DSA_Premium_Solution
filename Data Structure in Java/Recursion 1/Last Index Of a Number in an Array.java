
public class Solution {

    public static int lastIndexRecurssion(int input[], int x, int si) {
        if(si == input.length) {
         	return -1;   
        }
        
        if(input[si] == x) {
            int temp = lastIndexRecurssion(input,x,si+1);
            return temp > si ? temp : si;
        } else {
         	return lastIndexRecurssion(input, x, si+1);
        }
    }
    
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return lastIndexRecurssion(input, x, 0);
        
	}
	
}