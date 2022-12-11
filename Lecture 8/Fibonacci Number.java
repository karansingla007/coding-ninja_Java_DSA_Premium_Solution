
public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/

        int a = 1, b = 1;
        while(b > 0) {
            if(b == n || n == 0) {
                return true;
            } else if(b > n) {
                return false;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
	}
	

}
