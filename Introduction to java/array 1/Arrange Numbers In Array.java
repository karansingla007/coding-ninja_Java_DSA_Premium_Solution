
public class Solution {
    
    public static void arrange(int[] arr, int n) {
        int index = 0;
    	for(int i=1;i<=n;i = i+2) {
            arr[index] = i; 
            index++;
        }
        if(n%2 != 0) {
            n = n-1;
        }
        for(int i=n;i>=2;i = i-2) {
            arr[index] = i;
            index++;
        }
    }
}