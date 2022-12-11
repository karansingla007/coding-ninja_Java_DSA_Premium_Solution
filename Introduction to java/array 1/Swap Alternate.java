
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        for(int i=0;i<arr.length - 1;i = i+2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}