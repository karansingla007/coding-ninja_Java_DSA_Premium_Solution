import java.util.Arrays;
public class solution {

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
    
    public static void quickSort(int[] input, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int x = partition(input, si, ei);
        quickSort(input, si, x-1);
        quickSort(input, x+1, ei);
    }
    
	public static int maximumProfit(int arr[]) {
		// Write your code here
        // quickSort(input, 0, arr.length - 1);
       Arrays.sort(arr);
        int n = arr.length;
        int max = -1;
        for(int i=0;i<n;i++) {
        	int tempMax = arr[i] * (n - i);
            max = max > tempMax ? max : tempMax;
        }        
		return max;

	}

}