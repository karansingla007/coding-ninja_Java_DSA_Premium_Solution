public class Solution {  

    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void insertionSort(int[] arr) {

        for(int i=1;i<arr.length;i++) {
            int j = i;
            int temp = arr[i];
            while(j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j-1];
                j--;
            }
            if(j!=i) {
             	arr[j] = temp;
            }
            // printArray(arr);
        }
    }

}