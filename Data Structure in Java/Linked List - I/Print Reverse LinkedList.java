public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
        if(root == null) {
            return;
        }
        printReverse(root.next);
        System.out.print(root.data + " ");
	}

}