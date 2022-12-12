
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int[] tempArr = new int[arr.length];
        int k =0;
        for(int i=d;i<arr.length;i++) {
            tempArr[k] = arr[i];
            k++;
        }
        for(int i=0;i<d;i++) {
            tempArr[k] = arr[i];
            k++;
        }
        
        for(int i=0;i<tempArr.length;i++) {
            arr[i] = tempArr[i];
        
        }
    }

}