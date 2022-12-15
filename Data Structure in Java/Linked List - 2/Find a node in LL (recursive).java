public class Solution {


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        int index = 0;
        while(head != null) {
            // System.out.println(head.data);
            if(head.data == n) {
                return index;
            }
            index++;
            head = head.next;
        }
        return -1;
	}

}