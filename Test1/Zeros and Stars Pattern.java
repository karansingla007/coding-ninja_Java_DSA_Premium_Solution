import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        
	        for(int i =0;i<n;i++) {
	        	 for(int j = n;j>0;j--) {
		            	if(i == n-j) {
		            		System.out.print("*");	
		            	} else {
		            		System.out.print("0");	
		            	}
		            }
	        	 System.out.print("*");
	            for(int j = n;j>0;j--) {
	            	if(i == j-1) {
	            		System.out.print("*");	
	            	} else {
	            		System.out.print("0");	
	            	}
	            }
	            System.out.println();
	        }
		
	}	


}