public class Solution {

    
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        int length = 0;
        LinkedListNode<Integer> temp = head;
        
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        // System.out.println("length = " + length);
        
        temp = head;
        int index = 0;
        LinkedListNode<Integer> centerNode = head;
        LinkedListNode<Integer> prevNode = null;
        LinkedListNode<Integer> lastPrevNode = null;
        LinkedListNode<Integer> lastNode = null;
        
        while(temp != null && index < length) {
            
            if(index > (length + 1)/2) {
                prevNode.next = lastPrevNode;
            }
            
             if(index == (length + 1)/2) {
                 // System.out.println("center node = " + prevNode.data);
                prevNode.next = null;
            }
            
            if(temp.next == null) {
                lastNode = temp;
                temp.next = prevNode;
                // System.out.println("lastNode = " + lastNode.data);
            }
            
            
            // System.out.println();
            lastPrevNode = prevNode;
            prevNode = temp;
            temp = temp.next;
            index++;
           
        }
        temp = head;
        
        while(temp != null) {
            // System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
        temp = head;
        
        while(temp != null && lastNode != null) {
            // System.out.println(temp.data + " " + lastNode.data);
            if(temp.data != lastNode.data && temp != null) {
                return false;
            }
            temp = temp.next;
            lastNode = lastNode.next;
        }
        
        return true;
	}

}