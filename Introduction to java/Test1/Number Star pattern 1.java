import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here

       Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        
	        for(int i =0;i<n;i++) {
	            for(int j = n;j>0;j--) {
	            	if(i == j-1) {
	            		System.out.print("*");	
	            	} else {
	            		System.out.print(j);	
	            	}
	            }
	            System.out.println();
	        }
	}
}