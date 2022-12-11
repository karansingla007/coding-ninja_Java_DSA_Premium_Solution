public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        
        int count = 0;
        for(int i=0;i<arr.length - 2;i++) {
            for(int j = i + 1;j<arr.length - 1;j++) {
                for(int k = j + 1; k<arr.length; k++) { 
                    if((arr[i] + arr[j] + arr[k]) == x) {
                    count++;
                }
                }
            }
        }
        return count;
        
    }

}