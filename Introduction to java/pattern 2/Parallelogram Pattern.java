import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++) {
            for(int j = 0;j<i;j++) {
                System.out.print(' ');
            }
             for(int j = 0;j< n;j++) {
                System.out.print('*');
            }
               System.out.println();
        }
	}
}
