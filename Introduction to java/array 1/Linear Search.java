public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        for(int i=0;i<arr.length;i++) {
            if(x == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}