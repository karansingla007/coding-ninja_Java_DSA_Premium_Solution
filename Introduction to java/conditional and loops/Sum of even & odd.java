import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int evnSum = 0, oddSum = 0;
        while(a!=0) {
            int b = a%10;
            if(b%2 == 0) {
                evnSum = evnSum + b;
            } else {
                oddSum = oddSum + b;
            }
            a = a/10;
        }
        System.out.print(evnSum + " " + oddSum);
	}
}
