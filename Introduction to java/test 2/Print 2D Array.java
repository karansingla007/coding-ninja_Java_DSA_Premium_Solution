public class solution {
    
    public static int factorial(int value) {
		int ans = 0;
		
		while(value > 0) {
			ans = ans + value;
			value--;
		}
		return ans;
		
	}
    
    	public static void printArray(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
            	System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
    
	public static void print2DArray(int arr[][]) {
		// Write your code here
      int n = arr.length, m = arr[0].length;
		int size = factorial(n);
        // System.out.println(size);
        int ans[][] = new int[size][m];
        int index = 0, count = 0;
        for(int i=0;i<size;i++) {
            for(int j=0;j<m;j++) {
            	ans[i][j] = arr[index][j];
            }
            count++;
            if(n == count) {
            	index++;
            	count = 0;
            	--n;
            }
        }
        printArray(ans);

	}
}