import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        	 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = n, count = 0;
	        while(i!=0) {
	        	i = i/10;
	        	count++;
	        }
	        i = n;
	        int ans = 0;
	        while(i!=0) {
	        	int lastDigit = i % 10;
	        	int mult = 1;
	        	for(int j = 0;j<count;j++) {
	        		mult = mult * lastDigit;
	        	}
	        	ans = ans + mult;
	        	i = i/10;
	        }
	        System.out.print(ans == n);

	}
}