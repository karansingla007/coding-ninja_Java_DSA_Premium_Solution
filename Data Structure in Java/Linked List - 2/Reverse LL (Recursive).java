public class Solution {

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null){
            return head;
        }
        LinkedListNode<Integer> newHead = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> nextNode = head.next;
        nextNode.next = head;
        head.next = null;
        
        return newHead;
	}

}