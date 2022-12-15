public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
        
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp1 = head;
        
        if(temp != null) {
            int previousData = temp.data;
        	temp = temp.next;
        

        while(temp != null) {
            if(previousData == temp.data) {
                if(temp.next == null) {
                    temp1.next = null;
                }
            } else {
                temp1.next = temp;
                temp1 = temp;
            }
            previousData = temp.data;
            temp = temp.next;
        }
    }
        return head;
	}

}