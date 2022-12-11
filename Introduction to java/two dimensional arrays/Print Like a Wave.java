
public class Solution {

	public static void wavePrint(int arr[][]){
		//Your code goes here
        if(arr.length > 0) {
            for(int i =0;i<arr[0].length;i++) {
            if(i < arr[0].length) {
        		for(int j=0;j<arr.length;j++) {
                     // System.out.println("1st " + j + " " + i);
                	System.out.print(arr[j][i] + " ");
            	}
                // System.out.println();
            	i++;
                if(i < arr[0].length) {
                for(int j=arr.length - 1;j>=0;j--) {
                    // System.out.println("2nd " + j + " " + i);
                	System.out.print(arr[j][i] + " ");
            	}    
                }
            	
            }
           
        }
        }
        
	}

}