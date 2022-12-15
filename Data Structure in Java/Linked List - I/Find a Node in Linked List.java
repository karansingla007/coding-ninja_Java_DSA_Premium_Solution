public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        int index = 0;
        LinkedListNode<Integer> temp = head;
        while(temp != null) {
            if(n == temp.data) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        
            return -1;
        
	}
}