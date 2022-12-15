/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {
    static LinkedListNode<Integer> tail;
    
//     public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, Integer elem) {
//         LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(elem);
        
//         if(head == null) {
//             head = newNode;
//         } else {
//             tail.next = newNode;
//         }
//         tail = newNode;
        
//         return head;
        
//     }
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        LinkedListNode<Integer> ans = null;
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> temp1 = head1;
        LinkedListNode<Integer> temp2 = head2;
        
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

}