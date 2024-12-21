package com.ssb.dsa.study.linkedlist;

public class HairNTortoise {
	
	public static void main(String[] args) {
		
		 int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
		 
		// Create the head node
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        
        // Create the remaining nodes
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        
        System.out.println(hasCycle(head));
	}

    public static boolean hasCycle(ListNode head) {
    	ListNode slow = head;
        if(head.next==null){
            return false;
        }
    	ListNode fast = head.next.next;
    	
    	while(fast!=null && slow!=null && fast.next!=null) {
    		if (fast == slow) {
				return true;
			}
    		slow = slow.next;
    		fast = fast.next.next;
    	}
		return false;
    }
}
