public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int n = arr.length, max = Integer.MIN_VALUE;
        int temp = max;
        for(int i=0;i<n;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++) {
            if(arr[i] != max && arr[i] > temp) {
                temp = arr[i];
            }
        }
        
        if(temp == max) {
            return -2147483648;
        } else {
         return temp;   
        }
    }

}