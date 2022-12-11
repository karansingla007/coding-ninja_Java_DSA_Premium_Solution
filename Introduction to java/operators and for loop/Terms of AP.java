import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int i = 1;
		    int count = 0;
	        while(count<n) {
	            int val = (3 * i) + 2;
	            if(val % 4 != 0) {
	            	System.out.print(val);
	            	System.out.print(" ");
	            	count++;
	            }
	            i++;
	        }
	}
}
