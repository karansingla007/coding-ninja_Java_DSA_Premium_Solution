import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        for(int i=a;i<=b;i=i+c) {
            System.out.println(i + " " + (int)((i - 32)*(5/9f)));
        }
		
	}

}
