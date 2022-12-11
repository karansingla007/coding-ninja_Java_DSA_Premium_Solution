public class Solution {

	public static void leaders(int[] arr) {
	int n = arr.length;
		for(int i=0;i<n-1;i++) {
			Boolean isLeader = true;
			for(int j = i+1;j<n;j++) {
				if(arr[i] < arr[j]) {
					isLeader = false;
					break;
				}
			}
			if(isLeader) {
			System.out.print(arr[i] + " ");
			}
		}
		System.out.print(arr[n-1]);
		
	}
	
}