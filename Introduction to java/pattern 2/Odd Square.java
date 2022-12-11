import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        int index = 0;
        int odd = 1;
        while(index<n) {
        	a[index]=odd;
        	odd = odd +2;
        	index++;
        }
        for(int i=0;i<n;i++) {
            for(int j = i;j<n;j++) {
                System.out.print(a[j]);  
            }
            for(int j = 0;j<i;j++) {
                System.out.print(a[j]);  
            }
               System.out.println();
        }
	}
}