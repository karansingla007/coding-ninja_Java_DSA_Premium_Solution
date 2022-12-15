
public class solution {
    
    public static boolean isSplitArray(int[] arr, int n, int start, int lSum, int rSum) {
            if(start == n) {
                return lSum == rSum;
            } else if(arr[start]%3 == 0) {
                lSum = lSum + arr[start];
            } else if(arr[start]%5 ==0) {
                rSum = rSum + arr[start];
            } else {
                return isSplitArray(arr, n, start + 1, lSum + arr[start], rSum) 
                    || isSplitArray(arr, n, start + 1, lSum, rSum + arr[start]);
            }
        return isSplitArray(arr, n, start + 1, lSum, rSum);
        }
        
    
        
        public static boolean splitArray(int input[]) {
    
           return isSplitArray(input, input.length, 0, 0, 0);
        }
        
    
    }