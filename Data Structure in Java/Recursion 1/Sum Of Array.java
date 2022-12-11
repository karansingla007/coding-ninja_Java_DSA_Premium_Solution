public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input.length == 1) {
            return input[0];
        }
        int temp[] = new int[input.length - 1];
        
        for(int i=0;i<input.length - 1;i++) {
            temp[i] = input[i+1];
        }
		int ans = sum(temp) + input[0];
        return ans;
	}
}