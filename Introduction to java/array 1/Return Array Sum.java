public class Solution {
	
	public static int sum(int[] arr) {
		//Your code goes here
        
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        return sum;
	}
}