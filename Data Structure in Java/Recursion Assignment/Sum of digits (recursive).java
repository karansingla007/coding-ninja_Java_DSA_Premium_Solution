
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
        if(input < 10) {
            return input;
        }
        int value = sumOfDigits(input/10);
        return value + input %10;
        
	}
}
