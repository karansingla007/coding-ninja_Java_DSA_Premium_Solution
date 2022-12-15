public class Solution {


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        
        LinkedListNode<Integer> newHead = deleteNodeRec(head.next, pos - 1);
        head.next = newHead;
        return head;
	}

}