import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
        int c = s.nextInt();
        int ans = 1;
        if(c == 1) {
            ans = 0;
            for(int i=1;i<=n;i++) {
                ans = ans + i;
            }
        } else if(c == 2) {
             for(int i=1;i<=n;i++) {
                ans = ans * i;
            }
        } else {
            ans = -1;
        }
        System.out.print(ans);
	}
}
