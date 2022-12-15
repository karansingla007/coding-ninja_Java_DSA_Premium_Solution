public class Solution {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> temp = head;
        while(temp != null) {
            LinkedListNode<Integer> nxtNode = temp.next;
            while(nxtNode != null) {
                if(temp.data > nxtNode.data) {
                 	nxtNode = nxtNode.next;   
                }
            }
            temp = temp.next;
        }
        
	}
}