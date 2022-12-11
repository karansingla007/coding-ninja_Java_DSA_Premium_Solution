
public class Solution {

    public static void printarray(int arr[]) {
         for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int digit1 = 0, digit2 = 0;
        for(int i=0;i<arr1.length;i++) {
            digit1 = digit1 * 10 + arr1[i];
        }
        
        for(int i=0;i<arr2.length;i++) {
            digit2 = digit2 * 10 + arr2[i];
        }
        
        int sum = digit1 + digit2;
        int count = 0, tempSum = sum;
        
          while(tempSum != 0) {
         	tempSum = tempSum/10;   
            count++;
        }
        
        int[] tempOutput = new int[count];
        count = 0;
        while(sum != 0) {
            tempOutput[count] = sum%10;
         	sum = sum/10;   
            count++;
        }
        
    
        count = output.length - 1;
        for(int i=0;i<tempOutput.length;i++) {
            output[count] = tempOutput[i];
            count--;
        }
    }

}