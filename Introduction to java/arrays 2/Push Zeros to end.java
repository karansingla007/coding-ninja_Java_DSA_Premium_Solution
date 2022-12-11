public class Solution {  

    public static void printArray(int[] arr3) {
        for(int i=0;i<arr3.length;i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }
   
   public static void pushZerosAtEnd(int[] arr) {
       //Your code goes here
       int n = arr.length;
      int i=0, count =0;
       while(i < n) {
           if(arr[i] != 0) {
               arr[count] = arr[i];
               count++;
           }
           i++;
       }
       while(count < n) {
           arr[count] = 0;
           count++;
       }
   }

}