public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int zeroCount = 0;
        for(int i =0;i<arr.length;i++) {
            if(arr[i] == 0) {
                zeroCount++;
            }
        }

        for(int i=0;i<arr.length;i++) {
            if(i < zeroCount) {
             	arr[i] = 0;
            } else {
            	arr[i] = 1;
            }
        }
    }
}