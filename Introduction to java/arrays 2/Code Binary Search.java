
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int start = 0, end = arr.length - 1;
        int mid;
        while(start <= end) {
            mid = (start + end) / 2;
            if(arr[mid] == x) {
                return mid;
            } else if(arr[mid] < x) {
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}