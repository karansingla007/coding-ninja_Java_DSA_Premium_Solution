
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        if(n == 1)  {
            return m;
        }
        int value = multiplyTwoIntegers(m, n-1);
        return value + m;
	
	}
}
