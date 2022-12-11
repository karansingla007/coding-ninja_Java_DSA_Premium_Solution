import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++) {
            for(int j = 0;j< n-1-i;j++) {
                System.out.print(' ');
            }
            for(int j = 0;j<= i;j++) {
                System.out.print(j+1);
            }
               System.out.println();
        }
		
	}

}

