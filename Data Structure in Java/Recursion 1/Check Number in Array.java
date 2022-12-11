public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        if(input.length == 1) {
            // System.out.print("input = " + input[0]);
            if(input[0] == x) {
            return true;
        } else {
                return false;
            }
        }
        
        if(input[0] == x) {
            // System.out.print("input = " + input[0]);
            return true;
        }
        
        int temp[] = new int[input.length - 1];
        
        for(int i=0;i<input.length - 1;i++) {
            temp[i] = input[i + 1];
        }
        
		return checkNumber(temp, x);
	}
}