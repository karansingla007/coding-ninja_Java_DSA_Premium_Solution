public class Solution {
	public static int count(int n){
		//Write your code here
        if(n < 10) {
            // System.out.println("call return");
            return 1;
        }
        int x = n/10;
        // System.out.println("x = " + x);
        int ans = count(x) + 1;
        // System.out.println(ans);
        return ans;

}
}