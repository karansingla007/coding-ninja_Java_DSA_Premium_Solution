import java.util.HashMap;
import java.util.TreeMap;
import java.util.*;

public class Polynomial {

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
 	protected HashMap<Integer, Integer> coeffDegree = new HashMap<Integer, Integer>();
    
    
	public void setCoefficient(int degree, int coeff) {
        coeffDegree.put(degree, coeff);
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		ArrayList<Integer> sortedKeys
            = new ArrayList<Integer>(this.coeffDegree.keySet());
 
        Collections.sort(sortedKeys);
        for (Integer x : sortedKeys)
            System.out.print(this.coeffDegree.get(x) + "x" + x + " ");
        
    		// for (Map.Entry<Integer, Integer> entry : this.coeffDegree.entrySet()) {
    		// Integer key = entry.getKey();
    		// Integer value = entry.getValue();
    		// System.out.print(value + "x" + key + " ");
		}
        

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        Polynomial result = new Polynomial();
    	
        for (Map.Entry<Integer, Integer> entry : this.coeffDegree.entrySet()) {
    		Integer key = entry.getKey();
    		Integer value = entry.getValue();
            if(p.coeffDegree.containsKey(key)) {
                int resultCoeff = value + p.coeffDegree.get(key);
                if(resultCoeff != 0)
            		result.coeffDegree.put(key, resultCoeff);
            } else {
                int resultCoeff = value;
                if(resultCoeff != 0)
            		result.coeffDegree.put(key, resultCoeff);
            }
		}
        for (Map.Entry<Integer, Integer> entry : p.coeffDegree.entrySet()) {
    		Integer key = entry.getKey();
    		Integer value = entry.getValue();
            if(!this.coeffDegree.containsKey(key)) {
                int resultCoeff = value;
                if(resultCoeff != 0)
            		result.coeffDegree.put(key, resultCoeff);
            }
		}
        
        return result;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		Polynomial result = new Polynomial();
    	
        for (Map.Entry<Integer, Integer> entry : this.coeffDegree.entrySet()) {
    		Integer key = entry.getKey();
    		Integer value = entry.getValue();
            if(p.coeffDegree.containsKey(key)) {
                int resultCoeff = value - p.coeffDegree.get(key);
                if(resultCoeff != 0)
            		result.coeffDegree.put(key, value - p.coeffDegree.get(key));
            } else {
                int resultCoeff = value;
                if(resultCoeff != 0)
            		result.coeffDegree.put(key, value);
            }
		}
        for (Map.Entry<Integer, Integer> entry : p.coeffDegree.entrySet()) {
    		Integer key = entry.getKey();
    		Integer value = entry.getValue();
            if(!this.coeffDegree.containsKey(key)) {
                int resultCoeff = 0 - value;
                if(resultCoeff != 0)
            		result.coeffDegree.put(key, 0-value);
            }
		}
    
        return result;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial result = new Polynomial();
    	
        for (Map.Entry<Integer, Integer> entry1 : this.coeffDegree.entrySet()) {
    		Integer key1 = entry1.getKey();
    		Integer value1 = entry1.getValue();
            
            for (Map.Entry<Integer, Integer> entry2 : p.coeffDegree.entrySet()) {
                Integer key2 = entry2.getKey();
    			Integer value2 = entry2.getValue();
                if(result.coeffDegree.containsKey(key1 +key2)) {
                    int resultCoeff = result.coeffDegree.get(key1+key2) + (value1 * value2);
                    if(resultCoeff != 0)
                    	result.coeffDegree.put(key1 +key2, resultCoeff);
                } else {
                    int resultCoeff = value1 * value2;
                    if(resultCoeff != 0)
                 		result.coeffDegree.put(key1 +key2, resultCoeff);   
                }
            }
           
		}
        return result;
	}

}