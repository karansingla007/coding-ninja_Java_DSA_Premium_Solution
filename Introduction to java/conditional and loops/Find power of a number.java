import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        	Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        long b = s.nextInt();
        long temp = a;
        
        for(int i=0;i<b-1;i++) {
            a = a * temp;   
        }
        if(b == 0) {
            System.out.print(1);
        } else {
            System.out.print(a);
        }
	}
    }