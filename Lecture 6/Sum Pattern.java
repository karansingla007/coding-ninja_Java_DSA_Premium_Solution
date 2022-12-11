import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++) {
        	sum = sum + i + 1;
            for(int j = 0;j<=i;j++) {
                System.out.print(j+1);
                if(j==i) {
                	System.out.print('=');	
                } else {
                	System.out.print('+');
                }
            }
            System.out.print(sum);
               System.out.println();
        }
	}
}