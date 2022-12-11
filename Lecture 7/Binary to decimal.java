import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int i = n, ans = 0, count = 1;
	        while(i!=0) {
	           int lastDigit = i % 10;
	           ans = (lastDigit * count) + ans;
	           count=count*2;   
	           i = i/10;
	        }
	        System.out.print(ans);
	}
}
