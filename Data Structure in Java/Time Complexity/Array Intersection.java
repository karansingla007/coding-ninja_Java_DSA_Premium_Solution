public class Solution {

    public static int findPartition(int[] arr, int si, int ei) {
        int pivot = arr[si];
        int count=0;
        for(int i=si+1;i<=ei;i++) {
            if(arr[i] < pivot) {
                count++;
            }
        }
        int temp = arr[si];
        arr[si] = arr[si + count];
        arr[si + count] = temp;
        
        pivot = arr[si + count];
        
        int i = si, j = ei, k =0;
            
        while(i < j) {
            if(arr[i] < pivot) {
                i++;
            } else if(arr[j] >= pivot) {
                j--;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
        		arr[j] = temp;
                i++;
                j--;
            }
        }
        return si + count;
    }
    
    public static void quickSort(int[] arr, int si, int ei) {
        if(ei < si) {
            return;
        }
        int n = findPartition(arr, si, ei);
        quickSort(arr, si, n - 1);
        quickSort(arr, n + 1, ei);
    }
    
    public static void removeElement(int[] arr, int elementIndex) {
        for(int i=elementIndex;i<arr.length - 1;i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = arr[arr.length - 1] * 10;
    }
    
    public static boolean binarySearch(int[] arr, int element, int si, int ei) {
        int mid = (si + ei)/2;
        if(si > ei || mid > ei) {
            return false;
        }
        if(arr[mid] == element) {
            removeElement(arr, mid);
            return true;
        } else if(arr[mid] < element) {
            return binarySearch(arr, element, mid + 1, ei);
        } else {
            return binarySearch(arr, element, si, mid - 1);
        }  
    }

	public static void intersection(int[] arr1, int[] arr2) {
	    
        quickSort(arr1, 0, arr1.length - 1);
        quickSort(arr2, 0, arr2.length - 1);
        int i=0, j = 0;
        
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
            	i++;
                j++;
                // arr1.length <= i ? arr1.length - 1 : i;
                // arr2.length <= j ? arr2.length - 1 : j;
            } else if(arr1[i] < arr2[j]) {
                i++;
                // arr1.length <= i ? arr1.length - 1 : i;
            } else {
                j++;
                // arr2.length <= j ? arr2.length - 1 : j;
            }
        }
        
        // for(int i=0;i<arr1.length;i++) {
        //     if(binarySearch(arr2, arr1[i], 0, arr2.length - 1)) {       
        //         System.out.print(arr1[i] + " ");
        //     }
        // }
	}

}