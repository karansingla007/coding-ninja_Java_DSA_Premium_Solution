
public class Solution {  

    public static int findMinElementIndex(int[] arr, int x, int start) {
        int minIndex = -1, minValue = Integer.MAX_VALUE;
        for(int i = start;i<arr.length;i++) {
            if(minValue > arr[i]) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        // System.out.println(minIndex);
        return minIndex;
    }
    
    public static void printArray(int[] arr) {
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void selectionSort(int[] arr) {
    	//Your code goes here
        
        for(int i=0;i<arr.length - 1;i++) {
            int minIndex = findMinElementIndex(arr, arr[i], i+1);
            if(arr[i] > arr[minIndex]) {
                int temp = arr[minIndex];
        		arr[minIndex] = arr[i];
            	arr[i] = temp;
            	// printArray(arr);
            }
            
        }
        
    }   

}