
public class Solution {

	public static void rowWiseSum(int[][] arr) {
		//Your code goes here
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++) {
                sum = sum + arr[i][j];
            }
            System.out.print(sum + " ");
            
        }
	}

}