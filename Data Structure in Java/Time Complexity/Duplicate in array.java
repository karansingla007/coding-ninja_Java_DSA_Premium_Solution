import java.util.HashMap;
import java.util.Map;
public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
          
        //use for loop to pull the elements of array to hashmap's key  
        for (int i = 0; i < arr.length; i++) {   
            if(hashmap.containsKey(arr[i])) {
                int value = hashmap.get(arr[i]);
             	hashmap.put(arr[i], value + 1);    
            } else {
                hashmap.put(arr[i], 1); 
            }
        }
        
     	
        for (Map.Entry me : hashmap.entrySet()) {
        	int temp = (Integer)(me.getValue());
            int tempKey = (Integer)(me.getKey());
            if(temp > 1) {
                return tempKey;
            }
          
        }

        
        return 0;
	}
}