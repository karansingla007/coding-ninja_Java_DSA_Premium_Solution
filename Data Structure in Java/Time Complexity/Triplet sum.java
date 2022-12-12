
import java.util.*;
public class Solution {	

    public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int n = arr.length;
        
        int numTriplets = 0;
        
        for (int i=0; i<n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;
            
            int start = i + 1;
            int stop = n - 1;
             
             while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                   if (arr[start] == arr[stop]) {
                       int totalCount = (stop - start) + 1;
                       numPairs += (totalCount * (totalCount - 1) / 2);
                       break;
                   }
                    
                    int tempI = start + 1;
                    int tempJ = stop - 1;
                    
                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }
                    
                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }
                    
                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;
                    
            		numPairs += (totalElementFromStart * totalElementFromEnd);
                    
                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;
    }
}