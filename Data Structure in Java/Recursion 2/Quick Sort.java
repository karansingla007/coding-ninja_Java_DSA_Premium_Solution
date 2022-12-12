/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
	
    public static int partition(int[] input, int si, int ei) {
        int count = 0;
        int pivot = input[si];
        for(int i=si+1;i<=ei;i++) {
            if(input[i]<pivot) {
                count++;
            }
        }
        int temp = input[si + count];
        input[si + count] = pivot;
        input[si] = temp;
        
        int i = si, j = ei;
        
        while(i<j) {
            if(input[i] < pivot) {
                i++;
            } else if(input[j] >= pivot) {
                j--;
            } else {
                temp = input[i];
        		input[i] = input[j];
        		input[j] = temp;
                i++;
                j--;
            }
        }
        return si + count;
    }
    
    public static void quick(int[] input, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int x = partition(input, si, ei);
        quick(input, si, x-1);
        quick(input, x+1, ei);
    }
    
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        
        quick(input, 0, input.length - 1);
		
	}
	
}