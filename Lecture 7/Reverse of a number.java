import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int i = n, ans = 0, count = 1;
	        while(i!=0) {
	           int temp = i % 10;
	           ans = ans * count + temp;
	           if(count == 1) {
	        	   count=count*10;   
	           }
	           i = i/10;
	        }
	        System.out.print(ans);
	}
}
