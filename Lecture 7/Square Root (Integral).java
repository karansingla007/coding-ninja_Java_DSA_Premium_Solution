import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
         Scanner s = new Scanner(System.in);
		    int n = s.nextInt();

		    int i = 1;
	        while(i>0) {
	           if(i*i > n) {
	        	   break;
	           }
	           i++;
	        }
	        System.out.print(i-1);
	}
}