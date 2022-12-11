
public class Solution {

	public static void spiralPrint(int arr[][]){
		//Your code goes here
        if(arr.length > 0) {
            int count = 0;
        int n = arr.length, m = arr[0].length;
        int tempn = n, tempm = m;
        int noOfRotaion = 0;
        int i = 0, j = 0;
        String direction = "right";
       while(count < n * m) {
           // System.out.println(i + " " + j);
           System.out.print(arr[i][j] + " ");
           count++;
           if(direction.equals("right") && j < tempm) {
            	j++;
               if(j == tempm) {
                   direction = "down";
                   j--;
                   i++;
               }
           } else if(direction.equals("down") && i < tempn) {
               i++;
                if(i == tempn) {
                   direction = "left";
                   i--;
                    j--;
               }
           } else if(direction.equals("left") && j >= 0) {
               j--;
               if(j == noOfRotaion - 1) {
                   direction = "up";
                   j++;
                   i--;
               }
           } else if(direction.equals("up") && i > 0) {
               i--;
               if(i == noOfRotaion) {
                   noOfRotaion++;
                   tempn--;
                   tempm--;
                   direction = "right";
                   i++;
                   j++;
               }
           }
       }
        }
	}
}