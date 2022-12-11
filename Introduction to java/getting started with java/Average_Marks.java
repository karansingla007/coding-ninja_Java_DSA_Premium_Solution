import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        String name;
        int ts1, ts2, ts3;
        Scanner s = new Scanner(System.in);
        name = s.next();
        ts1 = s.nextInt();
        ts2 = s.nextInt();
        ts3 = s.nextInt();
        
        System.out.println(name);
        System.out.print((ts1+ts2+ts3)/3);
		
	}

}
