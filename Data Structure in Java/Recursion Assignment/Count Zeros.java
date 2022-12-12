
public class solution {

    public static int convertStringToIntRec(String input){
		// Write your code here
        
        if(input.length() == 0) {
            return 0;
        }

        int value = convertStringToIntRec(input.substring(1));
        
        int temp = Integer.parseInt(String.valueOf(input.charAt(0)));  
        if(temp != 0) {
            
            return temp + value * 10;
        } else {
            return value;
        }
	}
    
	public static int convertStringToInt(String input){
		// Write your code here
        
        return convertStringToIntRec(input);
	}
    
}
