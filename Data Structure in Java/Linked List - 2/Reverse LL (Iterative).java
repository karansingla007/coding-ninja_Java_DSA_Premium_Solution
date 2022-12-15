public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
        LinkedListNode<Integer> nextNode = null, temp = head;
        LinkedListNode<Integer> prevNode = null;
        if(head == null) {
            return head;
        }
        while(temp.next != null) {
            // System.out.println("temp data = " + temp.data);
            nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }
        // System.out.println("temp data last= " + temp.data);
        temp.next = prevNode;
        return temp;
	}
}