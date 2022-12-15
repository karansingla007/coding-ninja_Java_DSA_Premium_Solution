public class Solution {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> prevI = null;
        LinkedListNode<Integer> prevJ = null;
        int index = 0;
        
        if(i == 0) {
            prevI = head;
        }
        while(temp != null && (prevI == null || prevJ == null)) {
            if(index == i -1) {
                prevI = temp;
            }
            if(index == j-1) {
                prevJ = temp;
            }
            index++;
            temp = temp.next;
        }
        // System.out.println(prevI.data);
        // System.out.println(prevJ.data);
        
        if(i == 0) {
            LinkedListNode<Integer> temp2 = prevJ.next.next;
        	prevJ.next.next = prevI.next;
        	prevI.next = temp2;
            head = prevJ.next;
            prevJ.next = prevI;
        
        } else {
            LinkedListNode<Integer> temp2 = prevJ.next;
        	prevJ.next = prevI.next;
        	prevI.next = temp2;
        
        	temp2 = prevI.next.next;
        	prevI.next.next = prevJ.next.next;
        	prevJ.next.next = temp2;
        }
        
        
        
        
        return head;
	}

}