import java.lang.Math;

public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        // System.out.println("k = " + k);
        if(k < 0) {
            return 0.0;
        }
        double smallSum = findGeometricSum(k-1);
        double value = smallSum + (1 / Math.pow(2, k));
        // System.out.println("value = " + value);
        return value;
        
	}
}