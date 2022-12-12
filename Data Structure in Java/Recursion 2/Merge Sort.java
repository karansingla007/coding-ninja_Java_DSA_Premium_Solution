public class solution {

    public static void merge(int[] temp1, int[] temp2, int[] input){
        int i=0, j=0, k=0;
        while(i < temp1.length && j < temp2.length) {
            if(temp1[i] < temp2[j]) {
                input[k] = temp1[i];
                i++;
                k++;
            } else {
                input[k] = temp2[j];
                j++;
                k++;
            }
        }
        
        while(i < temp1.length) {
            input[k] = temp1[i];
                i++;
                k++;
        }
        
        while(j < temp2.length) {
            input[k] = temp2[j];
                j++;
                k++;
        }
    }
    
	public static void mergeSort(int[] input){
		// Write your code here
        
        if(input.length <= 1) {
            return;
        }
        int n = input.length;
        int temp1[] = new int[n/2];
        int temp2[] = new int[n - temp1.length];
        
        for(int i=0;i<n/2;i++) {
            temp1[i] = input[i];
        }
        
        for(int i=n/2;i<n;i++) {
            temp2[i - n/2] = input[i];
        }
        
        
        mergeSort(temp1);
        mergeSort(temp2);
        merge(temp1, temp2, input);
		
	}
}
