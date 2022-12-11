import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println('*');
        for(int i=0;i<n;i++) {
        	System.out.print('*');
            for(int j = 0;j<= i;j++) {
                System.out.print(j+1);
            }
             for(int j = i;j> 0;j--) {
                System.out.print(j);
            }
             System.out.print('*');
               System.out.println();
        }
        int m = n - 1;
        for(int i=m-1;i>=0;i--) {
        	System.out.print('*');
            for(int j = 0;j<= i;j++) {
                System.out.print(j+1);
            }
            for(int j = i;j> 0;j--) {
                System.out.print(j);
            }
             System.out.print('*');
               System.out.println();
        }
        System.out.print('*');
    }
}