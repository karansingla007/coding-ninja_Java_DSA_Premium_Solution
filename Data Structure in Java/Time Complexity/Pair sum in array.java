import java.util.HashMap;
public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i=0;i<arr.length;i++) {
            if(hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
             hashMap.put(arr[i], 1);  
            }
        }
        
        for(int i=0;i<arr.length;i++) {
            // System.out.println("arr = " + arr[i]);
            if(hashMap.containsKey(num - arr[i])) {
                // System.out.println(hashMap.get(num - arr[i]));
                count = count + hashMap.get(num - arr[i]);
            }
            if(num - arr[i] == arr[i]) {
                count--;
            }
            
        }
        return count/2;
        
        
	}
}