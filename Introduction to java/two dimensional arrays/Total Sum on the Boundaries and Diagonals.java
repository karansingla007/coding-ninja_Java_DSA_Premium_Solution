
public class Solution {

	public static void totalSum(int[][] arr) {
		//Your code goes here
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(j == i || i +j == arr.length - 1) {
                    // System.out.println(arr[i][j]);
                    sum = sum + arr[i][j];
                } else if(j == 0 || i==0 || i== arr.length - 1 || j == arr.length - 1) {
                    // System.out.println(arr[i][j]);
                    sum = sum + arr[i][j];
                }
                
            }
        }
        System.out.print(sum);
	}

}