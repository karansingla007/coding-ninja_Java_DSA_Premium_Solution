import java.util.Scanner;
import java.io.*; 
import java.util.*; 
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
  Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    ArrayList arr = new ArrayList(); 
		    
		    int i = n, ans = 0;
	        while(i!=0) {
	           int lastDigit = i % 2;
	           arr.add(lastDigit);
	           i = i/2;
	        }
	        if(arr.isEmpty()) {
	        	System.out.print(0);
	        } else {
	        	for(int j=arr.size() -1 ;j>=0;j--) {
		        	System.out.print(arr.get(j));	
		        }	
	        }	}
}
