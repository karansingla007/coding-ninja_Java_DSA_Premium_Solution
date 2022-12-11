
public class Solution {

    public static int fidIndexRecursion(int input[], int x , int si) {
        // System.out.println(si);
        if(si == input.length) {
            return -1;
        }
        if(input[si] == x) {
            return si;
        }

        return fidIndexRecursion(input, x, si+1);
    }
    
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return fidIndexRecursion(input, x, 0);
		
	}
	
}