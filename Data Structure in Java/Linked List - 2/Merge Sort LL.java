public class Solution {

    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        LinkedListNode<Integer> ans = null;
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> temp1 = head1;
        LinkedListNode<Integer> temp2 = head2;
        
        // System.out.println("head1 = " + head1.data + " head2 = " + head2.data);
        while(temp1 != null && temp2 != null) {
            if(temp1.data < temp2.data) {
               if(ans == null) {
                   ans = temp1;
                   tail = temp1;
                   temp1 = temp1.next;
               } else {
                   LinkedListNode<Integer> nextNode = temp1.next;
                   tail.next = temp1;
                   tail = temp1;
                   temp1 = nextNode;
               }
            } else {
               if(ans == null) {
                   ans = temp2;
                   tail = temp2;
                   temp2 = temp2.next;
               } else {
                   LinkedListNode<Integer> nextNode = temp2.next;
                   tail.next = temp2;
                   tail = temp2;
                   temp2 = nextNode;
               }
            }
        }

        
        if(ans == null) {
        	if(temp2 != null) {
                ans = temp2;
           	} else {
                ans = temp1;
            }
        } else {
            if(temp1 != null) {
            tail.next = temp1;
        }
        
        if(temp2 != null) {
            tail.next = temp2;
        }
        }
        
        
        return ans;
    }
    
     public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        if(head == null) {
            return head;
        }
        while(fast.next != null) {
            
            fast = fast.next.next;
            if(fast == null) {
                return slow;
            }
            slow = slow.next;
        }
        return slow;
    }
    
    public static void print(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        System.out.print("print elements = ");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> midNode = midPoint(head);
        
        // System.out.println("mid point = " + midNode.data);
        
        LinkedListNode<Integer> temp = midNode.next;
        midNode.next = null;
        
        LinkedListNode<Integer> left = mergeSort(head);
        LinkedListNode<Integer> right = mergeSort(temp);
        
        // System.out.println("head");
        // print(head);
        // System.out.println();
        // System.out.println("temp");
        // print(temp);
        // System.out.println();
        
        LinkedListNode<Integer> ans = merge(left, right);
        
        // print(ans);
        // System.out.println();
        return ans;
	}

}