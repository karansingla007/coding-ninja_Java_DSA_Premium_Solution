public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		
        //Your code goes here
        if(head != null && n > 0) {
            LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> newHead = temp;
        LinkedListNode<Integer> previousNewHead = temp;
        
        int length = 0;
        
        while(temp != null ) {
            temp = temp.next;
            length++;
        }
        // System.out.println("length = " + length);
        
        int index = 0;
        temp = head;
        while(temp.next != null) {
            if(index == length - n - 1) {
                newHead = temp.next;
                previousNewHead = temp;
                // break;
            }
            temp = temp.next;
            index++;
        }
        previousNewHead.next = null;
        if(temp.next == null) {
            temp.next = head;
        }
        
        return newHead;
        } else {
             return head;
        }
        
	}

}