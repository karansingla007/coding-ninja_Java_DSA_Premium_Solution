import java.util.*;
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        // if(str1.length() != str2.length()) {
        //     return false;
        // }
       int n1 = str1.length();
    int n2 = str2.length();
 
    // If length of both strings is not same,
    // then they cannot be Permutation
    if (n1 != n2)
    return false;
    char ch1[] = str1.toCharArray();
    char ch2[] = str2.toCharArray();
 
    // Sort both strings
    Arrays.sort(ch1);
    Arrays.sort(ch2);
 
    // Compare sorted strings
    for (int i = 0; i < n1; i++)
    if (ch1[i] != ch2[i])
        return false;
 
    return true;
	}

}