import java.util.Scanner;
public class Solution {

     static Boolean isNotPrime(int x) {
		 int i = 2;
		while(i<=x/2) {
			if(x%i == 0) {
//				System.out.println("###### " + x);
				return true;
			}
			i++;
		}
		return false;
	}
    
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        System.out.println(2);
	        for(int i=3;i<=n;i++) {
//	        	System.out.println("loop " + i);
	            if(!isNotPrime(i)) {
	                System.out.println(i);
	            }
	        }
		
	}
}