public class Solution{  
    
    public static Boolean isElementPresent(int value, int[] arr) {
        for(int i=0;i<arr.length;i++) {
                if(value == arr[i]) {
                    arr[i] = -1;
                    return true;
                }
            }
        return false;
    }
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
            for(int i=0;i<arr1.length;i++) {
                if(isElementPresent(arr1[i], arr2)) {
                    System.out.print(arr1[i] + " ");
                    arr1[i] = -1;
                }
            }
        
    }
}