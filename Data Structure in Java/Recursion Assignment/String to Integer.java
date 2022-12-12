
public class solution {
    static int tens = 10;
	public static int convertStringToInt(String input){
		// Write your code here
        
        return convertStringToIntRec(input);
	}
    
    	public static int convertStringToIntRec(String input){
		// Write your code here
        
        if(input.length() == 0) {
            return 0;
        }

        int value = convertStringToIntRec(input.substring(1));
        
        int temp = Integer.parseInt(input);  
        return temp;
        
	}
}
