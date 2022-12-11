import java.util.HashMap;
import java.util.Map;
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
     HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                int temp = map.get(arr[i]);
                map.put(arr[i], ++temp);
            } else {
             map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() > 1) {
                return e.getKey();
            }
        }
        return -1;   
    }
}