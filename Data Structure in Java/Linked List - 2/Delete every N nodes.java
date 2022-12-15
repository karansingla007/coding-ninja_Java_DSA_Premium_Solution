public class Solution {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
        LinkedListNode<Integer> temp = head; 
        LinkedListNode<Integer> mNodes = head; 
        int countM = 0, countN=0;
        if(M == 0) {
            return null;
        }
        while(temp != null) {
            
            while(temp!= null && countM < M - 1) {
                
            	countM++;
                temp = temp.next; 
            }
            countM = 0;
            mNodes = temp;
            // System.out.println(mNodes.data);
            while(temp!= null && countN <= N) {
                
            	countN++;
              	temp = temp.next; 
            }
            countN = 0;
            
            if(mNodes != null) {
             	mNodes.next = temp;   
            }
            // System.out.println("neeche vala = " +temp.data);
            // temp = temp.next;
        }
        return head;
	}
}