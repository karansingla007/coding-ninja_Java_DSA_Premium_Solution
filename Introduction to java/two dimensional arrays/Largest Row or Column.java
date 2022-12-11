
public class Solution {

	public static void findLargest(int arr[][]){
		//Your code goes here
        String ans = "row";
        int index = 0, sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            int tempRowSum = 0;
            for(int j =0;j<arr[i].length;j++) {
                tempRowSum = tempRowSum + arr[i][j];
            }
            if(tempRowSum > sum) {
                sum = tempRowSum;
                index = i;
                ans = "row";
            } 
        }
        if(arr.length > 0) {
            for(int i=0;i<arr[0].length;i++) {
            int tempSum = 0;
            for(int j =0;j<arr.length;j++) {
                tempSum = tempSum + arr[j][i];
            }
            if(tempSum > sum) {
                sum = tempSum;
                index = i;
                ans = "column";
            }
        }
        }
         
        
        System.out.print(ans + " " + index + " " + sum);
	}

}