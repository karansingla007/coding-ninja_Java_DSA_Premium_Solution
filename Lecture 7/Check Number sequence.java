import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int temp = -1;
		    Boolean ans = null;

		   for(int i=0;i<n;i++) {
			   int a = s.nextInt();  
			   if(temp != -1) {
				   if(ans == null) {
					   ans = temp > a ? false : true; 
				   } else if(ans == true) {
					   if(temp >= a) {
						   ans = null;
						   break;
					   } else {
						   ans = true;
					   }
				   } else {
					   ans = temp > a ? false : true;
				   }
			   }
			   temp = a;
		   }
        if(ans == null) {
            System.out.print(false);
        } else {
         System.out.print(true);   
        }
	}
}
