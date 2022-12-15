public class Solution {
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        if(head == null) {
            return head;
        }
        while(fast.next != null) {
            
            fast = fast.next.next;
            if(fast == null) {
                return slow;
            }
            slow = slow.next;
        }
        return slow;
    }

}