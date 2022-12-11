import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1, b = 1;
       
            for(int i=0;i<n-2;i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(b);
		
	}

}