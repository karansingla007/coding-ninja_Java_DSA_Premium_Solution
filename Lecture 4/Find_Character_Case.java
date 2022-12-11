import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        String strs = s.next();
        char str = strs.charAt(0);
        
        if(str >= 'A' && str <= 'Z') {
            System.out.print(1);
        } else if(str >= 'a' && str <= 'z') {
            System.out.print(0);
        } else {
            System.out.print(-1);
        }
    }
}