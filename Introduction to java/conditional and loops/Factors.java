import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        for(int i=2;i<=a/2;i++) {
            if(a%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}