public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        int index = 0;
        int item = -1;
        while(head != null) {
            if(index == i) {
             item = head.data;   
            }
            // System.out.println(head.data + " "); 
            head = head.next;
            index++;
        }
        
        // System.out.println("index = " + index); 
        if(i <= index && item > 0) {
         	System.out.print(item);      
        }
	}
}