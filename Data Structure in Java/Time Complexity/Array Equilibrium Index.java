public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        
        if(arr.length == 1) {
            return 0;
        }
        
        int sum = 0, sumL = 0, sumR = 0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        
        for(int i=1;i<arr.length - 1;i++) {
            sumL = sumL + arr[i-1];   
            sumR = sum - sumL - arr[i];
            if(sumR == sumL) {
                return i;
            }
        }
        return -1;
        
	}
}