public class Solution {

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> smallNode = reverse(head.next);
        // System.out.println(smallNode.data + " " + head.data);
        head.next.next = head;
        head.next = null;
        return smallNode;
    }
    
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
        int count = 0;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> startNode = head;
        LinkedListNode<Integer> endNode = null;
        LinkedListNode<Integer> nxtLl = null;
        LinkedListNode<Integer> prevLastLl = null;
        
        while(temp != null) {
        
            if((k - 1 == count || temp.next == null) && k > 0) {
                endNode = temp;
                nxtLl = temp.next;                
                temp.next = null;
                
                LinkedListNode<Integer> newStart = reverse(startNode);
                
                
                if(startNode == head){
                    head = newStart;
                } else {
                    prevLastLl.next = newStart;
                }
                startNode.next = nxtLl;
                
                //// reset
                prevLastLl = startNode;
                temp = nxtLl;
                startNode = temp;
                count = 0;
            } else {
            	count++;                
            	temp = temp.next;    
            }
            
        }
        
        return head;
	}

}