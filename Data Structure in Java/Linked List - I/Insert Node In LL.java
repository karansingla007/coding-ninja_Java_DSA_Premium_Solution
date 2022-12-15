public class Solution {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
        int index = 0;
        LinkedListNode<Integer> temp = head;
        while(temp != null && index < pos - 1) {
            temp = temp.next;
            index++;
        }
        // System.out.println(index + " " + pos);
        if(temp != null) {
         
        LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
        if(pos == 0) {
            newNode.next = temp;
            head = newNode;
        } else {
         newNode.next = temp.next;
        temp.next = newNode;   
        }
        }
        return head;
	}
}