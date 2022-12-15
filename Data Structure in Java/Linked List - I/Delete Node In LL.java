public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        int index = 0;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> previousNode = head;
        while(temp != null) {
            if(pos == 0) {
                return head.next;
            } else if(index == pos) {
                break;
            }
            index++;
            previousNode = temp;
            temp = temp.next;
        }
        if(temp != null) {
            previousNode.next = temp.next;
        	return head;
        } else {
            return head;
        }
        
	}
}