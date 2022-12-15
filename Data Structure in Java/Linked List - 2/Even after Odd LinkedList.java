public class Solution {

    
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		LinkedListNode evenStart = null;
        LinkedListNode evenEnd = null;
        LinkedListNode oddStart = null;
        LinkedListNode oddEnd = null;
        LinkedListNode<Integer> currentNode = head;
         
        while(currentNode != null) {
            int element = currentNode.data;
             
            if(element % 2 == 0) {
                 
                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }
                 
            } else {
                 
                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
                        // Move head pointer one step in forward direction
            currentNode = currentNode.next;   
        }
         
         
        if(oddStart == null) {
            return evenStart;
        } else if(evenStart == null){
            return oddStart;
        }
         
        evenEnd.next = null;
        oddEnd.next = evenStart;
        head=oddStart;
        return head;
	}
}